
package vistas;


import java.awt.Component;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import logica.funcionBotones;


/**
 *
 */
public class main extends javax.swing.JFrame {
    private JInternalFrame[] topics;
    private int currentTopicIndex = 0;
    private funcionBotones btn;
    boolean traducir = false;

    public main() {
        initComponents();
        setLocationRelativeTo(null);
        setupInternalFrames();
        btn = new funcionBotones(topics);
        this.setLocationRelativeTo(null);
    }

    private void setupInternalFrames() {
        portada princi = new portada();
        contenidoo content = new contenidoo();
        objetivos obj = new objetivos();
        topic1 t1 = new topic1();
        topic2 t2 = new topic2();
        topic3 t3 = new topic3();
        topic4 t4 = new topic4();
        topic5 t5 = new topic5();
        topic6 t6 = new topic6();
        topic7 t7 = new topic7();
        topic8 t8 = new topic8();
        cuestionario1 quiz1 = new cuestionario1();
        cuestionario2 quiz2 = new cuestionario2();

        topics = new JInternalFrame[]{princi, content, obj, t1, t2, t3, t4, t5, t6, t7, t8, quiz1, quiz2};

        for (JInternalFrame frame : topics) {
            frame.setSize(800, 450);
            frame.setVisible(false);
            contenedor.add(frame);
        }

        topics[currentTopicIndex].setVisible(true);

    }
    
    public void translate(Locale locale){
        ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", locale);
        
        titulo.setText(texto.getString("titulo"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuDesplegable = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btnTranslate = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        btnRight = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        contenedor = new javax.swing.JDesktopPane();

        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        btnTranslate.setForeground(new java.awt.Color(255, 255, 255));
        btnTranslate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/translate (1).png"))); // NOI18N
        btnTranslate.setBorder(null);
        btnTranslate.setBorderPainted(false);
        btnTranslate.setContentAreaFilled(false);
        btnTranslate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTranslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranslateActionPerformed(evt);
            }
        });
        jPanel1.add(btnTranslate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 30, 30));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Sistema de Almacenamiento Masivo ");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 30));

        btnRight.setForeground(new java.awt.Color(255, 255, 255));
        btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow-narrow-right.png"))); // NOI18N
        btnRight.setBorder(null);
        btnRight.setBorderPainted(false);
        btnRight.setContentAreaFilled(false);
        btnRight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });
        jPanel1.add(btnRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 36, 30));

        btnLeft.setForeground(new java.awt.Color(255, 255, 255));
        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow-narrow-left.png"))); // NOI18N
        btnLeft.setBorder(null);
        btnLeft.setBorderPainted(false);
        btnLeft.setContentAreaFilled(false);
        btnLeft.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });
        jPanel1.add(btnLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 30, 30));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        cerrar.setBorder(null);
        cerrar.setBorderPainted(false);
        cerrar.setContentAreaFilled(false);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        contenedor.setBackground(new java.awt.Color(242, 244, 236));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menuDesplegable.removeAll();
        btn.agregarFuncionalidadMenuDesplegable(menuDesplegable, traducir); 

        int x = btnMenu.getX();
        int y = btnMenu.getY() + btnMenu.getHeight();
        menuDesplegable.show(this, x, y);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        // TODO add your handling code here
        btn.mostrarSiguienteFrame();
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        // TODO add your handling code here:
        btn.mostrarFrameAnterior();
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnTranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranslateActionPerformed
        // TODO add your handling code here:
        traducir = !traducir;
        Locale locale = traducir ? new Locale("en", "US") : new Locale("es", "ES");

        translate(locale); // Aplica la traducción al JFrame principal
        ((portada) topics[0]).translate(locale); // Aplica la traducción a la clase contenidoo
        ((contenidoo) topics[1]).translate(locale); // Aplica la traducción a la clase contenidoo
        ((objetivos) topics[2]).translate(locale);
        ((topic1) topics[3]).translate(locale);
        ((topic2) topics[4]).translate(locale);
        ((topic3) topics[5]).translate(locale);
        ((topic4) topics[6]).translate(locale);
        ((topic5) topics[7]).translate(locale);
        ((topic6) topics[8]).translate(locale);
        ((topic7) topics[9]).translate(locale);
        ((topic8) topics[10]).translate(locale);

    }//GEN-LAST:event_btnTranslateActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnTranslate;
    private javax.swing.JButton cerrar;
    private javax.swing.JDesktopPane contenedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu menuDesplegable;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
