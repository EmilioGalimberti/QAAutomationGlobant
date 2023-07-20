package service;

import entities.Rectangulo;

public class RectanguloService {
    public double calcularArea(Rectangulo rectangulo) {
        return rectangulo.getAncho() * rectangulo.getLargo();
    }

    public double calcularPerimetro(Rectangulo rectangulo) {
        return 2*(rectangulo.getAncho()+rectangulo.getLargo());
    }
}
