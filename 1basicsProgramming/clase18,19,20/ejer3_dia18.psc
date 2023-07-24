Algoritmo ejer3 
	
	Definir N, vector Como entero
	
	Escribir "Ingrese la dimension del vector: "
	Leer N
	
	Dimension vector[N] 
	ingresar(vector,N)
	
	ingresar2(vector,N)
	
FinAlgoritmo

SubProceso ingresar2 (vector Por Referencia, dime2)
	Definir encontrado Como Logico
	Definir numero_a_buscar, i Como Entero
    encontrado <- Falso
    
    Escribir "Ingresa el numero a buscar: "
    Leer numero_a_buscar
    
    Para i <- 0 Hasta dime2-1 Con Paso 1 Hacer
        Si vector[i] = numero_a_buscar Entonces
            encontrado <- Verdadero
            Escribir "El numero ", numero_a_buscar, " se encuentra en la posicion ", i
        FinSi
    FinPara
    
    Si encontrado = Falso 
		Entonces
        Escribir "El numero ", numero_a_buscar, " no se encuentra en el vector."
    FinSi
FinSubProceso


SubProceso ingresar (vector por referencia, dime )
	Definir i Como Entero
	
	
	Escribir "Ingresa los valores del vector: "
	
	Para i <- 0 Hasta dime-1 Con Paso 1 Hacer
		Escribir "Valor ", i+1, ": "
		Leer vector[i]
		
		
	FinPara
FinSubProceso