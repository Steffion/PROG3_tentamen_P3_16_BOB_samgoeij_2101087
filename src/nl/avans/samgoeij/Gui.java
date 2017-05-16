package nl.avans.samgoeij;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

public class Gui extends JFrame {
    private static final long serialVersionUID = -1553698223550264139L;
    private final BalloonPanel balloonPanel;
    private final ButtonPanel buttonPanel;

    public Gui(String name) {
        setTitle(name + " - Balloon");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        balloonPanel = new BalloonPanel(this);
        buttonPanel = new ButtonPanel(this);

        setLayout(new BorderLayout());
        add(balloonPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setPreferredSize(new Dimension(600, 550));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public BalloonPanel getBalloonPanel() {
        return balloonPanel;
    }

    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }

}
