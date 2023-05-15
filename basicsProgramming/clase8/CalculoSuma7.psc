Algoritmo CalculoSuma7
	Definir numpares, contador1, contador2, suma Como Entero
	contador1=0

	contador2=0
	suma=0
	Escribir "Ingrese el numero de pares que desea sumar"
	Leer numpares
	repetir 
		contador1= contador1+1
		Si contador1 mod 2 = 0
			suma = suma + contador1
			contador2= contador2+1
		FinSi
		
	Mientras Que numpares<>contador2
	
	Escribir suma
	
	
FinAlgoritmo