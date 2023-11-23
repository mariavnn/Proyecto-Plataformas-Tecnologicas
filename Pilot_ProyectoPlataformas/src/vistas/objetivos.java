
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
public class objetivos extends javax.swing.JInternalFrame {

    public objetivos() {
        initComponents();
        setSize(800, 450);
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        fondo = new FondoPanel();
        tituloObjetivos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionObj = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(204, 204, 204));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloObjetivos.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        tituloObjetivos.setForeground(new java.awt.Color(0, 0, 0));
        tituloObjetivos.setText("OBJETIVOS");
        fondo.add(tituloObjetivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        descripcionObj.setEditable(false);
        descripcionObj.setBackground(new java.awt.Color(255, 255, 255));
        descripcionObj.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        descripcionObj.setForeground(new java.awt.Color(0, 0, 0));
        descripcionObj.setText("La presentación abordará la descripción de los dispositivos de almacenamiento secundario, detallando sus estructuras físicas y cómo estas influyen en sus usos y funcionalidades. Se explorarán diferentes tipos como discos duros, SSDs o unidades de cinta, destacando sus diseños y cómo impactan en la velocidad, capacidad y durabilidad. Además, se analizarán las características de rendimiento, algoritmos de E/S y los servicios que los sistemas operativos proporcionan para mejorar el almacenamiento masivo, incluyendo técnicas como RAID para optimizar la redundancia y velocidad de acceso a los datos.");
        jScrollPane1.setViewportView(descripcionObj);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 550, 210));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 420));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        tituloObjetivos.setText(texto.getString("tituloObjetivos"));
        descripcionObj.setText(texto.getString("descripcionObj"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane descripcionObj;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel tituloObjetivos;
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
