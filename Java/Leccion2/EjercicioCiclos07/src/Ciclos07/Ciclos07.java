//Ejercicio7: Pedir números hasta que se introduzca un número negativo y calcular la media
package Ciclos07;
import java.util.Scanner;
public class Ciclos07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0, suma = 0; // Definimos nuestras Variables  
        float mediaAritmetica = 0;
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) { // Mientras numero sea positivo
            suma += numero; // Se sumaran todos los numeros y los almacena en la variable suma
            contador++; // Cada vez que se ingrese un numero, se le suma 1 al contador
            System.out.println("Ingrese otro número");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if (contador == 0) {
            System.out.println("No es posible dividir entre cero");
        } else {
            mediaAritmetica = (float) suma / contador;
            System.out.println("La media aritmética es: " + mediaAritmetica);
        }
    }
}
