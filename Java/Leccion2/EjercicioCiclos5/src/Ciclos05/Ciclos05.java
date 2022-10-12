/*
Ejercicio 5: Realizar un juego para adivinar 
un nro. Para ello, generar un nro aleatorio entre 0-100 
y luego ir pidiendo nros indicando "es mayor" o "es menor" segun sea mayor o menor con 
respecto a N-
El proceso termina cuando el usuario acierta y mostramos el nro de intenos.

*/
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
      Scanner  entrada = new Scanner (System.in);
    int numero, aleatorio, contador=0; //iniciamos las variables.
    aleatorio = (int) (Math.random()*100); //generamos un nro aleatorio
    //ciclo Do while
    do{
        System.out.println("Digite un nro: ");
        numero = Integer.parseInt(entrada.nextLine()); //recibimos el nro 
        if(numero<aleatorio){
            System.out.println("Digite un nro mayor.");
               }
        else if (numero>aleatorio){
            System.out.println("Digite un nro menor.");
        } 
        else{
            System.out.println("¡Felicitaciones! Adivinaste el número");
            
        }
    contador++;
    }while(numero !=aleatorio);
        System.out.println("Pudiste avidinar el número en: " + contador+ " intentos");
    }
}