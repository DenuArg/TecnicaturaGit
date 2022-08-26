
# lista = Ariel, Liliana, Natalia, Osvaldo
# Lista con 4 elementos

nombres = ["Naty", "Osvaldo", "Lily", "Ariel"] # podemos usar las comillas dobles o comillas simples
print(nombres)
print(nombres[0]) # nos muestra el primer elemento de la lista
print(nombres[1])

# ¿Como podemos mostrar el ultimo elemento?
print(nombres[-1]) #el ultimo indice
print(nombres[-2]) #el penultimo indice

#recuperar un rango de la lista
print(nombres[0:2]) #recorrer una cantidad de indices, del 0 al 1, la posiciion 2 no la va a recorer.
print(nombres[ :3]) #queremos las tres primeras posiciones, el compilador entiende que empieza del indice 0
print(nombres[1: ]) #queremos que ejecute desde el indice 1

#modificar un valor de esa lista
nombres[2]="Liliana" #se modifica el indice 3
nombres[0]="Natalia"
print(nombres)

#ahora vamos a iterar nuestra lista con el ciclo for (para mostrar nombre por nombre)

for nombre in nombres: #nombre es singular, la lista es plural
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

# parte 3 de las listas

#preguntamos cuàntos elementos tiene una lista
print(len(nombres)) #le pasamos como parametro la lista, nos devuelve la cantidad de elementos de la lista

#agregamos un elemento, funcion para insertar un elemento en la lista
nombres.append("Marcelo") #se agrega al final de la lista
print(nombres) #efecto cola, se agrega al final de la fila

#insertar un elemento en un indice especifico
nombres.insert(0,"Carla") #se agrega un elemento, en la posicion 0
print(nombres)
nombres.insert(1,"Estela")
print(nombres)

#eliminar elemento especifico

nombres.remove("Osvaldo") # remover, elimina el nombre osvaldo
print(nombres)

# eliminar el ultimo elemento

nombres.pop() #elimina el ultimo elemento que habia en nuestra lista
print(nombres)

#eliminar un indice especifico
del nombres[1] #posisicion 1, Natalia tendria q desaparece
print(nombres)

#eliminar borrar todos los elementos
nombres.clear()
print(nombres) #aparecen solo los corchetes

#eliminar lista
del nombres
print(nombres)


