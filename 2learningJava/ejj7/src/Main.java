import entity.Persona;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona1 = persona.crearPersona();
        Persona persona2 = persona.crearPersona();
        Persona persona3 = persona.crearPersona();
        Persona persona4 = persona.crearPersona();

        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        // Calcular IMC y determinar si es mayor de edad para cada persona
        int porDebajoPesoIdeal = 0;
        int pesoIdeal = 0;
        int porEncimaPesoIdeal = 0;
        int mayoresEdad = 0;
        int menoresEdad = 0;

        for (Persona i : personas) {
            int imc = i.calcularIMC();
            boolean mayorEdad = i.esMayorDeEdad();

            if (imc == -1) {
                porDebajoPesoIdeal++;
            } else if (imc == 0) {
                pesoIdeal++;
            } else {
                porEncimaPesoIdeal++;
            }

            if (mayorEdad) {
                mayoresEdad++;
            } else {
                menoresEdad++;
            }
        }

        int totalPersonas = personas.size();

        // Calcular porcentajes
        double porcentajeDebajoPesoIdeal = (porDebajoPesoIdeal / (double) totalPersonas) * 100;
        double porcentajePesoIdeal = (pesoIdeal / (double) totalPersonas) * 100;
        double porcentajeEncimaPesoIdeal = (porEncimaPesoIdeal / (double) totalPersonas) * 100;
        double porcentajeMayoresEdad = (mayoresEdad / (double) totalPersonas) * 100;
        double porcentajeMenoresEdad = (menoresEdad / (double) totalPersonas) * 100;

        // Imprimir resultados
        System.out.println("Resultados:");
        System.out.println("Porcentaje de personas por debajo del peso ideal: " + porcentajeDebajoPesoIdeal + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas por encima del peso ideal: " + porcentajeEncimaPesoIdeal + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenoresEdad + "%");

        }
}
