
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
public class topic8 extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public topic8() {
        initComponents();
        setSize(800, 450);
    }
    
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        tituloTopic8.setText(texto.getString("tituloTopic8"));
        sub1TxtTopic8.setText(texto.getString("sub1TxtTopic8"));
        sub2TxtTopic8.setText(texto.getString("sub2TxtTopic8"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        tituloTopic8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sub1TxtTopic8 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        sub2TxtTopic8 = new javax.swing.JTextPane();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 244, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloTopic8.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        tituloTopic8.setForeground(new java.awt.Color(0, 0, 0));
        tituloTopic8.setText("Estructura de RAID");
        jPanel1.add(tituloTopic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        sub1TxtTopic8.setEditable(false);
        sub1TxtTopic8.setBackground(new java.awt.Color(255, 255, 255));
        sub1TxtTopic8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        sub1TxtTopic8.setForeground(new java.awt.Color(0, 0, 0));
        sub1TxtTopic8.setText("RAID, que significa Conjunto Redundante de Discos Económicos, involucra múltiples unidades de disco que aumentan la confiabilidad mediante la redundancia, incrementando así el tiempo medio hasta la falla. Esta configuración considera el tiempo medio de reparación y el tiempo de exposición durante el cual otra falla podría provocar la pérdida de datos, calculando el tiempo medio hasta la pérdida de datos basado en estos factores.\nRAID a menudo se combina con NVRAM (Memoria de Acceso Aleatorio No Volátil) para mejorar el rendimiento de escritura. Varias técnicas de uso de disco involucran a múltiples discos trabajando en conjunto. Por ejemplo, el rayado de disco utiliza un grupo de discos como una sola unidad de almacenamiento");
        jScrollPane3.setViewportView(sub1TxtTopic8);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 700, 140));

        sub2TxtTopic8.setEditable(false);
        sub2TxtTopic8.setBackground(new java.awt.Color(255, 255, 255));
        sub2TxtTopic8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        sub2TxtTopic8.setForeground(new java.awt.Color(0, 0, 0));
        sub2TxtTopic8.setText("RAID se puede organizar en seis niveles diferentes. Estos esquemas mejoran el rendimiento y la confiabilidad del sistema de almacenamiento al almacenar datos redundantes. Los niveles de RAID incluyen espejado o sombreado (RAID 1), que duplica cada disco, y configuraciones como espejos rayados (RAID 1+0) o rayas espejadas (RAID 0+1), ofreciendo alto rendimiento y confiabilidad.\nEl paridad entrelazada en bloques (RAID 4, 5, 6) utiliza significativamente menos redundancia. Sin embargo, es importante tener en cuenta que RAID dentro de un conjunto de almacenamiento aún puede fallar si el conjunto en sí mismo falla. Para mitigar este riesgo, la replicación automática de datos entre conjuntos es una práctica común. Además, a menudo se dejan algunos discos de repuesto en caliente sin asignar, reemplazando automáticamente un disco fallido y reconstruyendo los datos en ellos.");
        jScrollPane4.setViewportView(sub2TxtTopic8);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 700, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane sub1TxtTopic8;
    private javax.swing.JTextPane sub2TxtTopic8;
    private javax.swing.JLabel tituloTopic8;
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
