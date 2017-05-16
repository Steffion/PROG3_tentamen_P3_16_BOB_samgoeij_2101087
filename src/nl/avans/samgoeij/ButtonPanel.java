package nl.avans.samgoeij;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements ActionListener {
	private static final long	serialVersionUID	= -5596621218697621126L;
	private JButton				button;
	private Gui					gui;
	
	public ButtonPanel(Gui gui) {
		this.gui = gui;
		
		setBackground(new Color(200, 200, 200));
		
		button = new JButton("pump");
		button.addActionListener(this);
		button.setSize(80, 30);
		add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "pump":
				gui.getBalloonPanel().pumpBalloon();
				break;
			case "reset":
				gui.getBalloonPanel().resetBalloon();
				break;
		}
	}
	
	public void setPumpButton() {
		button.setText("pump");
	}
	
	public void setResetButton() {
		button.setText("reset");
	}
}
