package co.edu.unisabana.dessignpatterns.exercise5.decoradoresConcretos;

import co.edu.unisabana.dessignpatterns.exercise5.DecoradorBase;
import co.edu.unisabana.dessignpatterns.exercise5.Habitacion;

public class VinoAltaCalidad extends DecoradorBase {
    public VinoAltaCalidad(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String descripcion() {
        return habitacion.descripcion() + " con vino de alta calidad";
    }
    @Override
    public int valor() {
        return habitacion.valor() + 15;
    }
}
