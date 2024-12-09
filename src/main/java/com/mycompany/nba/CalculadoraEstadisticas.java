package com.mycompany.nba;

import java.io.File;
import java.util.ArrayList;
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

ArrayList<ArrayList<String>> listaCambios = new ArrayList();


    public CalculadoraEstadisticas() {
        initComponents();
        Calcular.requestFocusInWindow(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        nombreJugador = new javax.swing.JTextField();
        tirosIntentados = new javax.swing.JTextField();
        tirosAnotados = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        Pantalla = new javax.swing.JLabel();
        triplesIntentados = new javax.swing.JTextField();
        triplesAnotados = new javax.swing.JTextField();
        Exportar = new javax.swing.JButton();
        libresIntentados = new javax.swing.JTextField();
        libresAnotados = new javax.swing.JTextField();
        Exportar1 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(382, 260));
        jPanel1.setMinimumSize(new java.awt.Dimension(382, 260));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        nombreJugador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreJugador.setText("Nombre");
        nombreJugador.setToolTipText("");
        nombreJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        nombreJugador.setMinimumSize(new java.awt.Dimension(300, 18));
        nombreJugador.setPreferredSize(new java.awt.Dimension(320, 18));
        nombreJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJugadorFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 10, 0);
        jPanel1.add(nombreJugador, gridBagConstraints);

        tirosIntentados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tirosIntentados.setText("Tiros intentados");
        tirosIntentados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
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
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 5);
        jPanel1.add(tirosIntentados, gridBagConstraints);

        tirosAnotados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tirosAnotados.setText("Tiros anotados");
        tirosAnotados.setToolTipText("");
        tirosAnotados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
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
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 5);
        jPanel1.add(tirosAnotados, gridBagConstraints);

        Calcular.setText("Calcular");
        Calcular.setPreferredSize(new java.awt.Dimension(305, 40));
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
        Pantalla.setOpaque(true);
        Pantalla.setPreferredSize(new java.awt.Dimension(305, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel1.add(Pantalla, gridBagConstraints);

        triplesIntentados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        triplesIntentados.setText("Triples intentados");
        triplesIntentados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
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
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 5);
        jPanel1.add(triplesIntentados, gridBagConstraints);

        triplesAnotados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        triplesAnotados.setText("Triples anotados");
        triplesAnotados.setToolTipText("");
        triplesAnotados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
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
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 5);
        jPanel1.add(triplesAnotados, gridBagConstraints);

        Exportar.setText("Exportar");
        Exportar.setMaximumSize(new java.awt.Dimension(76, 23));
        Exportar.setMinimumSize(new java.awt.Dimension(76, 23));
        Exportar.setPreferredSize(new java.awt.Dimension(90, 25));
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 0, 0);
        jPanel1.add(Exportar, gridBagConstraints);

        libresIntentados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        libresIntentados.setText("Libres intentados");
        libresIntentados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
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
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 5);
        jPanel1.add(libresIntentados, gridBagConstraints);

        libresAnotados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        libresAnotados.setText("Libres anotados");
        libresAnotados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
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
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 5, 5);
        jPanel1.add(libresAnotados, gridBagConstraints);

        Exportar1.setText("Importar");
        Exportar1.setPreferredSize(new java.awt.Dimension(90, 25));
        Exportar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exportar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 0, 0);
        jPanel1.add(Exportar1, gridBagConstraints);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorFocusGained
        // Si el texto es el predefinido, lo borramos cuando el campo recibe el foco
        if (nombreJugador.getText().equals("Nombre")) {
            nombreJugador.setText(""); 
        }
    }//GEN-LAST:event_nombreJugadorFocusGained

    private void nombreJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreJugadorFocusLost
        if (nombreJugador.getText().equals("")) {
            nombreJugador.setText("Nombre"); 
        }
    }//GEN-LAST:event_nombreJugadorFocusLost

    private void tirosIntentadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tirosIntentadosFocusGained
            if (tirosIntentados.getText().equals("Tiros intentados")) {
            tirosIntentados.setText(""); 
        }
    }//GEN-LAST:event_tirosIntentadosFocusGained

    private void tirosIntentadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tirosIntentadosFocusLost
            if (tirosIntentados.getText().equals("")) {
            tirosIntentados.setText("Tiros intentados"); 
        }
    }//GEN-LAST:event_tirosIntentadosFocusLost

    private void tirosAnotadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tirosAnotadosFocusGained
            if (tirosAnotados.getText().equals("Tiros anotados")) {
            tirosAnotados.setText(""); 
        }
    }//GEN-LAST:event_tirosAnotadosFocusGained

    private void tirosAnotadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tirosAnotadosFocusLost
        if (tirosAnotados.getText().equals("")) {
        tirosAnotados.setText("Tiros anotados"); 
    }
    }//GEN-LAST:event_tirosAnotadosFocusLost

    private void triplesIntentadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_triplesIntentadosFocusGained
        if (triplesIntentados.getText().equals("Triples intentados")) {
        triplesIntentados.setText(""); 
    }
    }//GEN-LAST:event_triplesIntentadosFocusGained

    private void triplesIntentadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_triplesIntentadosFocusLost
        if (triplesIntentados.getText().equals("")) {
        triplesIntentados.setText("Triples intentados"); 
    }
    }//GEN-LAST:event_triplesIntentadosFocusLost

    private void triplesAnotadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_triplesAnotadosFocusGained
            if (triplesAnotados.getText().equals("Triples anotados")) {
            triplesAnotados.setText(""); 
        }
    }//GEN-LAST:event_triplesAnotadosFocusGained

    private void triplesAnotadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_triplesAnotadosFocusLost
            if (triplesAnotados.getText().equals("")) {
            triplesAnotados.setText("Triples anotados"); 
        }
    }//GEN-LAST:event_triplesAnotadosFocusLost

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        ArrayList<String> jugador = new ArrayList();
        String nom = nombreJugador.getText();
        jugador.add(nom);
        
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
        jugador.add(fgString);
        Double efg = (double) (tirosDoblesAnotados + (1.5 * tirosTriplesAnotados)) / totalLanzados * 100;
        String efgString = String.format("%.2f", fg).replace(',', '.');  // Limitar a 2 decimales
        jugador.add(efgString);
        Double ts = (double) puntosTotales / (2 * (totalLanzados + (0.44 * tirosLibresIntentados))) * 100;
        String tsString = String.format("%.2f", ts).replace(',', '.'); // Limitar a 2 decimales
        jugador.add(tsString);
        listaCambios.add(jugador);
        Pantalla.setText("FG%: " + fgString + " eFG%: " + efgString + "%TG" );
        
        // Calculo valoracion
        Double valoracion = (double) puntosTotales + 0.5 * rebotes + 0.5 * asistencias + 1.5 * robos + 1.5 * tapones - 0.5 * faltasRec - 0.5 * perdidas;
        String valoracionString = String.format("%.2f", valoracion).replace(',', '.');
        jugador.add(valoracionString);
        
        // Pantalla
        Pantalla.setText("FG%: " + fgString + " eFG%: " + efgString + "%TS" + tsString);
    }//GEN-LAST:event_CalcularActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        String ruta = "C:/Users/Familia/Documents/NetBeansProjects/NBA/Informes/Informes.xlsx";
        File archivo = new File(ruta);
        if (!archivo.exists()) {  // Si el archivo no existe
            ExportarExcel.crearExcel(ruta,"Estadisticas", "Jugador", "%FG", "%eFG","%TG","Valoracion");
        } 
        ExportarExcel.escribirExcel(ruta,"Estadisticas",listaCambios);
        listaCambios.clear();
        
    }//GEN-LAST:event_ExportarActionPerformed

    private void libresIntentadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_libresIntentadosFocusGained
        if (libresIntentados.getText().equals("Libres intentados")) {
        libresIntentados.setText("");}
    }//GEN-LAST:event_libresIntentadosFocusGained

    private void libresIntentadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_libresIntentadosFocusLost
        if (libresIntentados.getText().equals("")) {
            libresIntentados.setText("Libres intentados"); 
        }
    }//GEN-LAST:event_libresIntentadosFocusLost

    private void libresAnotadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_libresAnotadosFocusGained
        if (libresAnotados.getText().equals("Libres anotados")) {
        libresAnotados.setText("");}
    }//GEN-LAST:event_libresAnotadosFocusGained

    private void libresAnotadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_libresAnotadosFocusLost
        if (libresAnotados.getText().equals("")) {
            libresAnotados.setText("Libres anotados"); 
        }
    }//GEN-LAST:event_libresAnotadosFocusLost

    private void Exportar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exportar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Exportar1ActionPerformed
    
    
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
    private javax.swing.JButton Exportar;
    private javax.swing.JButton Exportar1;
    private javax.swing.JSpinner FaltasReaDato;
    private javax.swing.JSpinner FaltasRecDato;
    private javax.swing.JLabel Pantalla;
    private javax.swing.JSpinner PerdidasDato;
    private javax.swing.JTextField Rebotes;
    private javax.swing.JSpinner RebotesDato;
    private javax.swing.JSpinner RobosDato;
    private javax.swing.JSpinner TaponesDato;
    private javax.swing.JSpinner TaponesRecDato;
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
    private javax.swing.JTextField nombreJugador;
    private javax.swing.JTextField tirosAnotados;
    private javax.swing.JTextField tirosIntentados;
    private javax.swing.JTextField triplesAnotados;
    private javax.swing.JTextField triplesIntentados;
    // End of variables declaration//GEN-END:variables
}
