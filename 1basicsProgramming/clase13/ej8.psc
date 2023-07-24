Algoritmo sin_titulo
	Definir pass,user Como Caracter
	Escribir "user"
	Leer user
	Escribir "pass"
	Leer pass
	
	
	Escribir login(user,pass)
	
FinAlgoritmo


Funcion flag= login(user,pass)
	Definir i Como Entero
	Definir flag Como Logico
	Para i = 2 Hasta 3 Con Paso 1 Hacer	
		Si pass=="a" y user=="b" Entonces
			flag = Verdadero
			Escribir i-1
			i=3
		SiNo
			flag = Falso
			Leer user
			Leer pass
		FinSi
	Fin Para
	Si i = 3 Entonces
		Escribir "intento mas de tre veces"
	FinSi
FinFuncion
	