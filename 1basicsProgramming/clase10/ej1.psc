Algoritmo ej1
	Definir sueldoBase, cantVentas, nVendedores, montoVenta, i ,x Como Entero
	Definir comision, totalEnComision, sueldoTotal Como Real
	Escribir "cant vendedores"
	Leer nVendedores
	
	
	totalEnComision = 0
	
	Para i<-1 Hasta nVendedores Con Paso 1 Hacer
		Escribir "vendedor", i
		Escribir "sueldoBase"
		Leer sueldoBase
		Escribir "Ventas realizadas"
		Leer cantVentas
		Para x = 1 Hasta cantVentas Con Paso 1 Hacer
			Escribir "monto de venta"
			Leer montoVenta
			comision = montoVenta * 0.10
			totalEnComision = totalEnComision + comision
		FinPara
		Escribir "Pago en la semana en comisiones de ", totalEnComision
		Escribir "Sueldo total: " sueldoBase+ totalEnComision
	Fin Para
FinAlgoritmo
