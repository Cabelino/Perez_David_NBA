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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));

        nombreJugador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreJugador.setText("Nombre");
        nombreJugador.setToolTipText("");
        nombreJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        nombreJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreJugadorFocusLost(evt);
            }
        });

        tirosIntentados.setText("Tiros intentados");
        tirosIntentados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        tirosIntentados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirosIntentadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tirosIntentadosFocusLost(evt);
            }
        });

        tirosAnotados.setText("Tiros anotados");
        tirosAnotados.setToolTipText("");
        tirosAnotados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        tirosAnotados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirosAnotadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tirosAnotadosFocusLost(evt);
            }
        });

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Pantalla.setBackground(new java.awt.Color(51, 51, 255));
        Pantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Pantalla.setForeground(new java.awt.Color(255, 255, 255));
        Pantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pantalla.setText("0");
        Pantalla.setToolTipText("");
        Pantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pantalla.setOpaque(true);

        triplesIntentados.setText("Triples intentados");
        triplesIntentados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        triplesIntentados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                triplesIntentadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                triplesIntentadosFocusLost(evt);
            }
        });

        triplesAnotados.setText("Triples anotados");
        triplesAnotados.setToolTipText("");
        triplesAnotados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        triplesAnotados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                triplesAnotadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                triplesAnotadosFocusLost(evt);
            }
        });

        Exportar.setText("Exportar");
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });

        libresIntentados.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        libresIntentados.setText("Libres intentados");
        libresIntentados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        libresIntentados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                libresIntentadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                libresIntentadosFocusLost(evt);
            }
        });

        libresAnotados.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        libresAnotados.setText("Libres anotados");
        libresAnotados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        libresAnotados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                libresAnotadosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                libresAnotadosFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombreJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tirosIntentados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tirosAnotados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Exportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(libresIntentados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(libresAnotados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(triplesIntentados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(triplesAnotados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tirosIntentados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tirosAnotados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(triplesAnotados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(triplesIntentados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(libresIntentados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(libresAnotados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
    }//GEN-LAST:event_CalcularActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        String ruta = "C:/Users/Familia/Documents/NetBeansProjects/NBA/Informes/Informes.xlsx";
        File archivo = new File(ruta);
        if (!archivo.exists()) {  // Si el archivo no existe
            ExportarExcel.crearExcel(ruta,"Estadisticas", "Jugador", "%FG", "%eFG","%TG");
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
    
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraEstadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Exportar;
    private javax.swing.JLabel Pantalla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField libresAnotados;
    private javax.swing.JTextField libresIntentados;
    private javax.swing.JTextField nombreJugador;
    private javax.swing.JTextField tirosAnotados;
    private javax.swing.JTextField tirosIntentados;
    private javax.swing.JTextField triplesAnotados;
    private javax.swing.JTextField triplesIntentados;
    // End of variables declaration//GEN-END:variables
}
