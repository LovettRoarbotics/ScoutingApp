package com.roarbotics.window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.roarbotics.json.CheckBoxReader;
import com.roarbotics.json.Exporter;

public class ButtonPanel {
	public static JPanel buttonPanel(){
		JPanel buttonPanel = new JPanel();
		JButton send = new JButton("Send Form");
		send.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					CheckBoxReader.readCheckBoxes();
					Exporter.exportJSON();
					WindowRunner.frame.dispose();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		buttonPanel.add(send);
		return buttonPanel;
	}
}
