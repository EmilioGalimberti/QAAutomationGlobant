Algoritmo desafio
	menu()
FinAlgoritmo
//Main
SubProceso menu ()
	Definir opcionMenu Como Entero;
	opcionMenu = 0;
	
	Hacer
		Escribir ""
		Escribir "Bienvenido, elija una opcion: "
		Escribir ""
		Escribir "1. Calcular muro de ladrillo"
		Escribir "2. Calcular viga de hormigón"
		Escribir "3. Calcular columnas de hormigón"
		Escribir "4. Calcular contrapisos"
		Escribir "5. Calcular techo"
		Escribir "6. Calcular pisos"
		Escribir "7. Calcular pintura"
		Escribir "8. Calcular iluminación"
		Escribir "9. Salir"
		Leer opcionMenu;
		Segun opcionMenu Hacer
			1: calcularMuro()
            2: calcularViga()
			3: calcularColumna() //
			4: calcularContrapisos()
            5: calcularTecho()
            6: calcularPisos()
            7: calcularPintura()
            8: calcularIluminacion()
		FinSegun
	Mientras Que (opcionMenu <> 9) O (opcionMenu < 1) O (opcionMenu > 10)
FinSubProceso
//Funcion volumen
Funcion retorno = calcularVolumen(largo, ancho, alto)
	Definir retorno Como Real;
	retorno = largo * ancho * alto;
Fin Funcion
//Funcion superficie
Funcion superficie = calcularSuperficie(ancho,largo)
	Definir superficie Como real
	superficie = ancho*largo
FinFuncion
//1)
SubProceso calcularMuro()
	Definir opcEspesor Como caracter
	Definir espesor Como Entero
	Definir largo, alto, m2 Como Real
	Escribir "Elegir el espesor del muro:"
	Escribir "a. 20cm"
	Escribir "b. 30cm"
	Leer opcEspesor
	Segun opcEspesor hacer
		"a": 
			espesor = 20
		"b" :
			espesor = 30
	FinSegun
	Escribir "Ingrese el largo del muro"
	Leer largo
	Escribir "Ingrese el alto del muro"
	Leer alto
	m2 = calcularSuperficie(largo, alto)
	Si opcEspesor = "a" Entonces
		Escribir "Cantidad de materiales necesarios:"
		Escribir "Cemento: " (m2 * 10.9) " kg"
		Escribir "Arena: " (m2 * 0.09) " m3"
		Escribir "Ladrillos: " trunc((m2 * 90)+1)
	FinSi
	Si opcEspesor = "b" Entonces
		Escribir "Cantidad de materiales necesarios:"
		Escribir "Cemento: " (m2 * 15.2) " kg"
		Escribir "Arena: " (m2 * 0.115) " m3"
		Escribir "Ladrillos: " trunc((m2 * 120)+1)
	FinSi
FinSubProceso
//2)
SubProceso calcularViga()
	Definir largo Como Real;
	Escribir "Ingrese el largo de la viga";
	Leer largo;
	Escribir "La cantidad de cemento, arena, piedra y hierro necesarios para: ", largo " metros lineales de viga son:";
	Escribir "Cemento: ", largo * 9 " kg";
	Escribir "Arena: ", largo * 0.02 " m3";
	Escribir "Piedra: ", largo * 0.02 " m2";
	Escribir "Hierro 8: ", largo * 4 " m";
	Escribir "Hierro 4: ", largo * 3 " m";
FinSubProceso
//4)
SubProceso calcularTecho ()
	Definir volumen, cantidadCemento, cantidadArena, cantidadPiedra, cantidadHierroOcho, cantidadHierroSeis, ancho, largo, espesor  Como Real
	Escribir "Ingresa el ancho del techo"
	leer ancho
	Escribir "Ingresa el largo del techo"
	leer largo
	Escribir "Ingresa el espesor del techo"
	leer espesor
	volumen = ancho * largo * espesor
	cantidadCemento= 33*volumen
	cantidadArena = 0.072 * volumen
	cantidadPiedra = 0.072 * volumen
	cantidadHierroOcho = 7 * volumen
	cantidadHierroSeis = 4 * volumen
	Imprimir "La cantidad de materiales necesaria para construir un techo de " ancho " de ancho, " largo " de largo y " espesor " de espesor es:"
	Imprimir "Cemento: " cantidadCemento
	Imprimir "Arena: " cantidadArena
	Imprimir "Piedra: " cantidadPiedra
	Imprimir "Hierro 8: " cantidadHierroOcho
	Imprimir "Hierro 6: " cantidadHierroSeis
FinSubProceso
//5)
SubProceso calcularContrapisos()
	Definir espesor, largo, ancho Como Real
	Escribir 'Espesor (e): ' Sin Saltar
	Leer espesor 
	Escribir 'Largo (l): ' Sin Saltar
	Leer largo
	Escribir 'Ancho (a): ' Sin Saltar
	Leer alto
	Escribir "Superficie del contrapiso: ", retorno, " m3"
	Escribir "Cantidad de materiales de construcción son: "
	c<-105*retorno
	a <-0.45*retorno
	p <-0.9*retorno
	//Mostramos resultados
	Escribir "Cemento: ", c, " kg"	
	Escribir "Arena: ", a, " m3"	
	Escribir "Piedra: ", p, " m3"
FinSubProceso
//6)
SubProceso calcularPisos()
	Definir ancho Como Entero
	Definir largo Como Entero
	Definir superficie Como Real
	Escribir "Ingrese el ancho del piso"
	Leer ancho
	Escribir "Ingrese el largo del piso"
	Leer largo
	superficie = calcularSuperficie(ancho,largo)
	Escribir "la superfice con 10% teniendo en cuenta recortes es de: " superficie*1.10
FinSubProceso

//7)
SubProceso calcularPintura()
	Definir superficieMuro Como Entero
	Escribir "Ingrese la superficie del muro"
	Leer superficieMuro
	Escribir "los litros de pinturas que necesitamos para cubrir el muro son de " superficieMuro/6
FinSubProceso




