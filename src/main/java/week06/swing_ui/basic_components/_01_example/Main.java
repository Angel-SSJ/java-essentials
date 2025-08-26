package week06.swing_ui.basic_components._01_example;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Duke greets you");
        Icon icon = new ImageIcon("src/main/java/week06/swing_ui/basic_components/_01_example/java_logo.png");

        JLabel tabWithIcon = new JLabel(icon,SwingConstants.CENTER); //SwingConstants.CENTER this center the component
        tabWithIcon.setBounds(50,50,600,600);

        frame.add(tabWithIcon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setLayout(null);
        frame.setVisible(true);



    }
}
