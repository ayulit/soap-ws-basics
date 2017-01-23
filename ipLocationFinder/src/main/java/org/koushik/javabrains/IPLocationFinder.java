package org.koushik.javabrains;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		
		// Setting proxy settings inside Java code
		String proxyAddr = "proxy01.merann.ru";
		String proxyPort = "8080";				
		System.setProperty("http.proxyHost", proxyAddr);
		System.setProperty("http.proxyPort", proxyPort);
		

		// calling web service here ...
		String ipAddress = "173.194.44.73"; // google - United States
		
		GeoIPService ipService = new GeoIPService();
		
		// this is our stub
		GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
		
		// stub.getCountryName(ipAddress);
		GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipAddress);
		
		// So all this is our client - we've done!
		System.out.println(geoIp.getCountryName());			


	}

}
