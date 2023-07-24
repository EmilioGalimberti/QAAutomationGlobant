Algoritmo ej2
	
	Definir matriz, num, i, j Como Entero
	Dimension matriz(5,5)
	Definir aux Como Logico
	aux = Falso
	
	para i <- 0 Hasta 4 Hacer
		Para j <- 0 Hasta 4 Hacer
			matriz(i,j) = Aleatorio(0,100)
		FinPara
		
	FinPara
	
	imprimirMatriz(matriz, 5, 5)
	
	Escribir "Ingrese un número a ser buscado dentro de la matriz"
	Leer num
	
	para i <- 0 Hasta 4 Hacer
		Para j <- 0 Hasta 4 Hacer
			si num = matriz(i,j) Entonces
				Escribir i "," j
				aux = Verdadero
			FinSi
			
		FinPara
		
	FinPara
	
	si aux == falso Entonces
		Escribir "El número no se encuentra dentro de la matriz"
	FinSi
FinAlgoritmo

SubProceso imprimirMatriz(matriz, m, n)
	Definir i, j Como Entero
	
	Para i <- 0 Hasta (m-1) Hacer
		Para j <- 0 Hasta (n-1) Hacer
			Escribir Sin Saltar matriz(i, j) " "	
		FinPara
		Escribir ""
	FinPara
FinSubProceso