package vistas;

public class cuestionario2 extends javax.swing.JInternalFrame {

    public cuestionario2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(822, 426));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel1.setText("¿Cuál es el propósito principal del algoritmo SCAN en la programación del disco?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jRadioButton1.setText("Minimizar los tiempos de espera.");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jRadioButton2.setText("Mover el cabezal del disco de un extremo a otro.");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jRadioButton3.setText("Mover el cabezal del disco de un extremo a otro.");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel2.setText("¿En qué se destaca la memoria no volátil (NVM) en comparación con los HDDs?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jRadioButton4.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jRadioButton4.setText("Rendimiento en tareas secuenciales.\n");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jRadioButton5.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jRadioButton5.setText("Producción de Operaciones de Entrada/Salida por Segundo (IOPS).\n");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jRadioButton6.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jRadioButton6.setText("Eficiencia en la gestión de colas de disco.\n");
        jPanel2.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel3.setText("¿Cuál es el propósito principal de utilizar espacios de intercambio en un sistema?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jRadioButton7.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jRadioButton7.setText("Optimizar el rendimiento de la RAM.\n");
        jPanel2.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jRadioButton8.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jRadioButton8.setText("Transferir procesos o páginas cuando la RAM es insuficiente.");
        jPanel2.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jRadioButton9.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jRadioButton9.setText("Mantener varios sistemas operativos en una máquina.\n");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
