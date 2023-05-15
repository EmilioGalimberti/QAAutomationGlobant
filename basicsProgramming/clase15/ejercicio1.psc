//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.

Algoritmo ejercicio1
	Definir a, b Como Entero
	Escribir "ingrese un número entero"
	leer a
	Escribir "ingrese otro número entero"
	leer b
	cambiarValor(a,b)
	Escribir "los nuevos valores son " a , b
	
FinAlgoritmo

SubProceso cambiarValor(a Por Referencia, b Por referencia)
	definir c como entero
	c = a 
	a = b 
	b = c	
FinSubProceso