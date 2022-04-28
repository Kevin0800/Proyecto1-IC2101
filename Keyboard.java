package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Keyboard extends JPanel {
	ActionButton button_1 = new ActionButton("   ");
	ActionButton button_2 = new ActionButton("   ");
	ActionButton button_3 = new ActionButton("   ");
	ActionButton button_4 = new ActionButton("   ");
	SendButton button_5 = new SendButton("Enviar");
	ArrayList<Color> userColors = new ArrayList<Color>();

	public Keyboard() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
		this.setSize(new Dimension(320, 150));
		this.setPreferredSize(new Dimension(320, 150));
		this.setMaximumSize(new Dimension(320, 150));

		this.setBackground(Color.WHITE);

		this.add(button_1);
		this.add(button_2);
		this.add(button_3);
		this.add(button_4);
		this.add(button_5);

		this.button_1.colorDefault(new Color(138, 43, 226));
		this.button_2.colorDefault(Color.GREEN);
		this.button_3.colorDefault(Color.GREEN);
		this.button_4.colorDefault(new Color(138, 43, 226));

	}

	public void saveColors() {
		this.userColors.add(button_1.getColor());
		this.userColors.add(button_2.getColor());
		this.userColors.add(button_3.getColor());
		this.userColors.add(button_4.getColor());

	}

}
