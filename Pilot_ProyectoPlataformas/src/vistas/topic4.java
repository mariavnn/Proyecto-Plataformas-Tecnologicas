
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
public class topic4 extends javax.swing.JInternalFrame {

    public topic4() {
        initComponents();
        setSize(800, 450);
    }
    
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        tituloTopic4.setText(texto.getString("tituloTopic4"));
        sub1TxtTopic4.setText(texto.getString("sub1TxtTopic4"));
        sub2TxtTopic4.setText(texto.getString("sub2TxtTopic4"));
        sub3TxtTopic4.setText(texto.getString("sub3TxtTopic4"));
        sub4TxtTopic4.setText(texto.getString("sub4TxtTopic4"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sub4TxtTopic4 = new javax.swing.JTextPane();
        tituloTopic4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sub1TxtTopic4 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        sub2TxtTopic4 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        sub3TxtTopic4 = new javax.swing.JTextPane();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 244, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sub4TxtTopic4.setEditable(false);
        sub4TxtTopic4.setBackground(new java.awt.Color(255, 255, 255));
        sub4TxtTopic4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        sub4TxtTopic4.setForeground(new java.awt.Color(0, 0, 0));
        sub4TxtTopic4.setText("Otra técnica común de detección de errores, especialmente en redes, es el chequeo de redundancia cíclica (CRC), utilizando una función hash para identificar errores de múltiples bits. Sin embargo, el código de corrección de errores (ECC) va más allá de la mera detección; puede corregir ciertos errores. Los errores suaves son corregibles, mientras que los errores duros solo se identifican, pero no se corrigen.");
        jScrollPane1.setViewportView(sub4TxtTopic4);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 670, 110));

        tituloTopic4.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        tituloTopic4.setForeground(new java.awt.Color(0, 0, 0));
        tituloTopic4.setText("Detección y Corrección de errores ");
        jPanel1.add(tituloTopic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        sub1TxtTopic4.setEditable(false);
        sub1TxtTopic4.setBackground(new java.awt.Color(255, 255, 255));
        sub1TxtTopic4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        sub1TxtTopic4.setForeground(new java.awt.Color(0, 0, 0));
        sub1TxtTopic4.setText("La detección de errores es fundamental en diversos aspectos informáticos como memoria, redes y almacenamiento. ");
        jScrollPane3.setViewportView(sub1TxtTopic4);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 670, 70));

        sub2TxtTopic4.setEditable(false);
        sub2TxtTopic4.setBackground(new java.awt.Color(255, 255, 255));
        sub2TxtTopic4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        sub2TxtTopic4.setForeground(new java.awt.Color(0, 0, 0));
        sub2TxtTopic4.setText("Determina si ha ocurrido un problema, como la inversión de un bit, pudiendo detener operaciones al detectarlo. ");
        jScrollPane2.setViewportView(sub2TxtTopic4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 320, 120));

        sub3TxtTopic4.setEditable(false);
        sub3TxtTopic4.setBackground(new java.awt.Color(255, 255, 255));
        sub3TxtTopic4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        sub3TxtTopic4.setForeground(new java.awt.Color(0, 0, 0));
        sub3TxtTopic4.setText("Un método, utilizando un bit de paridad, verifica errores empleando aritmética modular para calcular, almacenar y comparar valores en palabras de longitud fija.");
        jScrollPane4.setViewportView(sub3TxtTopic4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 320, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane sub1TxtTopic4;
    private javax.swing.JTextPane sub2TxtTopic4;
    private javax.swing.JTextPane sub3TxtTopic4;
    private javax.swing.JTextPane sub4TxtTopic4;
    private javax.swing.JLabel tituloTopic4;
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
