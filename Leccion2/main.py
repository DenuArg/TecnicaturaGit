# Ejercicio 4 Etapas de la vida

edad = int(input('Ingrese su edad: '))
etapa = None
if 0 < edad < 10:
    etapa = "La mejor etapa de la vida y no la supimos aprovechar"
elif 10 <= edad <= 19:
    etapa = "El estudio es lo principal"
elif 20 <= edad <= 29:
    etapa = "La escuela se terminó... hay que hacer otras cosas"
elif 30 <= edad <= 39:
    etapa = "Equilibrio entre trabajar y la familia"
elif 40 <= edad <= 49:
    etapa = "Los años se viven de otra manera"
elif 50 <= edad <= 59:
    etapa = "Te sobra experiencia"
elif 60 <= edad <= 69:
    etapa = "Aparecen los primero nietos"
elif 70 <= edad <= 79:
    etapa = "Estás?"
print(f"si tu edad es: {edad} tu estado es: {etapa}")


calificacion = int(input('Ingrese una calificacion: '))
nota = None
if 9 <= calificacion <= 10:
    nota = "A"
elif 8 <= calificacion < 9:
    nota = "B"
elif 7 <= calificacion < 8:
    nota = "C"
elif 6 <= calificacion < 7:
    nota = "D"
elif 0 <= calificacion < 6:
    nota = "F"
else:
    nota = "Incorrecta"
print(f"Su calificacion es: {nota}")
