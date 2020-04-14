package ua.axiom.structural.decorator;

public class FinalNotification implements Notifiable {
    @Override
    public void notify(String msg) {
        System.out.println("Final notification! " + msg);
    }
}
