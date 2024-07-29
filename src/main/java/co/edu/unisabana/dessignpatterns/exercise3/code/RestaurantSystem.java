package co.edu.unisabana.dessignpatterns.exercise3;

public class RestaurantSystem {
    public static void main(String[] args) {
        Meal margarita = new Meal("Margarita", 10500, 5);
        Meal soda = new Meal("Coke", 4500, 2);
        Meal tea = new Meal("Cup of Tea", 4000, 10);
        Meal hamburguer = new Meal("Cheese Burguer", 10500, 5);
        Meal hotDog = new Meal("Hot Dog", 9500, 2);
        Meal cheeseCake = new Meal("Cheese Cake", 5000, 10);

        Order[] foodOrders = {
            new OrderFood(hamburguer),
            new OrderFood(hotDog),
            new OrderFood(hotDog),
            new OrderFood(hamburguer),
            new OrderFood(hotDog)
        };
        for(Order foodOrder: foodOrders)
            foodOrder.processOrder();
        Order beverageOrder = new OrderBeverage(soda);
        beverageOrder.processOrder();
        Order dessertOrder = new OrderDessert(cheeseCake);
        dessertOrder.processOrder();
    }
}
