Algoritmo sin_titulo
	//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
	//actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
	//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
	//cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.
	
	Definir nino Como Entero
	Definir nina Como Entero
	Definir total Como Entero
	Definir porcentjNino Como Real
	Definir porcentjNina Como Real
	
	
	Escribir "Ingrese La cantidad de ni�os total: "
	Leer nino
	Escribir "Ingrese la cantidad de ni�as total: "
	Leer nina
	total = nino + nina
	
	porcentjNino = nino / total
	porcentjNino = porcentjNino*100
	Escribir "El porcentaje de ni�os actual es de: ", porcentjNino "%"
	porcentjNina = nina / total
	porcentjNina = porcentjNina*100
	Escribir "El porcentaje de ni�os actual es de: ", porcentjNina ,"%"
	
	
FinAlgoritmo
