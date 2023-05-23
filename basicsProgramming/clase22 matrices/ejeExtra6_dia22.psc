Algoritmo ejeExtra6_dia22
	definir matriz, vector, vectorResultante Como Entero
	
	dimension matriz[3,3]
	Dimension vector[3]
	Dimension vectorResultante[3]
	
	llenarMatriz(matriz)
	llenarVector(vector)
	
	mostrarrMatriz2D(matriz)
	Escribir ""
	mostrarrVector2D(vector)
	Escribir ""
	productoMxV(matriz, vector, vectorResultante)
	mostrarrVector2D(vectorResultante)
	
	
FinAlgoritmo

SubProceso productoMxV(matriz, vector, vectorResultante Por Referencia)
	definir i ,j Como Entero
	Definir multiplo, cajaSuma Como Entero
	multiplo=0
	cajaSuma=0

	para i = 0 hasta 2
		para j = 0 hasta 2
			multiplo=matriz[i,j] * vector[j]
			cajaSuma = cajaSuma + multiplo
		FinPara
		vectorResultante[i] = cajaSuma
		cajaSuma=0
	FinPara
FinFuncion


SubProceso llenarMatriz(matriz)
	definir i, j Como Entero
	para i=0 hasta 2
		para j=0 hasta 2
			matriz[i, j] = Aleatorio(0,9)
		FinPara
	FinPara
FinSubProceso

SubProceso llenarVector(vector)
	definir i, j Como Entero
	para i=0 hasta 2
		vector[i] = Aleatorio(0,9)
	FinPara
FinSubProceso

SubProceso mostrarrMatriz2D(matriz)
	definir i, j Como Entero
	
	para i=0 hasta 2
		para j=0 hasta 2
			Escribir Sin Saltar matriz[i,j]
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso mostrarrVector2D(vector)
	definir i Como Entero
	para i=0 hasta 2 Con Paso 1
		Escribir Sin Saltar vector[i]
		Escribir ""
	FinPara
FinSubProceso