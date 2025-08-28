package week06.swing_ui.basic_components._06_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.event.*;

import javax.swing.*;


public class Main  extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3;
    JButton boton;

    Main() {
        JLabel pregunta = new JLabel("What is the language used for JVM?");
        pregunta.setBounds(50, 50, 250, 20);

        r1 = new JRadioButton("A) C++");
        r1.setBounds(50, 100, 150, 30);

        r2 = new JRadioButton("B) Java");
        r2.setBounds(50, 150, 150, 30);

        r3 = new JRadioButton("C) Python");
        r3.setBounds(50, 200, 150, 30);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(r1);
        grupo.add(r2);
        grupo.add(r3);

        boton = new JButton("Verify");
        boton.setBounds(100, 250, 100, 30);
        boton.addActionListener(this);

        add(pregunta);
        add(r1);
        add(r2);
        add(r3);
        add(boton);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (r2.isSelected()) {
            JOptionPane.showMessageDialog(this, "¡Respuesta Correcta!");
        } else {
            JOptionPane.showMessageDialog(this, "Respuesta Incorrecta.");
        }
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