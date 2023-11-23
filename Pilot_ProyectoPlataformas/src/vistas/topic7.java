
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
public class topic7 extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public topic7() {
        initComponents();
        setSize(800, 450);
    }
    
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        tituloTopic7.setText(texto.getString("tituloTopic7"));
        sub1TxtTopic7.setText(texto.getString("sub1TxtTopic7"));
        sub2TxtTopic7.setText(texto.getString("sub2TxtTopic7"));
        sub3TxtTopic7.setText(texto.getString("sub3TxtTopic7"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        tituloTopic7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sub1TxtTopic7 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        sub2TxtTopic7 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        sub3TxtTopic7 = new javax.swing.JTextPane();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 244, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloTopic7.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        tituloTopic7.setForeground(new java.awt.Color(0, 0, 0));
        tituloTopic7.setText("Conexión de Almacenamiento");
        jPanel1.add(tituloTopic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 30));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(0, 0, 0));

        sub1TxtTopic7.setEditable(false);
        sub1TxtTopic7.setBackground(new java.awt.Color(255, 255, 255));
        sub1TxtTopic7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        sub1TxtTopic7.setForeground(new java.awt.Color(0, 0, 0));
        sub1TxtTopic7.setText("Las computadoras acceden al almacenamiento de tres formas principales: host-attached (adjunto al host), network-attached (adjunto a la red) y en la nube. ");
        jScrollPane3.setViewportView(sub1TxtTopic7);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 710, 90));

        sub2TxtTopic7.setEditable(false);
        sub2TxtTopic7.setBackground(new java.awt.Color(255, 255, 255));
        sub2TxtTopic7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        sub2TxtTopic7.setForeground(new java.awt.Color(0, 0, 0));
        sub2TxtTopic7.setText("El acceso adjunto al host implica puertos locales de E/S y utiliza diversas tecnologías. Buses de almacenamiento como USB, firewire y thunderbolt se utilizan para conectar múltiples dispositivos, mientras que los sistemas de gama alta suelen emplear canal de fibra (FC). El FC es una arquitectura serial de alta velocidad que utiliza cables de fibra o cobre, permitiendo que múltiples hosts y dispositivos de almacenamiento se conecten a la infraestructura de FC.");
        jScrollPane2.setViewportView(sub2TxtTopic7);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 340, 230));

        sub3TxtTopic7.setEditable(false);
        sub3TxtTopic7.setBackground(new java.awt.Color(255, 255, 255));
        sub3TxtTopic7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        sub3TxtTopic7.setForeground(new java.awt.Color(0, 0, 0));
        sub3TxtTopic7.setText("El almacenamiento conectado a la red (NAS, por sus siglas en inglés) ofrece acceso al almacenamiento a través de una red en lugar de una conexión local, como un bus. Implica la conexión remota a sistemas de archivos, comúnmente utilizando protocolos como NFS y CIFS. Este acceso se facilita a través de llamadas a procedimientos remotos (RPC, por sus siglas en inglés) entre hosts y almacenamiento, normalmente utilizando TCP o UDP en una red IP. ");
        jScrollPane4.setViewportView(sub3TxtTopic7);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 330, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane sub1TxtTopic7;
    private javax.swing.JTextPane sub2TxtTopic7;
    private javax.swing.JTextPane sub3TxtTopic7;
    private javax.swing.JLabel tituloTopic7;
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
