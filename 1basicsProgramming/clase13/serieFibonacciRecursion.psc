Algoritmo serieFibonacciRecursion
	Definir num,i Como Entero
	leer num
	
	Para i=0 Hasta num Con Paso 1 Hacer
		Escribir serieFibonacci(i)
	Fin Para
	
FinAlgoritmo

Funcion n = serieFibonacci(num1)
	Definir n Como Entero
	si num1 == 0 Entonces
		n = 0
	SiNo
		Si num1 == 1 Entonces
			n = 1
		SiNo
			n = serieFibonacci(num1-1) + serieFibonacci(num1-2)
		FinSi
	FinSi
	
	
FinFuncion

//no me salio