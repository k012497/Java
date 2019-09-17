package chapter18.host_address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Host2IPTest {

	public static void main(String[] args) throws UnknownHostException {
		String hostName = "www.google.co.kr";
		InetAddress inetAddress = InetAddress.getByName(hostName);
		System.out.println(hostName + " address is " + inetAddress.getHostAddress());
	}

}
