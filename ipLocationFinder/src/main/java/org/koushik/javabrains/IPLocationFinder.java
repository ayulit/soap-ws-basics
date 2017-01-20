package org.koushik.javabrains;

public class IPLocationFinder {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You need to pass in one IP address");
		} else {
			// calling web service here ...
			String ipAddress = args[0];
			stub.getCountryName(ipAddress);
		}

	}

}
