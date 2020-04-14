package ua.axiom.structural.adapter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Adapts xml string to csv format
 */
public class Adapter implements Function<String, String> {
    @Override
    public String apply(String s) {
        List<String> data = Arrays.asList(s.split("<actualData>"));
        data.forEach(str -> str.split("</actualData>"));

        return data
                .stream()
                .map((str -> str.split("</actualData>")))
                .flatMap(Arrays::stream)
                .filter((str) -> {
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }
        })
                .map((str) -> str + ";")
                .reduce(String::concat)
                .orElse("");

    }
}
