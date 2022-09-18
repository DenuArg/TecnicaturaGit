/*
 Leer un nro e indicar si es positivo o negativo.
El proceso se repetirá hasta que se introduzca un cero.
 */
package CicloWhile;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")); //trabaja con string
        while (numero != 0) { //distinto 0
            if (numero > 0) {
                System.out.println("El número " + numero + " es positivo");
            } else {
                System.out.println("El número " + numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));

        }

        System.out.println("El programa a finalizado por ingresar el 0.");
    }
}
