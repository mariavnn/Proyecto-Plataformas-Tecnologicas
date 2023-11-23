package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
    if (currentFrameIndex == 11) {
        // Mostrar una alerta indicando que se deben usar los botones del cuestionario
        JOptionPane.showMessageDialog(null, "Usar los botones del cuestionario");
    } else {
        frames[currentFrameIndex].setVisible(false);
        currentFrameIndex = (currentFrameIndex + 1) % frames.length;
        if (currentFrameIndex != 0) {
            cambiarVisibilidad();
        } else {
            currentFrameIndex = frames.length - 1;
            cambiarVisibilidad();
        }
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

    String[] menuKeys = {"menu_principal", "menu_contenido", "menu_objetivos", "menu_tema", "menu_quiz_parte_1", "menu_quiz_parte_2"};
    
    for (int i = 0; i < frames.length; i++) {
        JInternalFrame frame = frames[i];
        final int index = i; 
        JMenuItem menuItem = new JMenuItem();

        String menuText;
        switch (i) {
            case 0:
                menuText = texto.getString("menu_principal");
                break;
            case 1:
                menuText = texto.getString("menu_contenido");
                break;
            case 2:
                menuText = texto.getString("menu_objetivos");
                break;
            case 11:
                menuText = texto.getString("menu_quiz_parte_1");
                break;
            case 12:
                menuText = texto.getString("menu_quiz_parte_2");
                break;
            default:
                if (i >= 3 && i <= 10) {
                    menuText = texto.getString("menu_tema") + " " + (i - 2);
                } else {
                    menuText = (i < menuKeys.length) ? texto.getString(menuKeys[i]) : texto.getString("menu_tema") + " " + (i - 2);
                }
                break;
        }

        menuItem.setText(menuText);

        menuItem.addActionListener(e -> {
            currentFrameIndex = index;
            cambiarVisibilidad();
        });

        menuDesplegable.add(menuItem);
    }
}

    

    public void cambiarVisibilidad() {
        for (int i = 0; i < frames.length; i++) {
            frames[i].setVisible(i == currentFrameIndex);
        }
    }
    

}
