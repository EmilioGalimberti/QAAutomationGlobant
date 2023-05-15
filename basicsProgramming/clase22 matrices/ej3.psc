//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//los resultados por pantalla.

Algoritmo ej3
	Definir  matriz,i,j, filas,columnas, result Como Entero
	Escribir "filas"
	Leer filas
	Escribir "columna"
	Leer columnas
	Dimension matriz(filas,columnas)
	
	rellenarMatriz(matriz,filas,columnas)
	
	mostrarMatriz(matriz,filas,columnas)
	
	result= suma(matriz,filas,columnas)
	Escribir result
	
FinAlgoritmo


SubProceso  rellenarMatriz(matriz,filas,columnas)
	Definir i,j Como Entero
	Para i<- 0 Hasta filas-1 Hacer
		
		Para j <- 0 Hasta columnas-1 Hacer
			matriz[i,j] = Aleatorio(0,10)
		FinPara
		
	FinPara
FinSubProceso

SubProceso retorno = suma(matriz,filas,columnas)
	Definir i,j,retorno Como Entero
	retorno = 0
	Para i<- 0 Hasta filas-1 Hacer
		Para j <- 0 Hasta columnas-1 Hacer
			retorno = retorno + matriz[i,j]
		FinPara
	FinPara
	
	
	
FinSubProceso

SubProceso  mostrarMatriz(matriz,filas,columnas)
	Definir i,j Como Entero
	Para i <- 0 Hasta filas-1 Hacer
		Escribir Sin Saltar "["
		Para j <- 0 Hasta columnas-1 Hacer
			Escribir Sin Saltar matriz(i, j) " "	
		FinPara
		Escribir "]"
	FinPara
FinSubProceso
