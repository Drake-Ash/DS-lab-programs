import java.io.*;
import java.net.*;

public class ChatServer{

	public static void main(String[] args) {
		int portNum = 8211;
		try {
			ServerSocket serverSocket = new ServerSocket(portNum);
			while(true){
				Socket sock = serverSocket.accept();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
