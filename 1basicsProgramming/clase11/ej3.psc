Algoritmo ejercicio_3
	
	Definir usuario, pass, opc1 Como Caracter
	Definir ipass, opc, numeroBotellas, pesoBotella, i, precioBotella, precioBotellaTotal, saldoGeneral Como Entero
	Definir bpass, confirmarPaso1 Como Logico
	
	Escribir "Ingrese su usuario: "
	Leer usuario
	
	Escribir "Ingrese su contraseña: "
	Leer pass
	
	ipass = 0
	saldoGeneral = 0
	precioBotellaTotal = 0
	bpass = Falso
	confirmarPaso1 = Falso
	
	Si usuario == "a" Entonces
		
		Mientras ipass <= 3 y bpass == falso Hacer
			Si pass == "a" Entonces
				bpass = Verdadero
				
			SiNo
				ipass = ipass + 1
				Escribir  "Contraseña incorrecta"
				Escribir "Ingrese su contraseña: "
				Leer pass
			Fin Si
		Fin Mientras
		
		
	SiNo
		Escribir  "Usuario incorrecto"
	Fin Si
	
	
	Si bpass == Verdadero Entonces
		
		Repetir
			Escribir "Ingrese la opcion que desee ingresar:"
			Escribir "1: Ingresar botellas"
			Escribir "2: consultar saldo" 
			Escribir "3: salir"
			Leer opc
			
			Segun opc Hacer
				1:
					Escribir "Ingrese el numero de botellas a ingresar: "
					leer numeroBotellas
					
					Para i<-1 Hasta numeroBotellas Con Paso 1 Hacer
						pesoBotella = aleatorio(100, 3000)
						
						Si pesoBotella <= 500 Entonces
							precioBotella = 50
							Escribir "precio botella", precioBotella
						SiNo
							Si pesoBotella > 500 y pesoBotella <= 1500 Entonces
								precioBotella = 125
								Escribir "precio botella", precioBotella
							SiNo
								precioBotella = 200
								Escribir "precio botella", precioBotella
							Fin Si
							
						Fin Si
						
						precioBotellaTotal = precioBotellaTotal + precioBotella
						
						
					Fin Para
					
					Escribir "El valor acumulado de las botellas es: ", precioBotellaTotal, "Esta de acuerdo? S/N"
					leer opc1
					
					opc1 = Mayusculas(opc1)
					
					Si opc1 == "S" Entonces
						Escribir "Valor guardado"
						saldoGeneral = precioBotellaTotal
						confirmarPaso1 = Verdadero
					SiNo
						Escribir "Valor rechazado, su amterial sera devuelto"
					Fin Si
					
					
				2:
					Si confirmarPaso1 == Verdadero Entonces
						Escribir  "Su saldo acumulado es: ", saldoGeneral
					SiNo
						Escribir "Tiene que ingresar un saldo en el paso 1"
					Fin Si
					
					
					
				3:
					Escribir "Gracias"
					
				De Otro Modo:
					Escribir "Opcion incorrecta, escribe un numero valido"
			Fin Segun
			
		Mientras Que  opc <> 3 
		
		
		
	Fin Si
	
FinAlgoritmo