
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 */
public class portada extends javax.swing.JInternalFrame {
 

    public portada() {
        initComponents();
        setSize(800, 450);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        fondo = new javax.swing.JPanel();
        tituloCover = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        carrera = new javax.swing.JLabel();
        facultad = new javax.swing.JLabel();
        univ = new javax.swing.JLabel();
        materia = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new FondoPanel2();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(204, 204, 204));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCover.setFont(new java.awt.Font("Garamond", 1, 40)); // NOI18N
        tituloCover.setForeground(new java.awt.Color(0, 0, 0));
        tituloCover.setText("Sistema de Almacenamiento Masivo");
        fondo.add(tituloCover, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Gabriela Espinosa");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Victoria Nieto");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        carrera.setBackground(new java.awt.Color(255, 255, 255));
        carrera.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        carrera.setForeground(new java.awt.Color(0, 0, 0));
        carrera.setText("Ingenería de Sistemas");
        fondo.add(carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        facultad.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        facultad.setForeground(new java.awt.Color(0, 0, 0));
        facultad.setText("Facultad de Ingenierías y Arquitectura");
        fondo.add(facultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, 20));

        univ.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        univ.setForeground(new java.awt.Color(0, 0, 0));
        univ.setText("Universidad de Pamplona");
        fondo.add(univ, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        materia.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        materia.setForeground(new java.awt.Color(0, 0, 0));
        materia.setText("Plataformas Tecnológicas");
        fondo.add(materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ing. Eduardo Rueda Fajardo");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("2023");
        fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 210, 250));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 420));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        tituloCover.setText(texto.getString("tituloCover"));
        carrera.setText(texto.getString("carrera"));
        facultad.setText(texto.getString("facultad"));
        univ.setText(texto.getString("univ"));
        materia.setText(texto.getString("materia"));
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carrera;
    private javax.swing.JLabel facultad;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel materia;
    private javax.swing.JLabel tituloCover;
    private javax.swing.JLabel univ;
    // End of variables declaration//GEN-END:variables

    private void setNorthPane(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
       
    class FondoPanel2 extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/escudoUni.png")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
