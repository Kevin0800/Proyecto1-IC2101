package ui;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import logic.Computer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Grid extends JPanel{
	Screen appScreen = new Screen();
	Keyboard appKeyboard = new Keyboard();
	int counter = 0;
	int panelCounter = 9;
	ArrayList<PanelBoard> gridPanels = new ArrayList<PanelBoard>();
	Computer opponent = new Computer();
	public Grid() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.add(appScreen);
		this.add(appKeyboard);
		
		this.gridPanels.add(appScreen.appPanelBoard1);
		this.gridPanels.add(appScreen.appPanelBoard2);
		this.gridPanels.add(appScreen.appPanelBoard3);
		this.gridPanels.add(appScreen.appPanelBoard4);
		this.gridPanels.add(appScreen.appPanelBoard5);
		this.gridPanels.add(appScreen.appPanelBoard6);
		this.gridPanels.add(appScreen.appPanelBoard7);
		this.gridPanels.add(appScreen.appPanelBoard8);
		this.gridPanels.add(appScreen.appPanelBoard9);
		this.gridPanels.add(appScreen.appPanelBoard10);
		
		this.opponent.makeCode();
		System.out.println(this.opponent.colorTokens);
		this.appKeyboard.button_5.addActionListener(new ActionListener() {
			
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				appKeyboard.saveColors();
				opponent.verifyCodeR(appKeyboard.userColors);
				opponent.verifyCodeW(appKeyboard.userColors);
				appScreen.changeToken(gridPanels.get(panelCounter), appKeyboard.userColors, opponent.getClueToken());
				appScreen.updateUI();
				if(isWinner(opponent.getClueToken()) == 1) {
					JOptionPane.showConfirmDialog(null, "Has Ganado");
				}
				appKeyboard.userColors.clear();
				opponent.clueTokens.clear();
				counter ++;
				panelCounter --;
				if(counter == 10) {
					
					int pContinue = JOptionPane.showConfirmDialog(null, "Sus turnos han terminado ¿desea jugar de nuevo?");
					if(pContinue == 0) {
						MastermindProgram.main(null);
						
					}
					else {
						System.exit(0);
					}
					
				}
			}
		});
		
		
	}
	public int isWinner(ArrayList<Color> playerClues) {
		for(int i = 0; i < playerClues.size(); i++) {
			if(playerClues.get(i) != Color.red) {
				return 0;
			}
			else if(i == 4) {
				return 1;
			}
		}
		return 3;
	}

	
}
