package com.mycompany.nba;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JRadioButton;
import org.apache.poi.ss.usermodel.Workbook;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/*package com.mycompany.nba/

import org.apache.poi.ss.usermodel.Workbook;


/**
 *
 * @author Familia
 */
public class CalculadoraEstadisticas extends javax.swing.JFrame {

ArrayList<String> listaCambios = new ArrayList();
ArrayList<String> jugadoresBulls = new ArrayList<>(Arrays.asList("Michael Jordan", "Scottie Pippen", "Dennis Rodman", "Luc Longley", "Ron Harper"));
ArrayList<String> jugadoresLakers = new ArrayList<>(Arrays.asList("Magic Johnson", "Kareem Abdul-Jabbar", "James Worthy", "Byron Scott", "Michael Cooper"));


    public CalculadoraEstadisticas() {
        initComponents();
        Calcular.requestFocusInWindow(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Equipos = new javax.swing.ButtonGroup();
        JugadoresLakers = new javax.swing.ButtonGroup();
        JugadoresBulls = new javax.swing.ButtonGroup();
        radioEquipos = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tirosIntentados = new javax.swing.JTextField();
        tirosAnotados = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        Pantalla = new javax.swing.JLabel();
        triplesIntentados = new javax.swing.JTextField();
        triplesAnotados = new javax.swing.JTextField();
        libresIntentados = new javax.swing.JTextField();
        libresAnotados = new javax.swing.JTextField();
        nombreJugadores = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        Rebotes = new javax.swing.JTextField();
        RebotesDato = new javax.swing.JSpinner();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        AsistenciasDato = new javax.swing.JSpinner();
        RobosDato = new javax.swing.JSpinner();
        TaponesDato = new javax.swing.JSpinner();
        FaltasRecDato = new javax.swing.JSpinner();
        PerdidasDato = new javax.swing.JSpinner();
        TaponesRecDato = new javax.swing.JSpinner();
        FaltasReaDato = new javax.swing.JSpinner();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        graficoBarras = new javax.swing.JMenuItem();
        exportarPDF = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        crearExcel = new javax.swing.JMenuItem();
        escribirExcel = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        radioLA = new javax.swing.JRadioButtonMenuItem();
        radioChicago = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(382, 260));
        jPanel1.setMinimumSize(new java.awt.Dimension(382, 260));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        tirosIntentados.setText("Tiros intentados");
        tirosIntentados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        tirosIntentados.setMaximumSize(new java.awt.Dimension(100, 20));
        tirosIntentados.setMinimumSize(new java.awt.Dimension(100, 20));
        tirosIntentados.setPreferredSize(new java.awt.Dimension(100, 20));
        tirosIntentados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirosIntentadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tirosIntentadosFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 35, 5, 5);
        jPanel1.add(tirosIntentados, gridBagConstraints);

        tirosAnotados.setText("Tiros anotados");
        tirosAnotados.setToolTipText("");
        tirosAnotados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        tirosAnotados.setMaximumSize(new java.awt.Dimension(100, 20));
        tirosAnotados.setMinimumSize(new java.awt.Dimension(100, 20));
        tirosAnotados.setPreferredSize(new java.awt.Dimension(100, 20));
        tirosAnotados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirosAnotadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tirosAnotadosFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(tirosAnotados, gridBagConstraints);

        Calcular.setText("Calcular");
        Calcular.setMaximumSize(new java.awt.Dimension(305, 40));
        Calcular.setMinimumSize(new java.awt.Dimension(305, 40));
        Calcular.setPreferredSize(new java.awt.Dimension(315, 40));
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(Calcular, gridBagConstraints);

        Pantalla.setBackground(new java.awt.Color(51, 51, 255));
        Pantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Pantalla.setForeground(new java.awt.Color(255, 255, 255));
        Pantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pantalla.setText("0");
        Pantalla.setToolTipText("");
        Pantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pantalla.setMaximumSize(new java.awt.Dimension(305, 40));
        Pantalla.setMinimumSize(new java.awt.Dimension(305, 40));
        Pantalla.setOpaque(true);
        Pantalla.setPreferredSize(new java.awt.Dimension(315, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel1.add(Pantalla, gridBagConstraints);

        triplesIntentados.setText("Triples intentados");
        triplesIntentados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        triplesIntentados.setMargin(new java.awt.Insets(100, 20, 20, 20));
        triplesIntentados.setMaximumSize(new java.awt.Dimension(100, 20));
        triplesIntentados.setMinimumSize(new java.awt.Dimension(100, 20));
        triplesIntentados.setPreferredSize(new java.awt.Dimension(100, 20));
        triplesIntentados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                triplesIntentadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                triplesIntentadosFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 35, 5, 5);
        jPanel1.add(triplesIntentados, gridBagConstraints);

        triplesAnotados.setText("Triples anotados");
        triplesAnotados.setToolTipText("");
        triplesAnotados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        triplesAnotados.setMaximumSize(new java.awt.Dimension(100, 20));
        triplesAnotados.setMinimumSize(new java.awt.Dimension(100, 20));
        triplesAnotados.setPreferredSize(new java.awt.Dimension(100, 20));
        triplesAnotados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                triplesAnotadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                triplesAnotadosFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(triplesAnotados, gridBagConstraints);

        libresIntentados.setText("Libres intentados");
        libresIntentados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        libresIntentados.setMaximumSize(new java.awt.Dimension(100, 20));
        libresIntentados.setMinimumSize(new java.awt.Dimension(100, 20));
        libresIntentados.setPreferredSize(new java.awt.Dimension(100, 20));
        libresIntentados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                libresIntentadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                libresIntentadosFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 35, 5, 5);
        jPanel1.add(libresIntentados, gridBagConstraints);

        libresAnotados.setText("Libres anotados");
        libresAnotados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        libresAnotados.setMaximumSize(new java.awt.Dimension(100, 20));
        libresAnotados.setMinimumSize(new java.awt.Dimension(100, 20));
        libresAnotados.setPreferredSize(new java.awt.Dimension(100, 20));
        libresAnotados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                libresAnotadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                libresAnotadosFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(libresAnotados, gridBagConstraints);

        nombreJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jugador" }));
        nombreJugadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        nombreJugadores.setMaximumSize(new java.awt.Dimension(320, 25));
        nombreJugadores.setMinimumSize(new java.awt.Dimension(320, 25));
        nombreJugadores.setPreferredSize(new java.awt.Dimension(321, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 2, 0);
        jPanel1.add(nombreJugadores, gridBagConstraints);

        jTabbedPane1.addTab("Puntos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(382, 260));
        jPanel2.setMinimumSize(new java.awt.Dimension(382, 260));
        jPanel2.setPreferredSize(new java.awt.Dimension(382, 260));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        Rebotes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Rebotes.setText("Rebotes");
        Rebotes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Rebotes.setPreferredSize(new java.awt.Dimension(90, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(Rebotes, gridBagConstraints);

        RebotesDato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RebotesDato.setMinimumSize(new java.awt.Dimension(64, 18));
        RebotesDato.setPreferredSize(new java.awt.Dimension(60, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel2.add(RebotesDato, gridBagConstraints);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Asistencias");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField2.setPreferredSize(new java.awt.Dimension(90, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jTextField2, gridBagConstraints);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Robos");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField3.setPreferredSize(new java.awt.Dimension(90, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jTextField3, gridBagConstraints);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Faltas Rea");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField4.setPreferredSize(new java.awt.Dimension(90, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        jPanel2.add(jTextField4, gridBagConstraints);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Tapones");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField5.setPreferredSize(new java.awt.Dimension(90, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jTextField5, gridBagConstraints);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Faltas Rec");
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField6.setPreferredSize(new java.awt.Dimension(90, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jTextField6, gridBagConstraints);

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Tapones rec");
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField7.setPreferredSize(new java.awt.Dimension(90, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        jPanel2.add(jTextField7, gridBagConstraints);

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Perdidas");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextField9.setPreferredSize(new java.awt.Dimension(90, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 25, 5, 5);
        jPanel2.add(jTextField9, gridBagConstraints);

        AsistenciasDato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AsistenciasDato.setMinimumSize(new java.awt.Dimension(64, 18));
        AsistenciasDato.setPreferredSize(new java.awt.Dimension(60, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel2.add(AsistenciasDato, gridBagConstraints);

        RobosDato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RobosDato.setMinimumSize(new java.awt.Dimension(64, 18));
        RobosDato.setPreferredSize(new java.awt.Dimension(60, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel2.add(RobosDato, gridBagConstraints);

        TaponesDato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TaponesDato.setMinimumSize(new java.awt.Dimension(64, 18));
        TaponesDato.setPreferredSize(new java.awt.Dimension(60, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel2.add(TaponesDato, gridBagConstraints);

        FaltasRecDato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        FaltasRecDato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FaltasRecDato.setMinimumSize(new java.awt.Dimension(64, 18));
        FaltasRecDato.setPreferredSize(new java.awt.Dimension(60, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        jPanel2.add(FaltasRecDato, gridBagConstraints);

        PerdidasDato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PerdidasDato.setMinimumSize(new java.awt.Dimension(64, 18));
        PerdidasDato.setPreferredSize(new java.awt.Dimension(60, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        jPanel2.add(PerdidasDato, gridBagConstraints);

        TaponesRecDato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TaponesRecDato.setMinimumSize(new java.awt.Dimension(64, 18));
        TaponesRecDato.setPreferredSize(new java.awt.Dimension(60, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        jPanel2.add(TaponesRecDato, gridBagConstraints);

        FaltasReaDato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        FaltasReaDato.setMinimumSize(new java.awt.Dimension(64, 18));
        FaltasReaDato.setPreferredSize(new java.awt.Dimension(60, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        jPanel2.add(FaltasReaDato, gridBagConstraints);

        jTextField10.setBackground(new java.awt.Color(51, 51, 255));
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Positivas");
        jTextField10.setPreferredSize(new java.awt.Dimension(155, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel2.add(jTextField10, gridBagConstraints);

        jTextField11.setBackground(new java.awt.Color(51, 51, 255));
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Negativas");
        jTextField11.setMinimumSize(new java.awt.Dimension(64, 40));
        jTextField11.setPreferredSize(new java.awt.Dimension(155, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 20, 0);
        jPanel2.add(jTextField11, gridBagConstraints);

        jTabbedPane1.addTab("Valoracion", jPanel2);

        jMenu1.setText("Gráficas");

        graficoBarras.setText("Gráfico barras");
        graficoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficoBarrasActionPerformed(evt);
            }
        });
        jMenu1.add(graficoBarras);

        exportarPDF.setText("Gráfico PDF");
        jMenu1.add(exportarPDF);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Excel");

        crearExcel.setText("Crear");
        crearExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearExcelActionPerformed(evt);
            }
        });
        jMenu2.add(crearExcel);

        escribirExcel.setText("Escribir");
        escribirExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirExcelActionPerformed(evt);
            }
        });
        jMenu2.add(escribirExcel);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Equipos");

        radioEquipos.add(radioLA);
        radioLA.setText("Lakers");
        radioLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLAActionPerformed(evt);
            }
        });
        jMenu3.add(radioLA);

        radioEquipos.add(radioChicago);
        radioChicago.setText("Chicago Bulls");
        radioChicago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioChicagoActionPerformed(evt);
            }
        });
        jMenu3.add(radioChicago);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graficoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficoBarrasActionPerformed
         String ruta = "";
        
        if(radioLA.isSelected()){
            ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\NBA\\Informes\\Lakers.xlsx";
        }
        if(radioChicago.isSelected()){
            ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\NBA\\Informes\\Bulls.xlsx";
        }
        String jugador = nombreJugadores.getSelectedItem().toString();
        Graficas.mostrarGraficoDeBarras(ruta,jugador);
        
    }//GEN-LAST:event_graficoBarrasActionPerformed

    private void libresAnotadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_libresAnotadosFocusLost
        if (libresAnotados.getText().equals("")) {
            libresAnotados.setText("Libres anotados");
        }
    }//GEN-LAST:event_libresAnotadosFocusLost

    private void libresAnotadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_libresAnotadosFocusGained
        if (libresAnotados.getText().equals("Libres anotados")) {
            libresAnotados.setText("");}
    }//GEN-LAST:event_libresAnotadosFocusGained

    private void libresIntentadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_libresIntentadosFocusLost
        if (libresIntentados.getText().equals("")) {
            libresIntentados.setText("Libres intentados");
        }
    }//GEN-LAST:event_libresIntentadosFocusLost

    private void libresIntentadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_libresIntentadosFocusGained
        if (libresIntentados.getText().equals("Libres intentados")) {
            libresIntentados.setText("");}
    }//GEN-LAST:event_libresIntentadosFocusGained

    private void triplesAnotadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_triplesAnotadosFocusLost
        if (triplesAnotados.getText().equals("")) {
            triplesAnotados.setText("Triples anotados");
        }
    }//GEN-LAST:event_triplesAnotadosFocusLost

    private void triplesAnotadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_triplesAnotadosFocusGained
        if (triplesAnotados.getText().equals("Triples anotados")) {
            triplesAnotados.setText("");
        }
    }//GEN-LAST:event_triplesAnotadosFocusGained

    private void triplesIntentadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_triplesIntentadosFocusLost
        if (triplesIntentados.getText().equals("")) {
            triplesIntentados.setText("Triples intentados");
        }
    }//GEN-LAST:event_triplesIntentadosFocusLost

    private void triplesIntentadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_triplesIntentadosFocusGained
        if (triplesIntentados.getText().equals("Triples intentados")) {
            triplesIntentados.setText("");
        }
    }//GEN-LAST:event_triplesIntentadosFocusGained

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed

        // Obtencion de datos
        Integer tirosDobles = Integer.parseInt(tirosIntentados.getText());
        Integer tirosTriples = Integer.parseInt(triplesIntentados.getText());
        Integer tirosDoblesAnotados = Integer.parseInt(tirosAnotados.getText());
        Integer tirosTriplesAnotados = Integer.parseInt(triplesAnotados.getText());
        Integer tirosLibresIntentados = Integer.parseInt(libresIntentados.getText());
        Integer tirosLibresAnotados = Integer.parseInt(libresAnotados.getText());

        //Obtencion datos valoracion
        Integer rebotes = (Integer) RebotesDato.getValue();
        Integer asistencias = (Integer) AsistenciasDato.getValue();
        Integer robos = (Integer) RobosDato.getValue();
        Integer tapones = (Integer) TaponesDato.getValue();
        Integer faltasRec = (Integer) FaltasRecDato.getValue();
        Integer faltasRea = (Integer) FaltasReaDato.getValue();
        Integer perdidas = (Integer) PerdidasDato.getValue();
        Integer taponesRec = (Integer) TaponesRecDato.getValue();

        //Calculos

        Integer puntosTotales = (tirosDoblesAnotados * 2) + (tirosTriplesAnotados * 3) + tirosLibresAnotados;
        Integer totalLanzados = tirosDobles + tirosTriples;
        Integer totalAnotados = tirosDoblesAnotados + tirosTriplesAnotados;
        Double fg = (double) totalAnotados / totalLanzados * 100; // Para obtener un resultado en decimal
        String fgString = String.format("%.2f", fg).replace(',', '.');   // Limitar a 2 decimales
        listaCambios.add(fgString);
        Double efg = (double) (tirosDoblesAnotados + (1.5 * tirosTriplesAnotados)) / totalLanzados * 100;
        String efgString = String.format("%.2f", fg).replace(',', '.');  // Limitar a 2 decimales
        listaCambios.add(efgString);
        Double ts = (double) puntosTotales / (2 * (totalLanzados + (0.44 * tirosLibresIntentados))) * 100;
        String tsString = String.format("%.2f", ts).replace(',', '.'); // Limitar a 2 decimales
        listaCambios.add(tsString);
        Pantalla.setText("FG%: " + fgString + " eFG%: " + efgString + "%TG" );

        // Calculo valoracion
        Double valoracion = (double) puntosTotales + 0.5 * rebotes + 0.5 * asistencias + 1.5 * robos + 1.5 * tapones - 0.5 * faltasRec - 0.5 * perdidas;
        String valoracionString = String.format("%.2f", valoracion).replace(',', '.');
        listaCambios.add(valoracionString);

        // Pantalla
        Pantalla.setText("FG%: " + fgString + " | eFG%: " + efgString + " | %TS: " + tsString);
    }//GEN-LAST:event_CalcularActionPerformed

    private void tirosAnotadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tirosAnotadosFocusLost
        if (tirosAnotados.getText().equals("")) {
            tirosAnotados.setText("Tiros anotados");
        }
    }//GEN-LAST:event_tirosAnotadosFocusLost

    private void tirosAnotadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tirosAnotadosFocusGained
        if (tirosAnotados.getText().equals("Tiros anotados")) {
            tirosAnotados.setText("");
        }
    }//GEN-LAST:event_tirosAnotadosFocusGained

    private void tirosIntentadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tirosIntentadosFocusLost
        if (tirosIntentados.getText().equals("")) {
            tirosIntentados.setText("Tiros intentados");
        }
    }//GEN-LAST:event_tirosIntentadosFocusLost

    private void tirosIntentadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tirosIntentadosFocusGained
        if (tirosIntentados.getText().equals("Tiros intentados")) {
            tirosIntentados.setText("");
        }
    }//GEN-LAST:event_tirosIntentadosFocusGained

    private void radioLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLAActionPerformed

        nombreJugadores.removeAllItems();
        nombreJugadores.addItem(jugadoresLakers.get(0));
        nombreJugadores.addItem(jugadoresLakers.get(1));
        nombreJugadores.addItem(jugadoresLakers.get(2));
        nombreJugadores.addItem(jugadoresLakers.get(3));
        nombreJugadores.addItem(jugadoresLakers.get(4));
    }//GEN-LAST:event_radioLAActionPerformed

    private void radioChicagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioChicagoActionPerformed
    
        nombreJugadores.removeAllItems();
        nombreJugadores.addItem(jugadoresBulls.get(0));
        nombreJugadores.addItem(jugadoresBulls.get(1));
        nombreJugadores.addItem(jugadoresBulls.get(2));
        nombreJugadores.addItem(jugadoresBulls.get(3));
        nombreJugadores.addItem(jugadoresBulls.get(4));
    }//GEN-LAST:event_radioChicagoActionPerformed

    private void crearExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearExcelActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\NBA\\Informes\\";
        ExportarExcel.crearExcel2(ruta, "Lakers", jugadoresLakers);
        ExportarExcel.crearExcel2(ruta, "Bulls", jugadoresBulls);
    }//GEN-LAST:event_crearExcelActionPerformed

    private void escribirExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirExcelActionPerformed
        String ruta = "";
        
        if(radioLA.isSelected()){
            ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\NBA\\Informes\\Lakers.xlsx";
        }
        if(radioChicago.isSelected()){
            ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\NBA\\Informes\\Bulls.xlsx";
        }
       
        String jugador = nombreJugadores.getSelectedItem().toString();
        ExportarExcel.escribirExcel2(ruta, jugador, listaCambios);
        listaCambios.clear();
        ExportarExcel.calcularMediasExcel(ruta, jugador);
        
        
    }//GEN-LAST:event_escribirExcelActionPerformed
    
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraEstadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner AsistenciasDato;
    private javax.swing.JButton Calcular;
    private javax.swing.ButtonGroup Equipos;
    private javax.swing.JSpinner FaltasReaDato;
    private javax.swing.JSpinner FaltasRecDato;
    private javax.swing.ButtonGroup JugadoresBulls;
    private javax.swing.ButtonGroup JugadoresLakers;
    private javax.swing.JLabel Pantalla;
    private javax.swing.JSpinner PerdidasDato;
    private javax.swing.JTextField Rebotes;
    private javax.swing.JSpinner RebotesDato;
    private javax.swing.JSpinner RobosDato;
    private javax.swing.JSpinner TaponesDato;
    private javax.swing.JSpinner TaponesRecDato;
    private javax.swing.JMenuItem crearExcel;
    private javax.swing.JMenuItem escribirExcel;
    private javax.swing.JMenuItem exportarPDF;
    private javax.swing.JMenuItem graficoBarras;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField libresAnotados;
    private javax.swing.JTextField libresIntentados;
    private javax.swing.JComboBox<String> nombreJugadores;
    private javax.swing.JRadioButtonMenuItem radioChicago;
    private javax.swing.ButtonGroup radioEquipos;
    private javax.swing.JRadioButtonMenuItem radioLA;
    private javax.swing.JTextField tirosAnotados;
    private javax.swing.JTextField tirosIntentados;
    private javax.swing.JTextField triplesAnotados;
    private javax.swing.JTextField triplesIntentados;
    // End of variables declaration//GEN-END:variables
}
