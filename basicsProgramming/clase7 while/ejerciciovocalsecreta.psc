Algoritmo ejerciciovocalsecreta
	Definir vocalUsuario,vocalSecreta Como Caracter
	Escribir "Por favor ingrese una vocal"
	Leer vocalUsuario
	vocalUsuario=Minusculas(vocalUsuario)
	vocalSecreta= "i"
	
	Mientras vocalUsuario <> vocalSecreta Hacer
		Escribir " No has adivinado, por favor intenta con otra vocal"
		leer vocalUsuario
	Fin Mientras
	
	Escribir "¡Adivinaste!"
FinAlgoritmo
