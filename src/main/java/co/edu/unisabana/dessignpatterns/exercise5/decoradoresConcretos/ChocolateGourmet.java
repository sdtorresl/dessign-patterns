package co.edu.unisabana.dessignpatterns.exercise5.decoradoresConcretos;

import co.edu.unisabana.dessignpatterns.exercise5.DecoradorBase;
import co.edu.unisabana.dessignpatterns.exercise5.Habitacion;

public class ChocolateGourmet extends DecoradorBase {
    public ChocolateGourmet(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String descripcion() {
        return habitacion.descripcion() + " con chocolate gourmet";
    }
    @Override
    public int valor() {
        return habitacion.valor() + 8;
    }
}

