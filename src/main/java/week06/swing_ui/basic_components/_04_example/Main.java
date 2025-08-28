package week06.swing_ui.basic_components._04_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.event.*;

import javax.swing.*;

class Main implements ActionListener {
    JLabel tabWords, tabCharacters;
    JTextArea textArea;
    JButton countButton;

    Main() {
        JFrame frame = new JFrame("Counter of Words and Characters");

        tabWords = new JLabel("Words: ");
        tabWords.setBounds(50,25,100,30);

        tabCharacters = new JLabel("Characters: ");
        tabCharacters.setBounds(160,25,100,30);

        textArea = new JTextArea();
        textArea.setBounds(20,75,250,200);

        countButton = new JButton("Counter");
        countButton.setBounds(50,300,150,30);
        countButton.addActionListener(this);

        frame.add(tabWords);
        frame.add(tabCharacters);
        frame.add(textArea);
        frame.add(countButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        String[] words = text.trim().split("\\s+");
        int wordCount = (text.trim().isEmpty()) ? 0 : words.length;
        int charCount = text.length();

        tabWords.setText("Words: " + wordCount);
        tabCharacters.setText("Characters: " + charCount);
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