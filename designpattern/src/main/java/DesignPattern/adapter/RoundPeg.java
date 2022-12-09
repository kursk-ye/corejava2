package DesignPattern.adapter;

public class RoundPeg {
    private double radius;

    public RoundPeg(){}

    RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
