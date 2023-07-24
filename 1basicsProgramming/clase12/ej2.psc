

//Realizar una función que valide si un número es impar o no. Si es impar la función debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener
//mensajes que digan si es par o no, eso debe pasar en el Algoritmo.

Funcion retorno <- parImpar(num)
	Definir retorno Como Logico
	retorno = (num MOD 2) <> 0
Fin Funcion

Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	
	Si parImpar(num) Entonces
		Escribir "Es impar"
	SiNo
		Escribir "Es par"
	FinSi
	
FinAlgoritmo




//  numero MOD 2

//  sumar = num1 + num2
//