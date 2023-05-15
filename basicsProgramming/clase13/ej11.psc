//11. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//	numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//	Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//	realizar el ejercicio.


Algoritmo sin_titulo
	Definir num Como real
	Escribir "ingrese un numero"
	Leer num
	
	Si sonImpares(num) Entonces
		Escribir "Todos los digitos son impares "
	SiNo
		Escribir "Todos los digitos NO son impares "
	FinSi
FinAlgoritmo

Funcion retorno = sonImpares(num)
	Definir retorno Como Logico
	Definir resto Como Entero
	
	Repetir
		resto = num mod 10 
		si (resto mod 2 <> 0) y num <> 0 Entonces
			retorno = Verdadero
			Escribir "el digito ", resto, " IMPAR"
		SiNo
			retorno = Falso
			Escribir "el digito ", resto, " PAR"
		FinSi
		num = trunc(num/10)
	Mientras Que (num <> 0) y (retorno <> Falso)
FinFuncion
