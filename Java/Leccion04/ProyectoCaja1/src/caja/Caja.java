package caja;

public class Caja {

    // Los atributos son:
    int base;
    int altura;
    int profundidad;

    // metodos y constructores
    public Caja() {//Constructor vacio        
    }
//constructor con parámetros

    public Caja(int base, int altura, int profundidad) {//constructor 2  
        this.base = base;
        this.altura = altura;
        this.profundidad = profundidad;
    }

    public int CalcularVolumen() {
        return base * altura * profundidad;
    }
}
