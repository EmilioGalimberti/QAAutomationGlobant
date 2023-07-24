Algoritmo ejer4_dia18
	definir respuesta Como Caracter
	Definir aLleno, bLleno, cLleno Como Logico
	definir i,j,k Como Entero
	definir n, vectorA, vectorB, vectorC como entero
	Definir respuesta2 Como Caracter
	
	aLleno = Falso
	bLleno = Falso
	cLleno = Falso
	Escribir "Ingrese el tamaño de los vectores A, B y C"
	leer n
	
	Dimension vectorA[n]
	Dimension vectorB[n]
	Dimension vectorC[n]
	
	Hacer
		Escribir "Ahora seleccione la opcion que mas le guste: "
		Escribir "A- Llenar el vector A con numeros aleatorios ; B- Llenar el vector B con numeros aleatorios "
		Escribir "C- Llenar el vector C con la suma de los numeros de A y B ; D- Llenar el vector C con la resta de los numeros de A y B"
		Escribir "E- Mostrar el vector que seleccione ; F- Salir"
		leer respuesta
		
		segun Mayusculas(respuesta) hacer
			"A":
				llenarRandom(vectorA, aLleno, n)
			"B":
				llenarRandom(vectorB, bLleno, n)
			"C":
				si aLleno y bLleno == Verdadero
					SumaAB(vectorA, vectorB, vectorC, n)
				SiNo
					Escribir "Alguno de los vectores esta vacio"
				FinSi
			"D":
				si aLleno y bLleno == Verdadero
					restaBA(vectorA, vectorB, vectorC, n)
				SiNo
					Escribir "Alguno de los vectores esta vacio"
				FinSi
			"E":
				Escribir "Cual le gustaria ver?"
				
				leer respuesta2 
				segun Mayusculas(respuesta2)
					"A":
						para i=0 hasta n-1
							Escribir vectorA[i]
						FinPara
					"B":
						para i=0 hasta n-1
							Escribir vectorB[i]
						FinPara
					"C":
						para i=0 hasta n-1
							Escribir vectorC[i]
						FinPara
				FinSegun
				
			"F":
		FinSegun
	Mientras Que Mayusculas(respuesta)<>"F"
	
FinAlgoritmo

SubProceso llenarRandom(vector Por Referencia, lleno, n)
	definir i Como Entero
	para i = 0 hasta n-1
		vector[i] = Aleatorio(-100,100)
	FinPara
	lleno = Verdadero
FinSubProceso

SubProceso SumaAB(vectorA, vectorB, vectorC, n)
	Definir i Como Entero
	para i=0 hasta n-1
		vectorC[i] = vectorA[i] + vectorB[i]
 	FinPara
FinSubProceso

SubProceso restaBA(vectorA, vectorB, vectorC, n)
	Definir i Como Entero
	para i=0 hasta n-1
		vectorC[i] = vectorB[i] - vectorA[i]
 	FinPara
FinSubProceso
	