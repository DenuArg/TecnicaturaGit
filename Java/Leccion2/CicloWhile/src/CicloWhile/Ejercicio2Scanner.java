/*
Leer un nro e indicar si es positivo o negativo.
El proceso se repetirá hasta que se introduzca un cero.
 */
package CicloWhile;

import java.util.Scanner;

public class Ejercicio2Scanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {;
                System.out.println("El número " + numero + " es positivo");
            } else {
                System.out.println("El número " + numero + " es negativo");
            }
            System.out.println("Digite otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
    
    System.out.println ("El programa a finalizado por ingresar el 0.");
    }
}