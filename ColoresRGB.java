import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColoresRGB implements ActionListener {

    private JFrame pantalla = new JFrame();
    private JLabel labelR, labelG, labelB;
    private JComboBox<String> comboR, comboG, comboB;
    private JButton cambiarColor, botonReset, botonRojo, botonVerde, botonAzul;

    public ColoresRGB() {
        // Configuración de la ventana
        pantalla.setLayout(null);
        pantalla.setSize(400, 400);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.setTitle("Selector de Colores RGB");
        pantalla.setLocationRelativeTo(null);
	pantalla.setResizable(false);

        labelR = new JLabel("Rojo: ");
        labelR.setBounds(100, 30, 100, 20);
	labelR.setBackground(new Color(200,200,200));
        labelR.setOpaque(true);
        pantalla.add(labelR);

        comboR = new JComboBox<>();
        comboR.setBounds(220, 30, 50, 30);
        for (int i = 0; i <= 255; i++) {
            comboR.addItem(String.valueOf(i)); // parseamos para introducir texto
        }
        pantalla.add(comboR);

        labelG = new JLabel("Verde: ");
        labelG.setBounds(100, 70, 100, 20);
	labelG.setBackground(new Color(200,200,200));
        labelG.setOpaque(true);
        pantalla.add(labelG);

        comboG = new JComboBox<>();
        comboG.setBounds(220, 70, 50, 30);
        for (int i = 0; i <= 255; i++) {
            comboG.addItem(String.valueOf(i));
        }
        pantalla.add(comboG);

        labelB = new JLabel("Azul: ");
        labelB.setBounds(100, 110, 100, 20);
	labelB.setBackground(new Color(200,200,200));
        labelB.setOpaque(true);
        pantalla.add(labelB);

        comboB = new JComboBox<>();
        comboB.setBounds(220, 110, 50, 30);
        for (int i = 0; i <= 255; i++) {
            comboB.addItem(String.valueOf(i));
        }
        pantalla.add(comboB);

        cambiarColor = new JButton("Cambiar de color");
        cambiarColor.setBounds(60, 150, 260, 30);
        pantalla.add(cambiarColor);
        cambiarColor.addActionListener(this);

	botonReset = new JButton("Reset");
        botonReset.setBounds(60, 190, 260, 30);
        pantalla.add(botonReset);
        botonReset.addActionListener(this);

	botonRojo = new JButton("Rojo");
        botonRojo.setBounds(60, 230, 260, 30);
        pantalla.add(botonRojo);
        botonRojo.addActionListener(this);

	botonVerde = new JButton("Verde");
        botonVerde.setBounds(60, 270, 260, 30);
        pantalla.add(botonVerde);
        botonVerde.addActionListener(this);

	botonAzul = new JButton("Azul");
        botonAzul.setBounds(60, 310, 260, 30);
        pantalla.add(botonAzul);
        botonAzul.addActionListener(this);

	pantalla.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Lógica para cambiar el color del fondo
	if (e.getSource() == cambiarColor) {
        	int r = Integer.parseInt((String) comboR.getSelectedItem());
        	int g = Integer.parseInt((String) comboG.getSelectedItem());
        	int b = Integer.parseInt((String) comboB.getSelectedItem());
        	pantalla.getContentPane().setBackground(new Color(r, g, b));
	}
	if (e.getSource() == botonReset) {
		comboR.setSelectedItem("0");
		comboG.setSelectedItem("0");
		comboB.setSelectedItem("0");
		pantalla.getContentPane().setBackground(new Color(240,240,240));
	}
	if (e.getSource() == botonRojo) {
		comboR.setSelectedItem("255");
		comboG.setSelectedItem("0");
		comboB.setSelectedItem("0");
		pantalla.getContentPane().setBackground(new Color(255,0,0));
	}
	if (e.getSource() == botonVerde) {
		comboR.setSelectedItem("0");
		comboG.setSelectedItem("255");
		comboB.setSelectedItem("0");
		pantalla.getContentPane().setBackground(new Color(0,255,0));
	}
	if (e.getSource() == botonAzul) {
		comboR.setSelectedItem("0");
		comboG.setSelectedItem("0");
		comboB.setSelectedItem("255");
		pantalla.getContentPane().setBackground(new Color(0,0,255));
	}
    }

    public static void main(String[] args) {
        new ColoresRGB();
    }
}