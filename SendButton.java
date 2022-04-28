package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class SendButton extends JButton {

	public SendButton(String sendbutton) {
		super(sendbutton);
		this.setSize(new Dimension(40, 40));
		this.setPreferredSize(new Dimension(350, 30));

	}

}
