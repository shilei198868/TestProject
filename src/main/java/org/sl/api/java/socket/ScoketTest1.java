/**
 * 
 */
package org.sl.api.java.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/** 
 *@version:v1.0.0
 * @Description:如下例子 是一个客户端程序，该程序通过 socket 连接到服务器并发送一个请求，然后等待一个响应(参考地址:http://www.runoob.com/java/java-networking.html)
 * @author:shilei
 * @date:2019年2月20日 下午7:15:36
 */
public class ScoketTest1 {

	/*
	 * @Description:(方法功能描述)
	 * @param args
	 * @date:2019年2月20日 下午7:16:32
	 */
	public static void main(String [] args)
	   {
	      String serverName = "106.14.5.66";
	      int port = 8080;
	      try
	      {
	         System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
	         Socket client = new Socket(serverName, port);
	         System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
	         OutputStream outToServer = client.getOutputStream();
	         DataOutputStream out = new DataOutputStream(outToServer);
	 
	         out.writeUTF("Hello from " + client.getLocalSocketAddress());
	         InputStream inFromServer = client.getInputStream();
	         DataInputStream in = new DataInputStream(inFromServer);
	         System.out.println("服务器响应： " + in.readUTF());
	         client.close();
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	   }
}
