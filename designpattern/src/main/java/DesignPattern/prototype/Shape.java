package DesignPattern.prototype;

public abstract class Shape {
    int x;
    int y;
    String color;

    Shape(Shape source){
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    Shape(){

    }

    public abstract Shape clone();
}
