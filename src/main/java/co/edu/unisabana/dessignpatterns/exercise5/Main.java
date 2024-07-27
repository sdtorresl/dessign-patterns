package co.edu.unisabana.dessignpatterns.exercise5;

import co.edu.unisabana.dessignpatterns.exercise5.decoradoresConcretos.ChocolateGourmet;
import co.edu.unisabana.dessignpatterns.exercise5.decoradoresConcretos.FloresFrescas;
import co.edu.unisabana.dessignpatterns.exercise5.decoradoresConcretos.VinoAltaCalidad;

public class Main{
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion();
        Habitacion habitacionConFlores = new FloresFrescas(habitacion);
        Habitacion habitacionConFloresYChocolate = new ChocolateGourmet(habitacionConFlores);
        Habitacion habitacionCompleta = new VinoAltaCalidad(habitacionConFloresYChocolate);

        System.out.println(habitacionCompleta.descripcion()  + "\nValor: " + habitacionCompleta.valor());
        

        Habitacion otraHabitacion = new Habitacion();
        Habitacion otraHabitacionConVinoDeAltaCalidad = new VinoAltaCalidad(otraHabitacion);
        Habitacion otraHabitacionConFloresYVino = new FloresFrescas(otraHabitacionConVinoDeAltaCalidad);

        System.out.println(otraHabitacionConFloresYVino.descripcion()  + "\nValor: " + otraHabitacionConFloresYVino.valor());
    }
}
