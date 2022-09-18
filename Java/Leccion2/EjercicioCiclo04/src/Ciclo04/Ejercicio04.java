/*
Ejercicio 04: Pedir número hasta que se teclee un número negativo
y mostrar cuántos números se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionPane 
 */
package Ciclo04;

import javax.swing.JOptionPane;

public class Ejercicio04 {

    public static void main(String[] args) {
        int numero, contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while (numero >= 0) {
            JOptionPane.showMessageDialog(null, "El número ingresado " + numero + " es positivo o 0.");
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
         JOptionPane.showMessageDialog(null, "El número ingresado " + numero + " es negativo, finaliza el programa. ");
        JOptionPane.showMessageDialog(null, "La cantidad de números ingresados fueron " + contador);
    }
}
