package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class ActionButton extends JButton {

	public void setColor(Color pDefinedColor) {
		this.setBackground(pDefinedColor);
	}

	ArrayList<Color> coderSlot = new ArrayList<Color>();

	int counter = 4;

	Color definedColor;

	public ActionButton(String actionButton) {
		super(actionButton);

		coderSlot.add(new Color(138, 43, 226));
		coderSlot.add(Color.ORANGE);
		coderSlot.add(new Color(51, 204, 255));
		coderSlot.add(Color.YELLOW);
		coderSlot.add(Color.GREEN);

		this.setOpaque(false);
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);
		this.setSize(30, 30);
		this.setMinimumSize(new Dimension(30, 30));
		this.setPreferredSize(new Dimension(40, 40));

		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setColor(coderSlot.get(counter));

				definedColor = coderSlot.get(counter);

				if (counter > 0) {
					counter--;

				} else {

					counter = coderSlot.size() - 1;
				}

			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.fillOval(3, -1, 29, 29);
		g.setColor(definedColor);
		g.fillOval(5, 1, 25, 25);
	}

	public void rdefaultColor(Color dColor) {
		this.setColor(dColor);
	}

	public Color getColor() {
		return this.definedColor;
	}

	public void colorDefault(Color pColorDefault) {
		this.definedColor = pColorDefault;
	}
}
