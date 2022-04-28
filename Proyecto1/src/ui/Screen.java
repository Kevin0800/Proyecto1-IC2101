package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Screen extends JPanel {
	
	PanelBoard appPanelBoard1 = new PanelBoard(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
	PanelBoard appPanelBoard2 = new PanelBoard(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
	PanelBoard appPanelBoard3 = new PanelBoard(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
	PanelBoard appPanelBoard4 = new PanelBoard(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
	PanelBoard appPanelBoard5 = new PanelBoard(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
	PanelBoard appPanelBoard6 = new PanelBoard(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
	PanelBoard appPanelBoard7 = new PanelBoard(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
	PanelBoard appPanelBoard8 = new PanelBoard(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
	PanelBoard appPanelBoard9 = new PanelBoard(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
	PanelBoard appPanelBoard10 = new PanelBoard(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
	public Screen() {
	
		this.setBorder(BorderFactory.createLineBorder(Color.GREEN,20));
		this.setSize(new Dimension(350, 600));
		this.setPreferredSize(new Dimension(350,600));
		this.setMaximumSize(new Dimension(350,650));
		
		this.setBackground(new Color(120, 120, 120));
		
		this.add(appPanelBoard1);
		
		this.add(appPanelBoard2);
		
		this.add(appPanelBoard3);
		
		this.add(appPanelBoard4);
		
		this.add(appPanelBoard5);
		
		this.add(appPanelBoard6);
		
		this.add(appPanelBoard7);
		
		this.add(appPanelBoard8);
		
		this.add(appPanelBoard9);
		
		this.add(appPanelBoard10);
		
	}
	public void changeToken(PanelBoard myPanel, ArrayList<Color> panelColors, ArrayList<Color> clueColors) {
		myPanel.Tcolor1 = panelColors.get(0);
		myPanel.Tcolor2 = panelColors.get(1);
		myPanel.Tcolor3 = panelColors.get(2);
		myPanel.Tcolor4 = panelColors.get(3);
		if(clueColors.size() == 1) {
			myPanel.Tclue1 = clueColors.get(0);
		}
		if(clueColors.size() == 2) {
			myPanel.Tclue1 = clueColors.get(0);
			myPanel.Tclue2 = clueColors.get(1);
		}
		if(clueColors.size() == 3) {
			myPanel.Tclue1 = clueColors.get(0);
			myPanel.Tclue2 = clueColors.get(1);
			myPanel.Tclue3 = clueColors.get(2);
		}
		if(clueColors.size() > 3) {
		myPanel.Tclue1 = clueColors.get(0);
		myPanel.Tclue2 = clueColors.get(1);
		myPanel.Tclue3 = clueColors.get(2);
		myPanel.Tclue4 = clueColors.get(3);
		}

	}
}