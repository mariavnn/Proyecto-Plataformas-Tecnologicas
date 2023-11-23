
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 */
public class contenidoo extends javax.swing.JInternalFrame {
 

    public contenidoo() {
        initComponents();
        setSize(800, 450);
        setResizable(false);
    }
    
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        tituloCont.setText(texto.getString("tituloCont"));
        tema1.setText(texto.getString("tema1"));
        tema2.setText(texto.getString("tema2"));
        tema3.setText(texto.getString("tema3"));
        tema4.setText(texto.getString("tema4"));
        tema5.setText(texto.getString("tema5"));
        tema6.setText(texto.getString("tema6"));
        tema7.setText(texto.getString("tema7"));
        tema8.setText(texto.getString("tema8"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        fondo = new FondoPanel();
        tituloCont = new javax.swing.JLabel();
        tema1 = new javax.swing.JLabel();
        tema2 = new javax.swing.JLabel();
        tema3 = new javax.swing.JLabel();
        tema4 = new javax.swing.JLabel();
        tema5 = new javax.swing.JLabel();
        tema6 = new javax.swing.JLabel();
        tema7 = new javax.swing.JLabel();
        tema8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(204, 204, 204));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCont.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        tituloCont.setForeground(new java.awt.Color(0, 0, 0));
        tituloCont.setText("CONTENIDO");
        fondo.add(tituloCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        tema1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tema1.setForeground(new java.awt.Color(0, 0, 0));
        tema1.setText("Tema 1: Descripción general de la estructura de almacenamiento masivo");
        fondo.add(tema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 475, 50));

        tema2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tema2.setForeground(new java.awt.Color(0, 0, 0));
        tema2.setText("Tema 2: Programación de HDD");
        fondo.add(tema2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        tema3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tema3.setForeground(new java.awt.Color(0, 0, 0));
        tema3.setText("Tema 3: Programación NVM");
        fondo.add(tema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        tema4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tema4.setForeground(new java.awt.Color(0, 0, 0));
        tema4.setText("Tema 4: Detección y corrección de errores");
        fondo.add(tema4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        tema5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tema5.setForeground(new java.awt.Color(0, 0, 0));
        tema5.setText("Tema 5: Gestión de dispositivos de almacenamiento");
        fondo.add(tema5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        tema6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tema6.setForeground(new java.awt.Color(0, 0, 0));
        tema6.setText("Tema 6: Gestión del espacio de intercambio");
        fondo.add(tema6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        tema7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tema7.setForeground(new java.awt.Color(0, 0, 0));
        tema7.setText("Tema 7: Accesorio de almacenamiento");
        fondo.add(tema7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        tema8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        tema8.setForeground(new java.awt.Color(0, 0, 0));
        tema8.setText("Tema 8: Estructura RAID");
        fondo.add(tema8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 420));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel tema1;
    private javax.swing.JLabel tema2;
    private javax.swing.JLabel tema3;
    private javax.swing.JLabel tema4;
    private javax.swing.JLabel tema5;
    private javax.swing.JLabel tema6;
    private javax.swing.JLabel tema7;
    private javax.swing.JLabel tema8;
    private javax.swing.JLabel tituloCont;
    // End of variables declaration//GEN-END:variables

    private void setNorthPane(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
       
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.jpeg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
    
}
