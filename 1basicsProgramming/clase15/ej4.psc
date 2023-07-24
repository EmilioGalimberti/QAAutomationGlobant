Algoritmo ej4
	Definir palabra Como Caracter
	
	Leer palabra
	tranformarPalabra(palabra)
	
FinAlgoritmo


SubProceso tranformarPalabra(palabra Por valor)
	Definir  i Como Entero
	Definir letra, palabraNueva Como Caracter
	palabraNueva = ""
	Para i=0 Hasta Longitud(palabra) Con Paso 1 Hacer
		letra = Minusculas(Subcadena(palabra,i,i))
		Si letra <> '.' y letra <> ' ' Entonces // Esto lo usariamos para contar la cantidad de CARACTERES QUE TIENE LA PALABRA
			Segun letra Hacer
				'a':
					letra = '@'
				'e':
					letra = '#'
				'i':
					letra = '$'
				'o':
					letra = '%'
				'u':
					letra = '*'
			Fin Segun
		FinSi
		palabraNueva = palabraNueva + letra
	Fin Para
	Escribir palabraNueva
FinSubProceso
	