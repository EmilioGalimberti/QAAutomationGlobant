Algoritmo ej2Creoo3
	
	//	Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
	//	programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
	//	todos ellos.
	
	Definir num, numMax, numMin, i Como Entero
	Definir suma Como Real
	
	i=0
	suma = 0
	
	Escribir "Escriba un n�mero: "
	Leer num
	
	numMin=num
	numMax=num
	
	Hacer
		
		Si num < numMin
			numMin = num
		FinSi
		
		Si num > numMax
			numMax = num
		FinSi
		
		i = i + 1
		
		suma = suma + num
		
		Escribir "Escriba un n�mero: "
		Leer num
		
	Mientras Que num <> 0
	
	Escribir "El n�mero minimo es " numMin ", el m�ximo es " numMax " y el promedio de sus n�meros es " suma/i
	
FinAlgoritmo