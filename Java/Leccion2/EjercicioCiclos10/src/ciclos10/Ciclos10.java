// Ejercicio10: Pedir 10 numeros y escribir la total
//Hacerlo con la Clase Scanner y JOptionPane
package ciclos10;

import java.util.Scanner;

public class Ciclos10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            //dentro de este ciclo
            System.out.println("Ingrese un número: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }
    System.out.println("La suma de todos los números es: "+ suma);
    }
}
