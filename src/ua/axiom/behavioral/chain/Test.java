package ua.axiom.behavioral.chain;

public class Test {
    public static void test() {
        FileLogger flogger = new FileLogger();
        ConsoleLogger clogger = new ConsoleLogger();
        new Logging().thenPassTo(flogger::accept).thenPassTo(clogger::accept);
    }
}
