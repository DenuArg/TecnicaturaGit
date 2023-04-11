
import java.util.Scanner;

// Mi clase es Java

public class HolaMundo {

    //vamos a escribir un metodo
    public static void main(String[] args) {
/*        
//      System.out.println("Hola Mundo desde Java.");
       //Definimos la variable
        int miVariableEntera = 10; // se define la variable con la pabala int
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5; // no se tiene que volver a definir la variable
        System.out.println(miVariableEntera);
   
        //
        String miVariableCadena= "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //Var Inferencia de tipos en java
        var miVariableEntera2 = 15; //inferencia de tipos
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Somos Amigos";
        System.out.println(miVariableCadena2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2); 
        
       //Valores permitidos en el nombre de la variables
       //var 1MiVariable = 3 
       var miVariable = 1;
       var _miVariable = 2;
       var $miVariable = 3;
       var áVariable = 10; // No se recomiendan los acentos
     //  var #miVariable = 2 ; No está permitido
        System.out.println("áVariable = " + áVariable);
        */
  //Vamos a definir dos variables del tipo string
  var usuario = "Juan";
  var titulo = "Ingeniero";
  var union = titulo + " " + usuario;
        System.out.println("union = "  + union);
        
        var i = 3;
        var j = 4; // se está infiriendo el tipo de variable
        System.out.println(i + j); // se está realizando la suma
        System.out.println(i + j + usuario); // primero se realizo la suam y luego la concateniacion
        System.out.println(usuario + i + j); // se realiza una concatenacion. Contexto Cadena
        
        var nombre = "Karla";
        System.out.println("nombre = " + nombre);
        
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner (System.in); 
        var usuario1 = consola.nextLine(); // lee una linea completa de la consola.
        System.out.println("usuario1 = " + usuario1);
        
        System.out.println("Escribe el titulo:");
        var titulo2 = consola.nextLine ();
        System.out.println("titulo2 = " + titulo);
        
        
        
        
        
        
     
       
        
        
        
        
    }
}
