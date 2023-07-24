Algoritmo cambiarDeLugarNum
	//Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
	//invertido. Ejemplo, si se introduce 23 que muestre 32.
	Definir num Como Entero
	Definir resto Como Entero
	Definir cociente Como Entero
	
	Leer num
	
	cociente = trunc(num/10)
	resto = num mod 10
	
	Escribir resto,cociente
	
FinAlgoritmo
