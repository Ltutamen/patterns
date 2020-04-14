package ua.axiom.structural.decorator;

public class Notification implements Notifiable {
    private Notifiable next;

    public Notification(Notifiable next) {
        this.next = next;
    }

    @Override
    public void notify(String msg) {
        System.out.println("not final notification: " + msg);
        next.notify(msg);
    }


}
