import java.io.*;
import java.net.*;

class Cliente {
    private static int portaServidor = 6789;

    public static String lerString () throws Exception {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      return in.readLine();
    }

    public static void main(String argv[]) throws Exception {
	  //Efetua a primitiva socket
	  Socket socket = new Socket("192.168.56.1", portaServidor);
	  String message;
	  
	  System.out.print("Mensagem: ");
	  message = lerString();
	  
	  while (message != "stop") {  
		//Efetua a primitiva send
		DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
		System.out.print("Mensagem: ");
		saida.writeBytes(message + '\n');
		message = lerString();
		if (message != "stop") {
			socket.close();
			socket = new Socket("192.168.56.1", portaServidor);
		}
	  } 
      //Efetua a primitiva receive
      BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      System.out.println("FROM SERVER: " + entrada.readLine());

      //Efetua a primitiva close
      socket.close();
    }
}
