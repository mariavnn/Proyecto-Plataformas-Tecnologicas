
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
public class topic3 extends javax.swing.JInternalFrame {


    public topic3() {
        initComponents();
        setSize(800, 450);
    }
    
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        tituloTopic3.setText(texto.getString("tituloTopic3"));
        txtTopic3.setText(texto.getString("txtTopic3"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTopic3 = new javax.swing.JTextPane();
        tituloTopic3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 244, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTopic3.setEditable(false);
        txtTopic3.setBackground(new java.awt.Color(255, 255, 255));
        txtTopic3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        txtTopic3.setForeground(new java.awt.Color(0, 0, 0));
        txtTopic3.setText("En RHEL 7 se emplea el método NOOP (sin programación), consolidando las solicitudes adyacentes de Dirección Lógica de Bloque (LBA), eliminando cabezas de disco o latencia rotacional. La memoria no volátil (NVM) destaca en E/S aleatorias, mientras que los discos duros (HDD) tienen un mejor rendimiento en tareas secuenciales. Ambos muestran un rendimiento comparable. La NVM produce significativamente más Operaciones de Entrada/Salida por Segundo (IOPS) que los HDD (cientos de miles frente a cientos). Sin embargo, la ventaja en el rendimiento de NVM puede disminuir debido a la amplificación de escritura, donde un solo escriba desencadena recolección de basura y numerosas lecturas/escrituras, afectando la eficiencia general.");
        jScrollPane1.setViewportView(txtTopic3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 690, 260));

        tituloTopic3.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        tituloTopic3.setForeground(new java.awt.Color(0, 0, 0));
        tituloTopic3.setText("Programacion de NVM");
        jPanel1.add(tituloTopic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloTopic3;
    private javax.swing.JTextPane txtTopic3;
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
