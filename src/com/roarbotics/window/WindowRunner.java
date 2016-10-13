package com.roarbotics.window;


import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import com.roarbotics.Options;

public class WindowRunner {

	public static void run() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				GridLayout layout = new GridLayout(0, 1);
				JFrame frame = new JFrame("Scouting App");
				frame.add(new JLabel(new ImageIcon("/img/steamworks.tiff")));
				frame.setLayout(layout);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(OptionsPanel.optionsPanel());
				frame.add(ButtonPanel.buttonPanel());
				frame.setSize(Options.windowDim[0], Options.windowDim[1]);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});

	}

}
