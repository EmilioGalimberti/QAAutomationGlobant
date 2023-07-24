//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
//repetidas. Al final el procedimiento mostrará la frase final.
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//	Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? quedan
//		al no estar repetidas.


Algoritmo ej9
	Definir palabra Como Caracter
	
	Leer palabra
	tranformarPalabra(palabra)
	
FinAlgoritmo


SubProceso tranformarPalabra(palabra Por valor)
	Definir  i, contadorA, contadorE, contadorI, contadorO , contadorU Como Entero
	Definir letra, palabraNueva Como Caracter
	palabraNueva = ""
	Definir hayA Como Logico
	contadorA = 0
	contadorE = 0
	contadorI = 0
	contadorO = 0
	contadorU = 0
	Para i=0 Hasta Longitud(palabra) Con Paso 1 Hacer
		letra = Minusculas(Subcadena(palabra,i,i))
			Segun letra Hacer
				'a':
					Si letra = "a" Entonces
						contadorA = contadorA + 1
					FinSI
					Si contadorA > 1 Entonces
						letra = ''
					FinSi
				'e':
					Si letra = "e" Entonces
						contadorE = contadorE + 1
					FinSI
					Si contadorE > 1 Entonces
						letra = ''
					FinSi
				'i':
					Si letra = "i" Entonces
						contadorI = contadorI + 1
					FinSI
					Si contadorI > 1 Entonces
						letra = ''
					FinSi
				'o':
					Si letra = "o" Entonces
						contadorO = contadorO + 1
					FinSI
					Si contadorO > 1 Entonces
						letra = ''
					FinSi
				'u':
					Si letra = "u" Entonces
						contadorU = contadorU + 1
					FinSI
					Si contadorU > 1 Entonces
						letra = ''
					FinSi
			Fin Segun
		
		palabraNueva = palabraNueva + letra
	Fin Para
	Escribir palabraNueva
FinSubProceso
