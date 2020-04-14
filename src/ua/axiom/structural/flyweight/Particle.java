package ua.axiom.structural.flyweight;

public class Particle {
    //  position is unique
    public int posx;
    public int posy;
    public int posz;

    //  Sprite can be referenced from multiple Particles
    public Sprite texture;
}
