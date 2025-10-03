package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class MainGUI extends JFrame {

    private JComboBox<String> cbCapacidades;
    private JButton btnProbar, btnLlenar, btnVaciar;
    private JSlider jS;
    private JTextArea areaTexto;
    private JPanel panelPiscina;
    private Piscina piscina;
    private final Random rnd = new Random();

    public MainGUI() {
        super("Excepciones 1 - Piscina");
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 450);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        JLabel lbl = new JLabel("Elige capacidad (m³):");
        String[] opciones = {"5", "10", "15", "20", "50"};
        cbCapacidades = new JComboBox<>(opciones);
        btnProbar = new JButton("Probar Piscina");
        JPanel top = new JPanel();
        top.add(lbl);
        top.add(cbCapacidades);
        top.add(btnProbar);

        panelPiscina = new JPanel(new BorderLayout());
        panelPiscina.setBorder(BorderFactory.createTitledBorder("Piscina"));
        panelPiscina.setVisible(false);

        jS = new JSlider();
        jS.setEnabled(false);

        areaTexto = new JTextArea(10, 40);
        areaTexto.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaTexto);

        JPanel center = new JPanel(new BorderLayout());
        center.add(jS, BorderLayout.NORTH);
        center.add(scroll, BorderLayout.CENTER);

        btnLlenar = new JButton("Llenar");
        btnVaciar = new JButton("Vaciar");
        btnLlenar.setEnabled(false);
        btnVaciar.setEnabled(false);
        JPanel botones = new JPanel();
        botones.add(btnLlenar);
        botones.add(btnVaciar);

        panelPiscina.add(center, BorderLayout.CENTER);
        panelPiscina.add(botones, BorderLayout.SOUTH);

        add(top, BorderLayout.NORTH);
        add(panelPiscina, BorderLayout.CENTER);

        btnProbar.addActionListener(this::probarPiscina);
        btnLlenar.addActionListener(this::accionLlenar);
        btnVaciar.addActionListener(this::accionVaciar);
    }

    private void probarPiscina(ActionEvent e) {
        try {
            int m3 = Integer.parseInt((String) cbCapacidades.getSelectedItem());
            int litros = m3 * 1000;
            piscina = new Piscina(litros);

            jS.setMinimum(0);
            jS.setMaximum(litros);
            jS.setMajorTickSpacing(100);
            jS.setMinorTickSpacing(10);
            jS.setValue(0);
            jS.setPaintTicks(true);
            jS.setPaintLabels(true);
            jS.setEnabled(false);

            areaTexto.setText("");
            areaTexto.append("Piscina creada: " + m3 + " m³ → " + litros + " litros\n");
            panelPiscina.setVisible(true);
            btnLlenar.setEnabled(true);
            btnVaciar.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al probar la piscina: " + ex.getMessage());
        }
    }

    private void accionLlenar(ActionEvent e) {
        if (piscina == null) return;
        int cantidad = rnd.nextInt(1000) + 1;
        try {
            piscina.llenar(cantidad);
            jS.setValue(piscina.getNivel());
            areaTexto.append("Llenado: " + cantidad + " litros. Nivel nuevo: " + piscina.getNivel() + " L\n");
        } catch (Piscina.PiscinaLlenaException ex) {
            areaTexto.append("EXCEPCIÓN al llenar: " + ex.getMessage() + " Nivel actual: " + piscina.getNivel() + " L\n");
        }
    }

    private void accionVaciar(ActionEvent e) {
        if (piscina == null) return;
        int cantidad = rnd.nextInt(1000) + 1;
        try {
            piscina.vaciar(cantidad);
            jS.setValue(piscina.getNivel());
            areaTexto.append("Vaciado: " + cantidad + " litros. Nivel nuevo: " + piscina.getNivel() + " L\n");
        } catch (Piscina.PiscinaVaciaException ex) {
            areaTexto.append("EXCEPCIÓN al vaciar: " + ex.getMessage() + " Nivel actual: " + piscina.getNivel() + " L\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainGUI mg = new MainGUI();
            mg.setVisible(true);
        });
    }
}
