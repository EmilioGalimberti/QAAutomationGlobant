package hoteles.entidades;

public class Hotel1 extends Hotel {

    protected Double precio;
    protected Double superficie;
    protected boolean bano = true;
    protected boolean ascensor = true;
    protected boolean calefaccion = true;

    public Hotel1(Double precio, Double superficie, Integer cantidadHabitaciones) {
        //estoy llamando o enviando al padre de esta clase
        super(cantidadHabitaciones);
        this.precio = precio;
        this.superficie = superficie;
    }

}
