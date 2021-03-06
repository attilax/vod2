//java检测端口号是否配占用

//java检测端口号是否被占用的工具类：

 

 

 

package com.attilax.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;

public class NetUtil {
	
	public static   ThreadLocal<HttpServletRequest> req_ThreadLocal= new ThreadLocal<HttpServletRequest>();
	
	/***
	 *  true:already in using  false:not using 
	 * @param port
	 */
	public static boolean isLoclePortUsing(int port){
		boolean flag = true;
		try {
			flag = isPortUsing("127.0.0.1", port);
		} catch (Exception e) {
		}
		return flag;
	}
	/***
	 *  true:already in using  false:not using 
	 * @param host
	 * @param port
	 * @throws UnknownHostException 
	 */
	public static boolean isPortUsing(String host,int port) throws UnknownHostException{
		boolean flag = false;
		InetAddress theAddress = InetAddress.getByName(host);
		try {
			Socket socket = new Socket(theAddress,port);
			flag = true;
		} catch (IOException e) {
			
		}
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println(isLoclePortUsing(7777));
	}
		
}
