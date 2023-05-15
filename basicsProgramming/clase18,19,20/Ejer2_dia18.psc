//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.

SubProceso arreglo(vector Por Referencia)
	Definir i Como Entero
	
	Para i<-0 hasta 9
		Escribir "Ingrese un número"
		Leer vector[i]
	FinPara
	
FinSubProceso

SubProceso operaciones(vector Por Referencia)
	Definir suma, mult, resta, i Como Entero
	
	suma=0
	mult=1
	resta=0
	
	Para i<-0 hasta 9
		suma=suma+vector[i]
		mult=mult*vector[i]
		resta=resta-vector[i]
	FinPara
	
	Escribir "La suma de los valores es ", suma, " la resta es ", resta, " y la multiplicación es: ", mult
	
FinSubProceso

Algoritmo Ejer2_dia18
	Definir vector Como Entero
	Dimension vector[10]
	
	arreglo(vector)
	operaciones(vector)
	
FinAlgoritmo