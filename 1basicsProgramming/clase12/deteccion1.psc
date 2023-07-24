Funcion retorno <- Paridad (num Por Referencia)
	Definir retorno Como logico
	
	retorno= num mod 2 == 0
Fin Funcion

Algoritmo sin_titulo
	Definir num Como Entero
	Definir resultado Como Logico
	Escribir "ingrese un numero"
	Leer num
	
	
	resultado = Paridad (num)
	
	Escribir "El resultado de la funcion es: " resultado
	
	Si resultado Entonces
		Escribir "Entonces su numero es par"
	SiNo
		Escribir "Entonces su numero es impar"
		
	FinSi
	
FinAlgoritmo