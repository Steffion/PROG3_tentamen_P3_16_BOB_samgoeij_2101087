package nl.avans.samgoeij;

import java.awt.event.ActionEvent;

public class MainClass {
	
	public static void main(String[] args) {
		Gui gui = new Gui("Stef de Goey");
		
		int i = 0;
		while (i > 0) {
			if (i >= 5) {
				gui.getButtonPanel().actionPerformed(new ActionEvent(gui, 0, "reset"));
				i = 0;
			} else {
				gui.getButtonPanel().actionPerformed(new ActionEvent(gui, 0, "pump"));
				i++;
			}
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
