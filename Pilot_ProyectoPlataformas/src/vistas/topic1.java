
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
public class topic1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form topic1
     */
    public topic1() {
        initComponents();
        setSize(800, 450);
        setResizable(false);
    }
    
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        sub1txtTopic1.setText(texto.getString("sub1txtTopic1"));
        sub2txtTopic1.setText(texto.getString("sub2txtTopic1"));
        tituloTopic1.setText(texto.getString("tituloTopic1"));
        txtTopic1.setText(texto.getString("txtTopic1"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new FondoPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTopic1 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        sub1txtTopic1 = new javax.swing.JTextPane();
        sub2TituTopic1 = new javax.swing.JLabel();
        sub1TituTopic1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sub2txtTopic1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tituloTopic1 = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTopic1.setEditable(false);
        txtTopic1.setBackground(new java.awt.Color(255, 255, 255));
        txtTopic1.setBorder(null);
        txtTopic1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        txtTopic1.setForeground(new java.awt.Color(0, 0, 0));
        txtTopic1.setText("Las formas primarias de almacenamiento secundario en las computadoras modernas son los discos duros (HDDs) y los dispositivos de memoria no volátil (NVM). ");
        jScrollPane2.setViewportView(txtTopic1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 290, 160));

        sub1txtTopic1.setEditable(false);
        sub1txtTopic1.setBackground(new java.awt.Color(255, 255, 255));
        sub1txtTopic1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        sub1txtTopic1.setForeground(new java.awt.Color(0, 0, 0));
        sub1txtTopic1.setText("Los HDDs funcionan haciendo girar discos recubiertos magnéticamente debajo de cabezales de lectura y escritura en movimiento.");
        jScrollPane1.setViewportView(sub1txtTopic1);
        sub1txtTopic1.setEditable(false);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 330, 110));

        sub2TituTopic1.setFont(new java.awt.Font("Garamond", 1, 26)); // NOI18N
        sub2TituTopic1.setForeground(new java.awt.Color(0, 0, 0));
        sub2TituTopic1.setText("NVM");
        jPanel1.add(sub2TituTopic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 84, -1));

        sub1TituTopic1.setFont(new java.awt.Font("Garamond", 1, 26)); // NOI18N
        sub1TituTopic1.setForeground(new java.awt.Color(0, 0, 0));
        sub1TituTopic1.setText("HDDs");
        jPanel1.add(sub1TituTopic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 84, 20));

        sub2txtTopic1.setEditable(false);
        sub2txtTopic1.setBackground(new java.awt.Color(255, 255, 255));
        sub2txtTopic1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        sub2txtTopic1.setForeground(new java.awt.Color(0, 0, 0));
        sub2txtTopic1.setText("Los dispositivos de memoria no volátil, como los discos de estado sólido (SSD), vienen en diversas formas como unidades USB.\nAunque suelen ser más confiables que los HDD, también son más costosos por MB, pueden tener una vida útil más corta que requiere un manejo cuidadoso, ofrecen menos capacidad, pero cuentan con un rendimiento significativamente más rápidos.");
        jScrollPane3.setViewportView(sub2txtTopic1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 370, 150));

        tituloTopic1.setEditable(false);
        tituloTopic1.setBackground(new java.awt.Color(255, 255, 255));
        tituloTopic1.setBorder(null);
        tituloTopic1.setFont(new java.awt.Font("Garamond", 1, 25)); // NOI18N
        tituloTopic1.setForeground(new java.awt.Color(0, 0, 0));
        tituloTopic1.setText("Vision General De la Estructura de Almacenamiento Masivo");
        tituloTopic1.setAutoscrolls(false);
        jScrollPane4.setViewportView(tituloTopic1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 360, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -3, 810, 420));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel sub1TituTopic1;
    private javax.swing.JTextPane sub1txtTopic1;
    private javax.swing.JLabel sub2TituTopic1;
    private javax.swing.JTextPane sub2txtTopic1;
    private javax.swing.JTextPane tituloTopic1;
    private javax.swing.JTextPane txtTopic1;
    // End of variables declaration//GEN-END:variables

    private void setNorthPane(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
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
