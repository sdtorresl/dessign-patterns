package co.edu.unisabana.dessignpatterns.exercise5.decoradoresConcretos;

import co.edu.unisabana.dessignpatterns.exercise5.DecoradorBase;
import co.edu.unisabana.dessignpatterns.exercise5.Habitacion;

public class FloresFrescas extends DecoradorBase {
    public FloresFrescas(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String descripcion() {
        return habitacion.descripcion() + " con flores frescas";
    }
    @Override
    public int valor() {
        return habitacion.valor() + 12;
    }
}
