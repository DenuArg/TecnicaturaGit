/*
Ejercicio 04: Pedir número hasta que se teclee un número negativo
y mostrar cuántos números se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionPane
 */
package Ciclo04;

import java.util.Scanner;

public class Ciclo04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            System.out.println("El número ingresado: " + numero + " es positivo.");
            contador++;
            System.out.println("Digite otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
            System.out.println("El número ingresado " + numero + " es negativo, finaliza el programa. ");
            System.out.println("La cantidad de números ingresados fueron " + contador);
        }
    }
