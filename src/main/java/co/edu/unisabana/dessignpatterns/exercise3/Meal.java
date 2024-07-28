package co.edu.unisabana.dessignpatterns.exercise3;

public class Meal {
    private String description;
    private float price;
    private int amount;

    public Meal(String description, float price, int amount) {
        this.description = description;
        this.price = price;
        this.amount = amount;
    }

    public float getPrice() {
        return this.price;
    }

    public int getAmount(){
        return this.amount;
    }

    public void substractAmount() {
        this.amount -= 1;
    }

    public String getDescription() {
        return this.description;
    }


}
