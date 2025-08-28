package week06.swing_ui.basic_components._08_example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Main implements ActionListener{

    JFrame frame;
    JMenuBar menuBar;
    JMenu archivo,editar,ayuda;
    JMenuItem cortar,copiar,pegar,seleccionarTodo;
    JTextArea areaTexto;

    Main(){
        frame = new JFrame();

        // Crear elementos de menú
        cortar = new JMenuItem("Cut");
        copiar = new JMenuItem("Copy");
        pegar = new JMenuItem("Paste");
        seleccionarTodo = new JMenuItem("Select All");

        // Añadir ActionListener a los elementos de menú
        cortar.addActionListener(this);
        copiar.addActionListener(this);
        pegar.addActionListener(this);
        seleccionarTodo.addActionListener(this);

        // Crear barra de menú
        menuBar = new JMenuBar();

        // Crear menús
        archivo = new JMenu("File");
        editar = new JMenu("Edit");
        ayuda = new JMenu("Help");

        // Añadir elementos al menú "Editar"
        editar.add(cortar);
        editar.add(copiar);
        editar.add(pegar);
        editar.add(seleccionarTodo);

        // Añadir menús a la barra de menú
        menuBar.add(archivo);
        menuBar.add(editar);
        menuBar.add(ayuda);

        // Crear área de texto
        areaTexto = new JTextArea();
        areaTexto.setBounds(5, 5, 360, 320);

        // Añadir componentes al frame
        frame.add(menuBar);
        frame.add(areaTexto);
        frame.setJMenuBar(menuBar);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cortar)
            areaTexto.cut();
        if (e.getSource() == copiar)
            areaTexto.copy();
        if (e.getSource() == pegar)
            areaTexto.paste();
        if (e.getSource() == seleccionarTodo)
            areaTexto.selectAll();
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