Algoritmo matriz1_5
//	Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//	encontrando la manera de que la frase se muestre de manera continua en la matriz.
//  Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:

definir matriz Como cadena
Dimension matriz[3,3]

definir palabra Como Caracter
escribir "Ingrese una palabra de 9 letras."
leer palabra

Mientras Longitud(palabra) <> 9
	escribir "Por favor, ingrese una palabra de 9 letras"
	leer palabra
FinMientras

definir i, j Como Entero
definir vectorPalabra como cadena

Dimension vectorPalabra[9]
para i = 0 hasta 8 Hacer
	vectorPalabra[i] = Subcadena(palabra, i, i)
FinPara

para i = 0 hasta 2 Hacer
	para j = 0 Hasta 2 Hacer
		si i = 0 Entonces
			matriz[i,j] = vectorPalabra[0 + j]
		sino 
			si i = 1 Entonces
				matriz[i,j] = vectorPalabra[0 + (j + 3)]
			sino 
				si i = 2 entonces
					matriz[i,j] = vectorPalabra[0 + (j + 6)]
				FinSi
			FinSi
		FinSi
	FinPara
FinPara

printVector(matriz)

FinAlgoritmo

SubProceso printVector(vector)
	definir i, j como entero
	para i = 0 hasta 2 Hacer
		para j = 0 hasta 2 hacer
			escribir Sin Saltar vector[i, j], " "
		FinPara
		Escribir " "
	FinPara
FinSubProceso