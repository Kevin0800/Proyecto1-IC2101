package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelBoard extends JPanel{
	Color Tcolor1;
	Color Tcolor2;
	Color Tcolor3;
	Color Tcolor4;
	Color Tclue1;
	Color Tclue2;
	Color Tclue3;
	Color Tclue4;

	public PanelBoard(Color Token1, Color Token2, Color Token3, Color Token4, Color Token5, Color Token6, Color Token7, Color Token8) {
		
		this.setPreferredSize(new Dimension(350,50));
		this.setMaximumSize(new Dimension(350,50));
		this.setBackground(new Color(0,0,0,0));
		
		this.Tcolor1 = Token1;
		this.Tcolor2 = Token2;
		this.Tcolor3 = Token3;
		this.Tcolor4 = Token4;
		this.Tclue1 = Token5;
		this.Tclue2 = Token6;
		this.Tclue3 = Token7;
		this.Tclue4 = Token8;
		                                                                                                                                                                                                                                                               
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(this.Tcolor1);
		g.fillOval(65, 6, 35, 35);
		g.setColor(this.Tcolor2);
		g.fillOval(110, 6, 35, 35);
		g.setColor(this.Tcolor3);
		g.fillOval(155, 6, 35, 35);
		g.setColor(this.Tcolor4);
		g.fillOval(200, 6, 35, 35);
		
		g.setColor(this.Tclue1);
		g.fillOval(250, 4, 20, 20);
		g.setColor(this.Tclue2);
		g.fillOval(275, 4, 20, 20);
		g.setColor(this.Tclue3);
		g.fillOval(250, 27, 20, 20);
		g.setColor(this.Tclue4);
		g.fillOval(275, 27, 20, 20);
	}
}

