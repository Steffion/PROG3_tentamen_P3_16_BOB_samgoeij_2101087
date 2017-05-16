package nl.avans.samgoeij;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BalloonPanel extends JPanel {
	private static final long	serialVersionUID	= 2129866169026042320L;
	private boolean				balloonPopped;
	private Gui					gui;
	private int					size;
	
	public BalloonPanel(Gui gui) {
		this.gui = gui;
		
		setBackground(new Color(20, 191, 250));
		
		size = 50;
		balloonPopped = false;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (balloonPopped) return;
		
		g.setColor(Color.BLACK);
		g.fillOval((getWidth() / 2) - (size / 2), (getHeight() / 2) - (size / 2), size, size);
		g.setColor(Color.YELLOW);
		g.fillOval(((getWidth() / 2) - (size / 2)) + 3, ((getHeight() / 2) - (size / 2)) + 3, size - 6, size - 6);
	}
	
	private void popBalloon() {
		balloonPopped = true;
		
		setBackground(Color.RED);
		
		gui.getButtonPanel().setResetButton();
	}
	
	public void pumpBalloon() {
		if (size >= (50 * 5)) {
			popBalloon();
		}
		
		size = size + 50;
		repaint();
	}
	
	public void resetBalloon() {
		setBackground(new Color(20, 191, 250));
		
		size = 50;
		balloonPopped = false;
		
		gui.getButtonPanel().setPumpButton();
	}
}
