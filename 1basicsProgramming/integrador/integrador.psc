Algoritmo sin_titulo
	Definir matriz, palabra Como Caracter
	Dimension matriz(3,3)
	Definir i,j, contadorCaracter Como Entero
	Definir resultDiagonalPrincipal, resultDiagonalSecundaria Como Logico
	resultDiagonalPrincipal= Falso
	resultDiagonalSecundaria = Falso
	
	palabra = "ABAABBCBD"
	Escribir Longitud(palabra)
	
	contadorCaracter =0
	Para i=0 hasta 2
		Para j=0 hasta 2
			matriz(i,j) = Subcadena(palabra, contadorCaracter, contadorCaracter)
			contadorCaracter = contadorCaracter + 1
		FinPara
	FinPara
	
	resultDiagonalPrincipal = compararDiagonalPrincipal(matriz,3,3)
	resultDiagonalSecundaria = compararDiagonalSecundaria(matriz,3,3)
	Escribir resultDiagonalPrincipal
	Escribir resultDiagonalSecundaria
	imprimirMatriz(matriz, 3, 3)
FinAlgoritmo


//compara diagonal principla
Funcion retorno = compararDiagonalPrincipal(matriz,filas,columnas)
	Definir i,j Como Entero
	Definir retorno Como Logico
	Definir elementoReferencia Como Caracter
	elementoReferencia = matriz[0,0]
	retorno = Verdadero
	Para i<- 0 Hasta filas-1 Hacer
		Si matriz[i,i] <> elementoReferencia Entonces
			retorno = Falso
		FinSi
	FinPara
FinFuncion
//comparar diagonal secundaria
Funcion retorno = compararDiagonalSecundaria(matriz,fila,columna)
	Definir elementoReferencia Como Caracter
	Definir i,j Como Entero
	Definir retorno Como Logico
	
	elementoReferencia = ""
	elementoReferencia = matriz[0,columna-1] //Primer elemento de la diagonal secundaria
	Escribir elementoReferencia
	retorno = Verdadero
	Para i<- 0 Hasta columna-1 Hacer
		Si matriz[i,columna-1-i] <> elementoReferencia
			retorno = Falso
		FinSi
	FinPara
FinFuncion

SubProceso imprimirMatriz(matriz, m, n)
	Definir i, j Como Entero
	Para i <- 0 Hasta (m-1) Hacer
		Para j <- 0 Hasta (n-1) Hacer
			Escribir Sin Saltar matriz(i, j) " "	
		FinPara
		Escribir ""
	FinPara
FinSubProceso