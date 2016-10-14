package com.roarbotics.window;


import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.roarbotics.Options;

public class WindowRunner {
	
	public static JFrame frame;

	public static void run() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				GridLayout layout = new GridLayout(0, 1);
				frame = new JFrame("Scouting App");
				frame.setLayout(layout);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(OptionsPanel.robotAttributes());
				frame.add(OptionsPanel.performanceCharacteristics());
				frame.add(OptionsPanel.other());
				frame.add(ButtonPanel.buttonPanel());
				if (Options.pack){
					frame.pack();
				} else {
					frame.setSize(Options.windowDim[0], Options.windowDim[1]);
				}
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});

	}

}
