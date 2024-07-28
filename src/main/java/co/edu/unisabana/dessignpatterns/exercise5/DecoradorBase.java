package co.edu.unisabana.dessignpatterns.exercise5;

public abstract class DecoradorBase extends Habitacion {
    protected Habitacion habitacion;

    public DecoradorBase(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String descripcion() {
        return habitacion.descripcion();
    }
    
    @Override
    public int valor() {
        return habitacion.valor();
    }

}
