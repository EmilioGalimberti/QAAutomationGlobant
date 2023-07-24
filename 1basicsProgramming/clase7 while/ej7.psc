Algoritmo ej7
	Definir nombreAlumno Como Caracter
	Definir nota1,nota2,nota3 Como Entero
	
	nota1=0
	nota2=0
	nota3=0
	
	Escribir "nombreAlumno"
	Leer nombreAlumno
	
	
	Mientras nombreAlumno <> "" Hacer
		Escribir "Ingrese las notas"
		Leer nota1
		Leer nota2
		Leer nota3
		Mientras nota1<0 o nota1>10 y nota2<0 o nota2>10 y nota3<0 o nota3>10 Que
			Escribir "ingreso mal una nota"
			Leer nota1
			Leer nota2
			Leer nota3
		FinMientras
		
		
		
		
	Fin Mientras
	

FinAlgoritmo
