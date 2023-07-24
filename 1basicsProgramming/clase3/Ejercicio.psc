Algoritmo sin_titulo
	//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
	//actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
	//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
	//cantidad total de niños, y la cantidad total de niñas que hay en el curso.
	
	Definir nino Como Entero
	Definir nina Como Entero
	Definir total Como Entero
	Definir porcentjNino Como Real
	Definir porcentjNina Como Real
	
	
	Escribir "Ingrese La cantidad de niños total: "
	Leer nino
	Escribir "Ingrese la cantidad de niñas total: "
	Leer nina
	total = nino + nina
	
	porcentjNino = nino / total
	porcentjNino = porcentjNino*100
	Escribir "El porcentaje de niños actual es de: ", porcentjNino "%"
	porcentjNina = nina / total
	porcentjNina = porcentjNina*100
	Escribir "El porcentaje de niños actual es de: ", porcentjNina ,"%"
	
	
FinAlgoritmo
