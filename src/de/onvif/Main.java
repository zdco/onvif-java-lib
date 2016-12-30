package de.onvif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.StreamSetup;
import org.onvif.ver10.schema.StreamType;
import org.onvif.ver10.schema.Transport;
import org.onvif.ver10.schema.TransportProtocol;

import de.onvif.soap.OnvifDevice;

public class Main {

	private static final String INFO = "Commands:\n  \n  url: Get snapshort URL.\n  info: Get information about each valid command.\n  exit: Exit this application.";

	public static void main(String args[]) {
		InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader keyboardInput = new BufferedReader(inputStream);
		String input, cameraAddress, user, password;

		try {
			System.out.println("Please enter camera IP (with port if not 80):");
			cameraAddress = keyboardInput.readLine();
			System.out.println("Please enter camera username:");
			user = keyboardInput.readLine();
			System.out.println("Please enter camera password:");
			password = keyboardInput.readLine();
		}
		catch (IOException e1) {
			e1.printStackTrace();
			return;
		}

		System.out.println("Connect to camera, please wait ...");
		OnvifDevice cam;
		try {
			cam = new OnvifDevice(cameraAddress, user, password);
		}
		catch (ConnectException | SOAPException e1) {
			System.err.println("No connection to camera, please try again.");
			return;
		}
		System.out.println("Connection to camera successful!");

		while (true) {
			try {
				System.out.println();
				System.out.println("Enter a command (type \"info\" to get commands):");
				input = keyboardInput.readLine();

				switch (input) {
				case "url": {
					List<Profile> profiles = cam.getDevices().getProfiles();
					for (Profile p : profiles) {
						System.out.println("URL von Profil \'" + p.getName() + "\': " + cam.getMedia().getSnapshotUri(p.getToken()));
					}
					break;
				}
				case "profiles":
					List<Profile> profiles = cam.getDevices().getProfiles();
					System.out.println("Number of profiles: " + profiles.size());
					break;
				case "uri":
					StreamSetup streamSetup = new StreamSetup();
					streamSetup.setStream(StreamType.RTP_UNICAST);
					Transport transport = new Transport();
					transport.setProtocol(TransportProtocol.RTSP);
					streamSetup.setTransport(transport);
					System.out.println("Stream uri:" + cam.getMedia().getStreamUri(cam.getDevices().getProfiles().get(0), streamSetup));
					break;
				case "time":
					System.out.println("Device time:" + cam.getDevices().getDate());
					break;
				case "syntime":
					cam.getDevices().setDate();
					System.out.println("Set device time!");
					break;
				case "info":
					System.out.println(INFO);
					break;
				case "quit":
				case "exit":
				case "end":
					return;
				default:
					System.out.println("Unknown command!");
					System.out.println();
					System.out.println(INFO);
					break;
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}