Algoritmo subpalabraa
	Definir palabra,subpalabra Como Caracter
	Definir i, largo Como Entero
	
	Escribir "ingrese una palabra"
	
	Leer palabra
	
	
	largo = Longitud(palabra)
	
	Para i = 0 Hasta largo-1 Con Paso 1 Hacer
		subpalabra = Subcadena(palabra,i,i) +  " "
		Escribir Sin Saltar subpalabra
	Fin Para
	
FinAlgoritmo
