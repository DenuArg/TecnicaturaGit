/*
Ejericio 3: Leer números hasta que se introduzca un cero.
Para cada uno indicar si es par o impar.
Primero hacerlo con la Clase Scanner 
Luevo con la clase JOptionPane 
 */
package Ciclos03;

import javax.swing.JOptionPane;

public class Ciclos03 {

    public static void main(String[] args) {
        
        System.out.println("Digite un número: ");
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número ingresado " + numero + " es Par.");
            } else {
                JOptionPane.showMessageDialog(null, "El número ingresado " + numero + " es Impar.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "El número ingresado es: " + numero + " finaliza el programa");
    }
}
