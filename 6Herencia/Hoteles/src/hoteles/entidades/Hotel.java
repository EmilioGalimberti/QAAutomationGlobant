package hoteles.entidades;

public class Hotel {

    //protected el atributo es publico para la familia
    //y privado para los externos de la familia
    protected Integer cantidadHabitaciones;

    public Hotel(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

}
