package ua.axiom.structural.adapter;

import java.util.function.Supplier;

public class SomeProvider implements Supplier<String> {

    //  provides XML content
    @Override
    public String get() {
        return "<note>\n" +
                "<to>Tove</to>\n" +
                "<from>Jani</from>\n" +
                "<actualData>90233423.234</actualData>\n" +
                "<actualData>55.3223</actualData>\n" +
                "</note>";
    }
}
