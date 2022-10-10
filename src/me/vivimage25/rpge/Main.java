package me.vivimage25.rpge;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import me.vivimage25.rpge.gui.HUDPanel;
import me.vivimage25.rpge.gui.WorldPanel;

/**
 *
 * @author corey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame frame = new JFrame("Testing...");
                frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
                frame.getContentPane().add(new WorldPanel());
                frame.getContentPane().add(new HUDPanel());
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

        });
    }
    
}
