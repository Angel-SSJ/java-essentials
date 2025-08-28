package week06.swing_ui.basic_components._09_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Main extends javax.swing.JFrame {



    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Example JToolBar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar toolbar = new JToolBar(JToolBar.VERTICAL);
        toolbar.setRollover(true);

        toolbar.add(new JButton(new AbstractAction("Save") {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save");
            }
        }));

toolbar.addSeparator();
        toolbar.add(new JButton(new AbstractAction("Print") {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Print");
            }
        }));

        Container contentPane = frame.getContentPane();
        contentPane.add(toolbar, BorderLayout.WEST);

        JTextArea textArea = new JTextArea();
        contentPane.add(textArea, BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setVisible(true);

    }
}