package me.vivimage25.rpge.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author corey
 */
public class HUDPanel extends JPanel {
    
    protected final Border compoundBorder = BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED), BorderFactory.createBevelBorder(BevelBorder.RAISED));
    protected final Font titleFont = new Font(Font.MONOSPACED, Font.BOLD, 16);
    
    private final SpringLayout sl = new SpringLayout();
    
    public HUDPanel() {
        setupPanel();
    }
    
    private void setupPanel() {
        setBackground(Color.BLACK);
        setLayout(sl);
        setPreferredSize(new Dimension(1200, 200));

        HUDPlayerStats ps = new HUDPlayerStats();
        HUDPlayerChat pc = new HUDPlayerChat();
        HUDEnemyStats es = new HUDEnemyStats();
        
        add(ps); add(pc); add(es);
        
        sl.putConstraint(SpringLayout.WEST, ps, 0, SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, ps, 0, SpringLayout.NORTH, this);
        sl.putConstraint(SpringLayout.SOUTH, ps, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.NORTH, pc, 0, SpringLayout.NORTH, this);
        sl.putConstraint(SpringLayout.WEST, pc, 0, SpringLayout.EAST, ps);
        sl.putConstraint(SpringLayout.EAST, pc, 0, SpringLayout.WEST, es);
        sl.putConstraint(SpringLayout.SOUTH, pc, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.EAST, es, 0, SpringLayout.EAST, this);
        sl.putConstraint(SpringLayout.NORTH, es, 0, SpringLayout.NORTH, this);
        sl.putConstraint(SpringLayout.SOUTH, es, 0, SpringLayout.SOUTH, this);
    }
    
    // ***** HUD Player Stats ***** //
    public class HUDPlayerStats extends JPanel {
        
        private final SpringLayout sl = new SpringLayout();
        private final TitledBorder tb = BorderFactory.createTitledBorder(compoundBorder, "Player Stats", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, titleFont, Color.DARK_GRAY);
        
        public HUDPlayerStats() {
            setupPanel();
        }
        
        private void setupPanel() {
            setBackground(Color.GREEN);
            setLayout(sl);
            setBorder(tb);
            setPreferredSize(new Dimension(300, 200));
        }
        
    }

    // ***** HUD Player Chat ***** //
    public class HUDPlayerChat extends JPanel {
        
        private final SpringLayout sl = new SpringLayout();
        private final TitledBorder tb = BorderFactory.createTitledBorder(compoundBorder, "Game Chat", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, titleFont, Color.DARK_GRAY);        
        public HUDPlayerChat() {
            setupPanel();
        }
        
        private void setupPanel() {
            setBackground(Color.GRAY);
            setLayout(sl);
            setBorder(tb);
        }
        
    }
    
    // ***** HUD Player Chat ***** //
    public class HUDEnemyStats extends JPanel {
        
        private final SpringLayout sl = new SpringLayout();
        private final TitledBorder tb = BorderFactory.createTitledBorder(compoundBorder, "Enemy Stats", TitledBorder.TRAILING, TitledBorder.DEFAULT_POSITION, titleFont, Color.DARK_GRAY);
        
        public HUDEnemyStats() {
            setupPanel();
        }
        
        private void setupPanel() {
            setBackground(Color.RED);
            setLayout(sl);
            setBorder(tb);
            setPreferredSize(new Dimension(300, 200));
        }
        
    }
    
}
