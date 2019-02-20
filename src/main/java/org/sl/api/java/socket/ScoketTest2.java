/**
 * 
 */
package org.sl.api.java.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/** 
 *@version:v1.0.0
 * @Description:如下例子程序是一个服务器端应用程序，使用 Socket 来监听一个指定的端口
 * @author:shilei
 * @date:2019年2月20日 下午7:19:07
 */
public class ScoketTest2 extends Thread{

	private ServerSocket serverSocket;
	   
	   public ScoketTest2(int port) throws IOException
	   {
	      serverSocket = new ServerSocket(port);
	      serverSocket.setSoTimeout(10000);
	   }
	 
	   public void run()
	   {
	      while(true)
	      {
	         try
	         {
	            System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
	            Socket server = serverSocket.accept();
	            System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
	            DataInputStream in = new DataInputStream(server.getInputStream());
	            System.out.println(in.readUTF());
	            DataOutputStream out = new DataOutputStream(server.getOutputStream());
	            out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
	            server.close();
	         }catch(SocketTimeoutException s)
	         {
	            System.out.println("Socket timed out!");
	            break;
	         }catch(IOException e)
	         {
	            e.printStackTrace();
	            break;
	         }
	      }
	   }
	   public static void main(String [] args)
	   {
	      int port = Integer.parseInt(args[0]);
	      try
	      {
	         Thread t = new ScoketTest2(port);
	         t.run();
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	   }
}
