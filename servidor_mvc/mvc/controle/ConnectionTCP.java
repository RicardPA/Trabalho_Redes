package mvc.controle;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ConnectionTCP {
	private static int portaServidor = 6789;
	private static ServerSocket socket;

	public void openConnection() throws Exception {
		socket = new ServerSocket(portaServidor);
		
		while(true){
			Socket conexao = socket.accept();
			
			BufferedReader entrada =  new BufferedReader(new InputStreamReader(conexao.getInputStream()));
			String str = entrada.readLine();

			DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());
			saida.writeBytes(str);

			conexao.close();
		}
	}
}
