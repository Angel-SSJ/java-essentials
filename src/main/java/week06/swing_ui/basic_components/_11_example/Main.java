package week06.swing_ui.basic_components._11_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class Main  {

    Main(){
        JFrame frame=new JFrame("Ejemplo de Separador Vertical");
        frame.setLayout(new FlowLayout());

        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");

        JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
        separator.setPreferredSize(new Dimension(5,40));


        frame.add(button1);
        frame.add(separator);
        frame.add(button2);

        frame.setSize(300,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Main();
    }
}