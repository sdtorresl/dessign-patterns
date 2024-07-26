package co.edu.unisabana.dessignpatterns.exercise2;

import java.util.ArrayList;
import java.util.List;

class Messenger implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private String message;
    private boolean changed;

    @Override
    public void register(Observer device) {
        observers.add(device);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        if (!changed)
            return;
        observersLocal = new ArrayList<>(this.observers);
        this.changed = false;
        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    void postMessage(String msg) {
        System.out.println("Message Posted:" + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}