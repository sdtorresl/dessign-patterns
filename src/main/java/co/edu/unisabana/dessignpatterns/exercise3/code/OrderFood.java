package co.edu.unisabana.dessignpatterns.exercise3;

public class OrderFood  extends Order{
    public OrderFood(Meal meal) {
        super(meal);
    }

    @Override
    void serveOrder() {
        System.out.println("Serving food...");
    }
}
