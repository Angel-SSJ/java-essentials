package week06.swing_ui.basic_components._03_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Validation with JPasswordField");
        final JLabel tabResult = new JLabel();
        tabResult.setBounds(20, 150, 200, 50);

        final JPasswordField fieldPassword = new JPasswordField();
        fieldPassword.setBounds(100, 20, 100, 30);

        JLabel tabPassword = new JLabel("Contraseña:");
        tabPassword.setBounds(20, 20, 80, 30);

        JButton botonValidate = new JButton("Validar");
        botonValidate.setBounds(110, 60, 80, 30);


        frame.add(tabPassword,BorderLayout.CENTER);
        frame.add(fieldPassword,BorderLayout.CENTER);
        frame.add(botonValidate,BorderLayout.CENTER);
        frame.add(tabResult,BorderLayout.CENTER);

        frame.setSize(300,200);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        botonValidate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = new String(fieldPassword.getPassword());

                if (password.equals("secret")) {
                    tabResult.setText("Correct password");
                } else {
                    tabResult.setText("Incorrect password");
                }
            }
        });

    }
}