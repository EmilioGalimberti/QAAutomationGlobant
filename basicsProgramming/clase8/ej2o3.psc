Algoritmo ej2Creoo3
	
	//	Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
	//	programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
	//	todos ellos.
	
	Definir num, numMax, numMin, i Como Entero
	Definir suma Como Real
	
	i=0
	suma = 0
	
	Escribir "Escriba un número: "
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
		
		Escribir "Escriba un número: "
		Leer num
		
	Mientras Que num <> 0
	
	Escribir "El número minimo es " numMin ", el máximo es " numMax " y el promedio de sus números es " suma/i
	
FinAlgoritmo