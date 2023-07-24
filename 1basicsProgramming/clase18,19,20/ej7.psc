Algoritmo ej7
	Definir array1,array2,largo Como Entero
	Definir valoresIguales Como Logico
	Escribir "ingrese el largo de los arrays"
	Leer largo
	Dimension array1[largo]
	Dimension array2[largo]
	rellenarArray(array1,largo)
	rellenarArray(array2,largo)
	valoresIguales = comparacionArrays(array1,array2,largo)
	
	Escribir "Todos los valores de los array son  son iguales? ", valoresIguales
	
	Escribir "El array1 es" 
	mostrarArray(array1,largo)
	Escribir ""
	Escribir "El array2 es" 
	mostrarArray(array2,largo)
	Escribir ""
FinAlgoritmo

Funcion retorno = comparacionArrays(array1,array2,largo)
	Definir i Como Entero
	Definir retorno Como Logico
	retorno = Falso
	para i = 0 hasta largo-1 
		Si array1[i] == array2[i]
			retorno = Verdadero
		FinSi
	FinPara
FinFuncion

SubProceso  rellenarArray(array por Referencia, largo)
	Definir i Como Entero
	para i = 0 hasta largo-1 
		array[i] = Aleatorio(1,5)
	FinPara
FinSubProceso

SubProceso mostrarArray(array,largo)
	Definir  i Como Entero
	Para  i = 0 Hasta largo-1 Hacer
		Escribir Sin Saltar "[" array[i] "]"
	FinPara
FinSubProceso
	