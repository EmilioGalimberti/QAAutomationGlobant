

//Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener
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