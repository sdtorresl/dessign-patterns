package co.edu.unisabana.dessignpatterns.exercise3;

abstract class Order {
    private Meal meal;

    public Order (Meal meal) {
        this.meal = meal;
    }
    // Método plantilla
    public final void processOrder() {
        takeOrder();
        if (checkAvailability(this.meal)) {
            prepareOrder();
            calculatePrice();
            serveOrder();
        }
        System.out.println();
        
    }
    // Pasos concretos
    void takeOrder() {
        System.out.println("Taking the order..." + this.meal.getDescription());
    }
    void prepareOrder() {
        System.out.println("Preparing the order...");
    }
    boolean checkAvailability(Meal meal) {
        System.out.println("Checking availability...");
        if (meal.getAmount() > 0) {
            meal.substractAmount();
            return true;
        } else {
            System.out.println("We're sorry. At this time we do not have the availability of this product.");
            return false;
        }

    }
    void calculatePrice() {
        System.out.println("Calculating price...");
        System.out.println(this.meal.getPrice());
    }
    // Paso abstracto para ser implementado por las subclases
    abstract void serveOrder();
}
