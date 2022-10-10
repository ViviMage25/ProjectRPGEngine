package me.vivimage25.rpge.gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author corey
 */
public class WorldPanel extends JPanel {
    
    public WorldPanel() {
        setupPanel();
    }
    
    private void setupPanel() {
        setBackground(Color.DARK_GRAY);
        setPreferredSize(new Dimension(1200, 600));
    }
    
}
