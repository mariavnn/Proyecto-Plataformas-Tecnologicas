
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
public class topic2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public topic2() {
        initComponents();
        setSize(800, 450);
    }
    
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        tituloTopic2.setText(texto.getString("tituloTopic2"));
        txtTopic2.setText(texto.getString("txtTopic2"));
        subTituTopic2.setText(texto.getString("subTituTopic2"));
        sub1TxtTopic2.setText(texto.getString("sub1TxtTopic2"));
        sub2txtTopic2.setText(texto.getString("sub2txtTopic2"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTopic2 = new javax.swing.JTextPane();
        subTituTopic2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sub1TxtTopic2 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        sub2txtTopic2 = new javax.swing.JTextPane();
        tituloTopic2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 244, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTopic2.setEditable(false);
        txtTopic2.setBackground(new java.awt.Color(255, 255, 255));
        txtTopic2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        txtTopic2.setForeground(new java.awt.Color(0, 0, 0));
        txtTopic2.setText("El sistema operativo debe optimizar el uso del hardware para garantizar tiempos de acceso rápidos y ancho de banda óptimo en las unidades de disco. En la programación de disco, distintas fuentes generan solicitudes de E/S de disco, desde el sistema operativo hasta los procesos del sistema y del usuario. Estas solicitudes incluyen detalles como modo de entrada/salida, dirección del disco, dirección de memoria y sectores a transferir. En el pasado, el sistema operativo se encargaba de la gestión de colas y la programación de la cabeza del disco, pero ahora estas tareas son responsabilidad de dispositivos de almacenamiento y controladores.");
        jScrollPane1.setViewportView(txtTopic2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 750, 120));

        subTituTopic2.setFont(new java.awt.Font("Garamond", 1, 27)); // NOI18N
        subTituTopic2.setForeground(new java.awt.Color(0, 0, 0));
        subTituTopic2.setText("Algoritmos de programación del disco: ");
        subTituTopic2.setToolTipText("");
        jPanel1.add(subTituTopic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("C- SCAN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 84, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("SCAN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 58, -1));

        sub1TxtTopic2.setEditable(false);
        sub1TxtTopic2.setBackground(new java.awt.Color(255, 255, 255));
        sub1TxtTopic2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        sub1TxtTopic2.setForeground(new java.awt.Color(0, 0, 0));
        sub1TxtTopic2.setText("El algoritmo SCAN, conocido como algoritmo del elevador, gestiona las solicitudes de disco al mover el brazo del disco de un extremo al otro, atendiendo las solicitudes en su trayecto. Sin embargo, las solicitudes concentradas en el extremo opuesto al inicio del movimiento del brazo pueden experimentar mayores tiempos de espera si están distribuidas desigualmente a lo largo del disco.");
        jScrollPane3.setViewportView(sub1TxtTopic2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 365, 160));

        sub2txtTopic2.setEditable(false);
        sub2txtTopic2.setBackground(new java.awt.Color(255, 255, 255));
        sub2txtTopic2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        sub2txtTopic2.setForeground(new java.awt.Color(0, 0, 0));
        sub2txtTopic2.setText("Ofrece tiempos de espera más consistentes que SCAN. Así es cómo funciona: el cabezal se desplaza de un extremo al otro del disco, atendiendo solicitudes en el camino. Una vez que llega al final, regresa rápidamente al inicio del disco sin atender solicitudes en el viaje de retorno. Considera los cilindros como una lista circular, que se mueve del último cilindro al primero.");
        jScrollPane2.setViewportView(sub2txtTopic2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 360, 160));

        tituloTopic2.setFont(new java.awt.Font("Garamond", 1, 27)); // NOI18N
        tituloTopic2.setForeground(new java.awt.Color(0, 0, 0));
        tituloTopic2.setText("Programacion de HDD");
        jPanel1.add(tituloTopic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane sub1TxtTopic2;
    private javax.swing.JTextPane sub2txtTopic2;
    private javax.swing.JLabel subTituTopic2;
    private javax.swing.JLabel tituloTopic2;
    private javax.swing.JTextPane txtTopic2;
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
