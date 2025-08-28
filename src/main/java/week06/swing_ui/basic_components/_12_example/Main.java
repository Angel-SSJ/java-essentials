package week06.swing_ui.basic_components._12_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  {

    JFrame frame;
    Main() {
        frame = new JFrame("Selección de Categoria");
        String[] categories = {"Tecnología", "Ciencia", "Arte", "Deportes", "Música"};

        final JLabel tag = new JLabel();
        tag.setHorizontalAlignment(JLabel.CENTER);
        tag.setSize(400, 100);

        final JComboBox<String> comboBox = new JComboBox<>(categories);
        comboBox.setBounds(50, 100, 150, 30);

        JButton btnNewButton = new JButton("Seleccionar");
        btnNewButton.setBounds(220,100, 100, 30);

        frame.add(comboBox);
        frame.add(tag);
        frame.add(btnNewButton);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String categoriaSeleccionada = "Categoría seleccionada: " + comboBox.getSelectedItem();
                tag.setText(categoriaSeleccionada);
            }
        });

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