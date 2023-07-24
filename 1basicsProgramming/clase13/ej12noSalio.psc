//12
// 12321).

Algoritmo sin_titulo
	Definir num Como real
	Escribir "ingrese un numero"
	Leer num

FinAlgoritmo

Funcion retorno = sonCapicua(num)
	Definir retorno Como Logico
	Definir resto,cantDigitos Como Entero
	
	resto = num mod 10 
	
	cantDigitos = contarDigitos(num)
	
	Para i = contarDigitos  Hasta i Con Paso 1 Hacer
		
	Fin Para
	
	
	Repetir
		
	Mientras Que (num <> 0) y (retorno <> Falso)
FinFuncion


Funcion  cantDigitos = contarDigitos(num)
	Definir cantDigitos Como Entero
	Repetir
		num = trunc(num/10)
		cantDigitos = cantDigitos + 1
	Mientras Que num <> 0	
	
FinFuncion
	