Algoritmo ej6
	Definir array,frase,letra Como Caracter
	Definir  i Como Entero
	Dimension array[20]
	Escribir "Ingrese una frase"
	Leer frase
	Mientras (Longitud(frase) >20 o frase="") Hacer
		Escribir "ingreso una frase vacia o con mayor a 20 caracteres vuelva a ingresar"
		Leer frase
	Fin Mientras
	
	Para i=0 Hasta 19  Hacer
		letra = SubCadena(frase,i,i)
		array[i] = letra
	Fin Para
	
	Escribir "ingrese el caracterCambiar"
	Leer letra
	Escribir "Ingrese en la posicion que desea ingresarlo"
	leer i
	
	rellenarEspacioVacio(array,letra,i)

FinAlgoritmo

SubProceso mostrarArray(array)
	Definir  i Como Entero
	Para  i = 0 Hasta 19 Hacer
		Escribir  array[i]
	FinPara
FinSubProceso

SubProceso rellenarEspacioVacio(array,caracterCambiar,posicion)
	Si array[posicion] == "" Entonces
		array[posicion] = caracterCambiar
		mostrarArray(array)
	SiNo
		Escribir "la posicion esta ocupada"
	FinSi
FinSubProceso

	