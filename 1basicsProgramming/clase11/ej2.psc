//2. Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
//componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
//	deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
//de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
//	resultados.

Algoritmo ej2
	definir contador Como Entero
	Definir num Como Real
	
	Escribir "Ingrese un numero"
	Leer num
	
	contador = 0
	
	Repetir
		num = trunc(num/10)
		contador = contador + 1
	Mientras Que num <> 0

	Escribir contador
	
FinAlgoritmo
