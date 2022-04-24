package mvc.controle;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ConnectionUDP {
	private static int portaServidor = 9871;
	private static byte[] receiveData = new byte[1024];
	private static byte[] sendData = new byte[1024];
	private static DatagramSocket serverSocket;

   public static void main(String args[]) throws Exception
   {
      serverSocket = new DatagramSocket(portaServidor);

      while(true) {
         DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
         serverSocket.receive(receivePacket);

         InetAddress ipCliente = receivePacket.getAddress();
         int portaCliente = receivePacket.getPort();
         sendData = (new String(receivePacket.getData())).toUpperCase().getBytes();

         DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipCliente, portaCliente);
         serverSocket.send(sendPacket);
      }
   }
}
