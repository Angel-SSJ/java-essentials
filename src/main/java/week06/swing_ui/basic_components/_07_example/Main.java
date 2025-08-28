
package week06.swing_ui.basic_components._07_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Main extends JFrame {
    private final JToggleButton toggleButton;
    private final JLabel label;

    Main(){
    setTitle("Example JToggleButton");
    setLayout(new FlowLayout());

    toggleButton = new JToggleButton("On");
    label = new JLabel("Status: On");

    toggleButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (toggleButton.isSelected()) {
                label.setText("Status: On");
                toggleButton.setText("Off");
            } else {
                label.setText("Status: Off");
                toggleButton.setText("On");
            }
        }
    });

    add(toggleButton);
    add(label);

    setSize(400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Main();
    }
}