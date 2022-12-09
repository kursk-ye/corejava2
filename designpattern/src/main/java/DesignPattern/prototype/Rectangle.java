package DesignPattern.prototype;

public class Rectangle extends Shape {
    int x;
    int y;

    Rectangle(Rectangle source){
        super(source);
        this.x = source.x;
        this.y = source.y;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
