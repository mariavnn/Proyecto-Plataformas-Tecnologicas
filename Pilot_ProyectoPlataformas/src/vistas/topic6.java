
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
public class topic6 extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public topic6() {
        initComponents();
        setSize(800, 450);
    }
    
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        tituloTopic6.setText(texto.getString("tituloTopic6"));
        txtTopic6.setText(texto.getString("txtTopic6"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        tituloTopic6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTopic6 = new javax.swing.JTextPane();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 244, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloTopic6.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        tituloTopic6.setText("Gestión de Espacio de Intercambio");
        jPanel1.add(tituloTopic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 460, -1));

        txtTopic6.setEditable(false);
        txtTopic6.setBackground(new java.awt.Color(255, 255, 255));
        txtTopic6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        txtTopic6.setText("Utilizado para transferir procesos completos (intercambio) o páginas (paginación) desde la RAM a un almacenamiento secundario cuando la capacidad de la RAM no es suficiente para todos los procesos. El sistema operativo se encarga de la gestión del espacio de intercambio. El almacenamiento secundario es más lento que la RAM, por lo que optimizar el rendimiento se vuelve crucial. A menudo, es posible tener varios espacios de intercambio, lo que reduce la carga de E/S en dispositivos individuales. Es preferible usar dispositivos dedicados, que pueden estar en particiones en crudo o archivos dentro de un sistema de archivos para facilitar su añadido.");
        jScrollPane3.setViewportView(txtTopic6);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 400, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel tituloTopic6;
    private javax.swing.JTextPane txtTopic6;
    // End of variables declaration//GEN-END:variables
    
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondoPanel2.jpeg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
