
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
public class topic5 extends javax.swing.JInternalFrame {

    public topic5() {
        initComponents();
        setSize(800, 450);
    }
    
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        tituloTopic5.setText(texto.getString("tituloTopic5"));
        txtTopic5.setText(texto.getString("txtTopic5"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        tituloTopic5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTopic5 = new javax.swing.JTextPane();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 244, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloTopic5.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        tituloTopic5.setForeground(new java.awt.Color(0, 0, 0));
        tituloTopic5.setText("Gestor de Dispositivos de Almacenamiento");
        jPanel1.add(tituloTopic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        txtTopic5.setEditable(false);
        txtTopic5.setBackground(new java.awt.Color(255, 255, 255));
        txtTopic5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        txtTopic5.setForeground(new java.awt.Color(0, 0, 0));
        txtTopic5.setText("Para que el disco pueda almacenar archivos, el sistema operativo necesita establecer sus propias estructuras de datos en el disco. Este formateo lógico, también conocido como \"crear un sistema de archivos\", es esencial para la gestión de archivos. La partición raíz generalmente alberga el sistema operativo, mientras que otras particiones pueden contener sistemas operativos adicionales, sistemas de archivos o permanecer en estado crudo. Tras completarse con éxito, el sistema de archivos se añade a la tabla de montajes, permitiendo el acceso.\nEl bloque de arranque contiene información esencial que dirige al volumen de arranque o a un conjunto de bloques que contienen código para cargar el núcleo desde el sistema de archivos. Para aplicaciones que requieren gestión directa de bloques, omitiendo al sistema operativo, se dispone de acceso directo al disco crudo. Durante la inicialización del sistema, el programa de inicio almacenado en la memoria de solo lectura inicia el sistema. El programa cargador de inicio reside en los bloques de inicio de la partición de arranque, orquestando el inicio del sistema.");
        jScrollPane3.setViewportView(txtTopic5);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 710, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel tituloTopic5;
    private javax.swing.JTextPane txtTopic5;
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
