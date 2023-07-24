Algoritmo ejer7_dia15
    
    definir largoEscalera Como Entero
    Escribir "Ingrese el alrgo de la escalera: "
    leer largoEscalera
    escalera(largoEscalera)
    
FinAlgoritmo

SubProceso escalera(largoEscalera)
    definir i,j Como Entero
    Para i = 1 hasta largoEscalera
        para j = 1 hasta i
            Escribir Sin Saltar j
        FinPara
        Escribir  ""
    FinPara
    
FinSubProceso

