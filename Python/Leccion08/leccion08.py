class Rectangulo:
    '''
    crear una clase llamada rectangulo, debe tener 2 atributos: altura y base el nombre del metodo sera calcular area utilizando la formula:
    area = base * altura pero la base y la altura deben ser ingresadas por el usuario y los objetos deben ser 3
    '''

    def __init__(self, altura, base):
        self.altura = altura
        self.base = base
    def calcular_area(self):
        return self.base * self.altura
base = int(input("Ingrese el número para la base del rectángulo: "))
altura = int(input("Ingrese el número para la altura del rectángulo: "))
rectangulo1 = Rectangulo (base, altura)
print(f"El área del rectángulo es: {rectangulo1.calcular_area()}")