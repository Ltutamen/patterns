package ua.axiom.structural.adapter;

import java.util.Arrays;
import java.util.function.Consumer;

public class SomeConsumer implements Consumer<String> {
    //  consumes csv
    @Override
    public void accept(String s) {
        System.out.println(Arrays
                .stream(s.split(";"))
                .map(Double::parseDouble)
                .mapToDouble(Double::new)
                .sum());
    }
}
