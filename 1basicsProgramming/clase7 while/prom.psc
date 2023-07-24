
	Algoritmo prom
		Definir num,acum,i  Como Entero
		Escribir "Ingrese numeros"
		Leer num
		i = 0
		acum = 0
		Mientras num <> -1 Hacer
			i = i+1
			acum = acum + num
			Escribir "Ingrese otro num"
			Leer num
		Fin Mientras
		Escribir "el prom es de ", acum/i
FinAlgoritmo

