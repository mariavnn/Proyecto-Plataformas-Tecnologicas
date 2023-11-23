package vistas;

import javax.swing.ButtonGroup;
import logica.Quiz;
import logica.funcionBotones;

public class cuestionario1 extends javax.swing.JInternalFrame {
    Quiz act = new Quiz();
    ButtonGroup grupoPregunta1 = new ButtonGroup();
    ButtonGroup grupoPregunta2 = new ButtonGroup();

    public cuestionario1() {
        initComponents();
    }
    
    private void inicializarEventos() {
        grupoPregunta1.add(jRadioButton1Preg1);
        grupoPregunta1.add(jRadioButton2Preg1);
        grupoPregunta1.add(jRadioButton3Preg1);

        grupoPregunta2.add(jRadioButton1Preg2);
        grupoPregunta2.add(jRadioButton2Preg2);
        grupoPregunta2.add(jRadioButton3Preg2);

    }
    
    private void resetJRadioButton(){
       
        jRadioButton1Preg1.setSelected(false);
        jRadioButton2Preg1.setSelected(false);
        jRadioButton3Preg1.setSelected(false);

        jRadioButton1Preg2.setSelected(false);
        jRadioButton2Preg2.setSelected(false);
        jRadioButton3Preg2.setSelected(false);
    }
    

    private void evaluarRespuestas() {
        evaluarRespuesta(jRadioButton1Preg1.isSelected(), true);
        evaluarRespuesta(jRadioButton2Preg1.isSelected(), false);
        evaluarRespuesta(jRadioButton3Preg1.isSelected(), false);
        evaluarRespuesta(jRadioButton1Preg2.isSelected(), false);
        evaluarRespuesta(jRadioButton2Preg2.isSelected(), false);
        evaluarRespuesta(jRadioButton3Preg2.isSelected(), true);
    }

    private void evaluarRespuesta(boolean seleccionado, boolean esCorrecto) {
        if (seleccionado) {
            act.evaluarRespuesta(esCorrecto);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloCuestionario = new javax.swing.JLabel();
        tituloPre1 = new javax.swing.JLabel();
        jRadioButton1Preg1 = new javax.swing.JRadioButton();
        jRadioButton2Preg1 = new javax.swing.JRadioButton();
        jRadioButton3Preg1 = new javax.swing.JRadioButton();
        tituloPre2 = new javax.swing.JLabel();
        jRadioButton1Preg2 = new javax.swing.JRadioButton();
        jRadioButton2Preg2 = new javax.swing.JRadioButton();
        jRadioButton3Preg2 = new javax.swing.JRadioButton();
        btnTerminar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(822, 426));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCuestionario.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        tituloCuestionario.setText("Cuestionario ");
        jPanel1.add(tituloCuestionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        tituloPre1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tituloPre1.setText("¿Cómo funcionan los HDDs en términos de operación física?");
        jPanel1.add(tituloPre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jRadioButton1Preg1.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton1Preg1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jRadioButton1Preg1.setText("Giran discos magnéticos bajo cabezales de lectura/escritura en movimiento.");
        jRadioButton1Preg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1Preg1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1Preg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 501, 29));

        jRadioButton2Preg1.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton2Preg1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jRadioButton2Preg1.setText("Almacenan datos en unidades USB.");
        jRadioButton2Preg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2Preg1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2Preg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jRadioButton3Preg1.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton3Preg1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jRadioButton3Preg1.setText("Utilizan discos de estado sólido para el almacenamiento.");
        jRadioButton3Preg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3Preg1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3Preg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        tituloPre2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tituloPre2.setText("¿Qué diferencia principal existe entre HDDs y dispositivos de memoria no volátil (NVM)?");
        jPanel1.add(tituloPre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jRadioButton1Preg2.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton1Preg2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jRadioButton1Preg2.setText("Los HDDs tienen una vida útil más corta que los NVM.");
        jRadioButton1Preg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1Preg2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1Preg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jRadioButton2Preg2.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton2Preg2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jRadioButton2Preg2.setText("Los NVM ofrecen menos capacidad que los HDDs.");
        jRadioButton2Preg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2Preg2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2Preg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jRadioButton3Preg2.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton3Preg2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jRadioButton3Preg2.setText("Los NVM tienen un rendimiento más rápido que los HDDs.");
        jRadioButton3Preg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3Preg2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3Preg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        btnTerminar.setBackground(new java.awt.Color(255, 0, 51));
        btnTerminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminar.setText("Terminar");
        btnTerminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 330, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1Preg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1Preg1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1Preg1.isSelected()) {
        jRadioButton2Preg1.setSelected(false);
        jRadioButton3Preg1.setSelected(false);
    }
        
    }//GEN-LAST:event_jRadioButton1Preg1ActionPerformed

    private void jRadioButton3Preg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3Preg1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton3Preg1.isSelected()) {
        jRadioButton1Preg1.setSelected(false);
        jRadioButton2Preg1.setSelected(false);
    }
        
    }//GEN-LAST:event_jRadioButton3Preg1ActionPerformed

    private void jRadioButton3Preg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3Preg2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton3Preg2.isSelected()) {
        jRadioButton1Preg2.setSelected(false);
        jRadioButton2Preg2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3Preg2ActionPerformed

    private void jRadioButton2Preg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2Preg1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton2Preg1.isSelected()) {
        // Si se selecciona esta opción, deseleccionar las otras dos
        jRadioButton1Preg1.setSelected(false);
        jRadioButton3Preg1.setSelected(false);
    }
        
    }//GEN-LAST:event_jRadioButton2Preg1ActionPerformed

    private void jRadioButton1Preg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1Preg2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1Preg2.isSelected()) {
        jRadioButton2Preg2.setSelected(false);
        jRadioButton3Preg2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1Preg2ActionPerformed

    private void jRadioButton2Preg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2Preg2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton2Preg2.isSelected()) {
        jRadioButton1Preg2.setSelected(false);
        jRadioButton3Preg2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2Preg2ActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here
        evaluarRespuestas();
        act.mostrarPuntajeFinal();
        act.resetearPuntaje();
        resetJRadioButton();
    }//GEN-LAST:event_btnTerminarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTerminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1Preg1;
    private javax.swing.JRadioButton jRadioButton1Preg2;
    private javax.swing.JRadioButton jRadioButton2Preg1;
    private javax.swing.JRadioButton jRadioButton2Preg2;
    private javax.swing.JRadioButton jRadioButton3Preg1;
    private javax.swing.JRadioButton jRadioButton3Preg2;
    private javax.swing.JLabel tituloCuestionario;
    private javax.swing.JLabel tituloPre1;
    private javax.swing.JLabel tituloPre2;
    // End of variables declaration//GEN-END:variables
}
