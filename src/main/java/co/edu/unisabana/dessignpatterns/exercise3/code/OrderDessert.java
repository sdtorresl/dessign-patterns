package co.edu.unisabana.dessignpatterns.exercise3;

public class OrderDessert  extends Order{
    public OrderDessert(Meal meal) {
        super(meal);
    }
    
    @Override
    void serveOrder() {
        System.out.println("Serving Dessert...");
    }
}