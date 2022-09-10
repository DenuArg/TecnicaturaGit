package CicloWhile;

public class EjercicioWhile01 {

    public static void main(String[] args) {
        var conteo = 0; // Inferencia de tipos
        while (conteo < 3) {
            System.out.println("Conteo = " + conteo);
            conteo++;
        }
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 7);
       //Uso de las palabras break  y continue junto a las etiquetas
       
       
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) { // extructura condicional
                System.out.println("contando = " + contando);
                break ;
            }
        }
        inicio:
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 != 0) { // extructura condicional
                continue inicio; //Vamos a la siguiente iteraciòn 
            }
            System.out.println("contando = " + contando);
        }
       
        }
    }

