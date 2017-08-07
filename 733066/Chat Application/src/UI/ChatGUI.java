package UI;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ChatGUI {
	public ChatGUI(String Name, DataInputStream dis, DataOutputStream dos){
		JFrame window = new JFrame(Name);
		JLabel ChatArea = new JLabel();
		JTextField ChatSpace = new JTextField();
		JButton Send = new JButton("Send");
		Send.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String Textsend = ChatSpace.getText();
				ChatArea.setText(ChatArea.getText() + "\n" + Textsend);
				
			}
		});
		window.getContentPane().add(ChatArea);
		window.getContentPane().add(ChatSpace);
		window.getContentPane().add(Send);
		window.setVisible(true);
	}
}
