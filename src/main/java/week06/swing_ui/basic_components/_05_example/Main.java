package week06.swing_ui.basic_components._05_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.event.*;

import javax.swing.*;

class Main extends JFrame implements ActionListener {

    JLabel label;
    JCheckBox checkBox01, checkBox02, checkBox03;
    JButton buttonOrder;

    Main(){

        label = new JLabel("Select your favorite programming languages");
        label.setBounds(20,20,300,30);

        checkBox01 = new JCheckBox("Java");
        checkBox01.setBounds(20,70,100,30);

        checkBox02 = new JCheckBox("Python");
        checkBox02.setBounds(20,120,100,30);

        checkBox03 = new JCheckBox("C++");
        checkBox03.setBounds(20,170,100,30);

        buttonOrder = new JButton("Order");
        buttonOrder.setBounds(20,220,100,30);
        buttonOrder.addActionListener(this);

        add(label);
        add(checkBox01);
        add(checkBox02);
        add(checkBox03);
        add(buttonOrder);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        float total = 0;
        String mensaje = "";

        if (checkBox01.isSelected()) {
            mensaje += "Java is so powerful! ";
        }
        if (checkBox02.isSelected()) {

            mensaje += "Python is so cool! ";
        }
        if (checkBox03.isSelected()) {

            mensaje += "C++ is so hard!";
        }

        JOptionPane.showMessageDialog(this, mensaje);
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