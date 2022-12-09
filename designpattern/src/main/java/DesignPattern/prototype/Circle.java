package DesignPattern.prototype;

public class Circle extends Shape {
    int radius;

    Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    public Circle() {

    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
