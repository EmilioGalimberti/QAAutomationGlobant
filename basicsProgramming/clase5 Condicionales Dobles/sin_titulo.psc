Algoritmo sin_titulo
	Definir palabra Como Caracter
	Definir nota Como Entero
	
	Leer palabra
	//6)
	Si Subcadena(palabra,0,0) = "A" Entonces
		Escribir "6) God"
	SiNo
		Escribir "6) NoGOD"
	FinSi
	
	//7
	Si Subcadena(palabra,0,0) = SubCadena(palabra,Longitud(palabra)-1,Longitud(palabra)) Entonces
		Escribir "7) God"
	SiNo
		Escribir "7) NoGOD"
	FinSi
	

	
	si nota > 1 y nota < 10 Entonces
		Escribir "a"
	FinSi
	
	

FinAlgoritmo
