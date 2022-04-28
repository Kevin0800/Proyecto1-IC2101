package ui;
import logic.Computer;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MastermindProgram {
	
	public static void main(String[] args) {

		JFrame appFrame = new JFrame("Mastermind");
		appFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		Grid appGrid = new Grid();
		appFrame.add(appGrid);
		
		appFrame.setSize(new Dimension(320, 790));
		appFrame.setPreferredSize(new Dimension(320, 790));
		appFrame.setResizable(false);
		appFrame.setVisible(true);
		
		
		
		
		

	}
}