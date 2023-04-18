// vamos a trabajar con el ciclo WHILE
let contador = 0;
while(contador <3){
    console.log(contador);
    contador++
}
console.log("Fin del ciclo while");

//ciclo DO WHILE
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo<3);
console.log("Fin del ciclo do while");

//Ciclo FOR
for(let contando = 0 ; contando < 3;contando++){
console.log(contando);
}
console.log("Fin del ciclo for"); 

//Palabra reservada break
for (let contando =0; contando<=10; contando++){
    if (contando %2 ==0){
        console.log(contando);//Mostrará todos los números pares
        break;
    }
}
console.log("Termina el ciclo al encontrar el primer número par");

//La palabra continue y etiquetas  labels
inicio: //esta palabra es una label
for (let contando = 0; contando <=10; contando++){
    if(contando%2 !==0){
        continue inicio; // irá a la siguiente interación
    }
    console.log(contando);
}
console.log("Termina el ciclo");