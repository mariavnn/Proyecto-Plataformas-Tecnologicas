/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author maria
 */
public class Quiz {
    private int score = 0;
    
    public Quiz() {
        score = 0; 
    }
    
    public void evaluarRespuesta(boolean esCorrecto) {
        if (esCorrecto) {
            score++;
        }
    }

    public int getPuntaje() {
        return score; 
    }
    
    public int resetearPuntaje(){
        return score = 0;
    }
    
    public void mostrarPuntajeFinal() {
        // Mostrar ventana de alerta con el puntaje final
        javax.swing.JOptionPane.showMessageDialog(
            null,
            "¡Puntaje final: " + score + "!",
            "Puntaje Final",
            javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    
}
