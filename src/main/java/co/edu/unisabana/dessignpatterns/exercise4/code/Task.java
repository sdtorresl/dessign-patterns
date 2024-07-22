package co.edu.unisabana.dessignpatterns.exercise4.code;

public class Task {

    private int id;
    private String description;
    private boolean isComplete;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.isComplete = false;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
}
