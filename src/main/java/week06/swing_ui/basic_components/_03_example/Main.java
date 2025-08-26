package week06.swing_ui.basic_components._03_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Validación de JPasswordField");
        final JLabel tabResult = new JLabel();
        tabResult.setBounds(20, 150, 200, 50);

        final JPasswordField fieldPassword = new JPasswordField();
        fieldPassword.setBounds(100, 75, 100, 30);

        JLabel tabPassword = new JLabel("Contraseña:");
        tabPassword.setBounds(20, 75, 80, 30);

        JButton botonValidate = new JButton("Validar");
        botonValidate.setBounds(110, 120, 80, 30);


        frame.add(tabPassword);
        frame.add(fieldPassword);
        frame.add(botonValidate);
        frame.add(tabResult);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        botonValidate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = new String(fieldPassword.getPassword());

                if (password.equals("secret")) {
                    tabResult.setText("Contraseña correcta");
                } else {
                    tabResult.setText("Contraseña incorrecta");
                }
            }
        });

    }
}