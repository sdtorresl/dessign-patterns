package co.edu.unisabana.dessignpatterns.exercise3;

public class OrderBeverage extends Order {
    public OrderBeverage(Meal meal) {
        super(meal);
    }
    @Override
    void serveOrder() {
        System.out.println("Serving beverage...");
    }
}
