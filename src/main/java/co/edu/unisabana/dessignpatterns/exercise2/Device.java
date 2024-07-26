package co.edu.unisabana.dessignpatterns.exercise2;

class Device implements Observer {

    private final String name;
    private Subject message;

    public Device(String nm) {
        this.name = nm;
    }

    @Override
    public void update() {
        String msg = (String) message.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ":: No new message");
        } else
            System.out.println(name + ":: Consuming message::" + msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.message = sub;
    }
}