import java.io.*;
import java.net.*;
import UI.ChatGUI;

public class ChatClient {
	public static void main(String[] args) {
		int portNum = 8211;
		Socket sock = null;
		try {
			sock = new Socket("135.135.6.42", portNum); 
			DataInputStream dis = new DataInputStream(sock.getInputStream());
			DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
			ChatGUI Client = new ChatGUI("admin",dis,dos);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
