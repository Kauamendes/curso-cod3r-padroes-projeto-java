package br.com.cod3r.decorator.swing;

import java.awt.FlowLayout;

import javax.swing.*;

public class Client {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());

		JTextArea textArea = new JTextArea(10, 30);
		JScrollPane scroll = new JScrollPane(textArea,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		//frame.add(textArea);
		frame.add(scroll);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.setVisible(true);
	}
}
