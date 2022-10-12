/*
Ejercicio 5: Realizar un juego para adivinar 
un nro. Para ello, generar un nro aleatorio entre 0-100 
y luego ir pidiendo nros indicando "es mayor" o "es menor" segun sea mayor o menor con 
respecto a N-
El proceso termina cuando el usuario acierta y mostramos el nro de intenos.
 */
package Ciclos05;

import javax.swing.JOptionPane;

public class Ejercicio05 {

    public static void main(String[] args) {

        int numero, aleatorio, contador = 0; //iniciamos las variables.
        aleatorio = (int) (Math.random() * 100); //generamos un nro aleatorio
        //ciclo Do while
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")); //recibimos el nro 
            if (numero < aleatorio) {
                JOptionPane.showMessageDialog(null, "Digite un nro mayor.");
            } else if (numero > aleatorio) {
                JOptionPane.showMessageDialog(null, "Digite un nro menor.");
            } else {
                JOptionPane.showMessageDialog(null, "¡Felicitaciones! Adivinaste el número");

            }
            contador++;
        } while (numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Pudiste avidinar el número en: " + contador + " intentos");
    }
}