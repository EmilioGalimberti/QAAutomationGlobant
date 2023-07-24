//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3  8
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
//	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
//			sea mágica escribir la suma. Además, el programa deberá comprobar que los números
//			introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
//			matriz que no debe superar orden igual a 10.

Algoritmo ej6
	Definir  matriz,i,j,x, filas,columnas, result, valorMaximo Como Entero
	Definir  SumaIncorrecta Como Logico
	SumaIncorrecta = Verdadero
	filas=0
	columnas=1
	Mientras (filas <> columnas) Hacer
		Escribir "filas"
		Leer filas
		Escribir "columna"
		Leer columnas
	Fin Mientras
	
	Dimension matriz(filas,columnas)
	
	rellenarMatriz(matriz,filas,columnas)
	
	mostrarMatriz(matriz,filas,columnas)
	valorMaximo = 0
	
	//suma de la primera fila
	Para j = 0 Hasta columnas-1 Hacer
		valorMaximo = valorMaximo + matriz[0,j]
	FinPara
	
	Escribir "Todas las sumas deben ser iguales a, " valorMaximo
	//Filas
	Para x = 1 Hasta filas-1 Hacer
		result= sumarFila(matriz,columnas,x)
		Escribir "la suma de la fila ",x," Es de " result
		si valorMaximo <> result Entonces
			SumaIncorrecta = Falso
		FinSi
	FinPara
	
	Escribir "La suma de todas las filas fueron iguales? " SumaIncorrecta
	

	//Columnas
	Para x = 0 Hasta filas-1 Hacer
		result= sumarColumna(matriz,columnas,x)
		Escribir "la suma de la columna ",x," Es de " result
		si valorMaximo <> result Entonces
			SumaIncorrecta = Falso
		FinSi
	FinPara
	
	Escribir "La suma de todas las columnas fueron iguales? " SumaIncorrecta
	
	//Falta sumar diagonal principal donde i=j
	result = sumarDiagonalPrincpal(matriz,filas,columnas)
	si valorMaximo <> result Entonces
		SumaIncorrecta = Falso
	FinSi
	Escribir "La suma de la diagonal principal es igual al resto? " SumaIncorrecta
	
	result = sumarDiagonalSecundaria(matriz,filas,columnas)
	si valorMaximo <> result Entonces
		SumaIncorrecta = Falso
	FinSi
	Escribir "La suma de la diagonal secundaria es igual al resto? " SumaIncorrecta
	
	
FinAlgoritmo



//filas
Funcion retorno = sumarFila(matriz,columnas,filaASumar)
	Definir retorno, j Como Entero
	retorno = 0
	Para j = 0 Hasta columnas-1 Hacer
		retorno = retorno + matriz[filaASumar,j]
	FinPara
FinFuncion
//columnas
Funcion retorno = sumarColumna(matriz,filas,columnasASumar)
	Definir retorno, i Como Entero
	retorno = 0
	Para i = 0 Hasta filas-1 Hacer
		retorno = retorno + matriz[i,columnasASumar]
	FinPara
FinFuncion
//diagonal principal
Funcion retorno = sumarDiagonalPrincpal(matriz,filas,columnas)
	Definir i,j,retorno Como Entero
	retorno = 0
	Para i<- 0 Hasta filas-1 Hacer
		Para j <- 0 Hasta columnas-1 Hacer
			Si i=j Entonces
				retorno = retorno + matriz[i,j]
			FinSi
		FinPara
	FinPara
	Escribir "La suma de la diagonal principal es de " ,retorno
FinFuncion

//diagonal secundaria 
Funcion retorno = sumarDiagonalSecundaria(matriz,filas,tamanioColumna)
	Definir i,j,retorno Como Entero
	retorno = 0
	Para i<- 0 Hasta tamanioColumna-1 Hacer
		retorno = retorno + matriz[i,tamanioColumna-1-i]
	FinPara
	Escribir "La suma de la diagonal principal es de " ,retorno
	
FinFuncion


SubProceso  rellenarMatriz(matriz,filas,columnas)
	Definir i,j Como Entero
	Para i<- 0 Hasta filas-1 Hacer
		Para j <- 0 Hasta columnas-1 Hacer
			Escribir "ingrese un valor para la posicion " i, " "  j
			Leer matriz[i,j]
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
