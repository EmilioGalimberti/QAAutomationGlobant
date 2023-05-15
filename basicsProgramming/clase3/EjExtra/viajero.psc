Algoritmo sin_titulo
	//Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo
	//de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que
	//determine la hora de llegada a la ciudad B.
	
	// 1h = 60min
	// 1m = 60 segus
	// 1h = 3600 segundos
	
	Definir segsB, minutosB , horasB Como Entero
	Definir segsA, minutosA , horasA Como Entero
	
	//diferencia de las horas
	
	Leer segsB
	
	
	
	horasB = trunc(segsB/3600)
	
	minutosB = trunc(( segsB mod 3600 ) / 60)
	
	segsB = ( segsB mod 3600) mod 60

	Escribir "Tarda ", horasB , " Horas ", minutosB, " Minutos ", segsB " Segs"
	
	
	
	
FinAlgoritmo
