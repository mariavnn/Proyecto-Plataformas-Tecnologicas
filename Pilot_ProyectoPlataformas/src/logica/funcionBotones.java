package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author maria
 */
public class funcionBotones {

    private int currentFrameIndex = 0;
    private final JInternalFrame[] frames;

    public funcionBotones(JInternalFrame[] frames) {
        this.frames = frames;
        cambiarVisibilidad();
    }

    public void mostrarSiguienteFrame() {
        frames[currentFrameIndex].setVisible(false);
        currentFrameIndex = (currentFrameIndex + 1) % frames.length;
        if (currentFrameIndex != 0) {
            cambiarVisibilidad();
        } else {
            currentFrameIndex = frames.length - 1;
            cambiarVisibilidad();
        }
    }

    public void mostrarFrameAnterior() {
        frames[currentFrameIndex].setVisible(false);
        if (currentFrameIndex != 0) {
            currentFrameIndex = (currentFrameIndex - 1 + frames.length) % frames.length;
        }
        cambiarVisibilidad();
    }
    public void agregarFuncionalidadMenuDesplegable(JPopupMenu menuDesplegable, boolean translate) {
    Locale currentLocale = translate ? new Locale("en", "US") : new Locale("es", "ES");
    ResourceBundle texto = ResourceBundle.getBundle("idiomas.texto", currentLocale);

    String[] menuKeys = {"menu_contenido", "menu_objetivos", "menu_tema", "menu_quiz_parte_1", "menu_quiz_parte_2"};
    
    for (int i = 0; i < frames.length; i++) {
        JInternalFrame frame = frames[i];
        JMenuItem menuItem = new JMenuItem();

        if (i == 11) {
            String menuText = texto.getString("menu_quiz_parte_1");
            menuItem.setText(menuText);
        } else if (i == 12) {
            String menuText = texto.getString("menu_quiz_parte_2");
            menuItem.setText(menuText);
        } else {
            String menuText = (i < menuKeys.length) ? texto.getString(menuKeys[i]) : texto.getString("menu_tema") + " " + (i - 1);
            menuItem.setText(menuText);
        }

        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int j = 0; j < frames.length; j++) {
                    if (frames[j] == frame) {
                        currentFrameIndex = j;
                        cambiarVisibilidad();
                        break;
                    }
                }
            }
        });

        menuDesplegable.add(menuItem);
    }
}

    public void cambiarVisibilidad() {
        for (int i = 0; i < frames.length; i++) {
            frames[i].setVisible(i == currentFrameIndex);
        }
    }
    
    public static void botonContinuar2(JInternalFrame pantalla) { //continuar pantallas
        pantalla.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        pantalla.setVisible(true);
    }
    
    public static void botonContinuar1(JFrame frame) { //continuar pantallas
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
