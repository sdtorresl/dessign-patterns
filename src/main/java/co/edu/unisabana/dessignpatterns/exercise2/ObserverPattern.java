package co.edu.unisabana.dessignpatterns.exercise2;

class ObserverPattern {
    public static void main(String[] args) {
        //create subject
        Messenger message = new Messenger();

        //create observers
        Observer device1 = new Device("device 1");
        Observer device2 = new Device("device 2");
        Observer device3 = new Device("device 3");

        //register observers to the subject
        message.register(device1);
        message.register(device2);
        message.register(device3);

        //attach observer to subject
        device1.setSubject(message);
        device2.setSubject(message);
        device3.setSubject(message);

        //check if any update is available
        device1.update();

        //now send message to subject
        message.postMessage("New Message");
    }
}
