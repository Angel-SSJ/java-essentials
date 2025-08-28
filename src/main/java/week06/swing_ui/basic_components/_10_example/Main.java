package week06.swing_ui.basic_components._10_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Main extends JFrame {

    JFrame frame;
    JPanel panel;

    Main(){
        frame=new JFrame("ScrollBar Dynamic");

        panel = new JPanel();
        panel.setBounds(50,50,100,100);
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);

        JScrollBar barrerHeight= new JScrollBar(JScrollBar.VERTICAL, 100, 20, 50, 200);
        barrerHeight.setBounds(300,50,20,200);
        frame.add(barrerHeight);


        JScrollBar barrerWidth= new JScrollBar(JScrollBar.HORIZONTAL, 100, 20, 50, 200);
        barrerWidth.setBounds(50,300,200,20);
        frame.add(barrerWidth);

        barrerHeight.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                panel.setSize(panel.getWidth(),barrerHeight.getValue());
            }
        });

        barrerWidth.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                panel.setSize(barrerWidth.getValue(),panel.getHeight());
            }
        });

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
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