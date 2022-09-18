
package CicloWhile;

import javax.swing.JOptionPane;
public class Ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado;
      
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")); //trabaja con string
        while (numero >= 0) { //Mayor o igual a 0
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El número " + numero + " elevado al cuadrado es: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        System.out.println("El programa a finalizado por número negativo.");
    }
}
    
 

