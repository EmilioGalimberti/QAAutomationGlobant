Algoritmo ej5
	Definir array,i,num, numMayor,largo Como Entero
	Escribir "Ingrese la cantidad de numero que desea ingresar"
	Leer largo
	Dimension array[largo]
	Para i=0 Hasta largo-1 Hacer
		Escribir "ingrese un numero"
		Leer num
		array[i] = num
	FinPara
	numMayor = ValorMasGrande(array,largo)
	Escribir "El ValorMasGrande ingresado es de: " numMayor
FinAlgoritmo

Funcion retorno = ValorMasGrande(array,largo)
	Definir retorno,i Como Entero
	retorno=0
	Para i=0 Hasta largo-1 Hacer
		Si array[i] > retorno
			retorno = array[i]
		FinSi
	FinPara
FinFuncion
	