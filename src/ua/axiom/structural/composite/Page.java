package ua.axiom.structural.composite;

import java.util.HashSet;
import java.util.Set;

public class Page implements Component {
    private Set<Component> componentSet;

    private int posx;
    private int posy;

    public Page(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
        componentSet = new HashSet<>();
    }

    @Override
    public void add(Component component) {
        component.add(component);
    }

    @Override
    public void show() {
        System.out.println("element at" + posx + posy);
        componentSet.forEach(Component::show);
    }


}
