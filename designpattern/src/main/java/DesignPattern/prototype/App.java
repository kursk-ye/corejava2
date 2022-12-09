package DesignPattern.prototype;

import concurrency.bounce.BallComponent;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    ArrayList<Shape> shapes;

    App(){
        Circle c1 = new Circle();
        c1.x = 10;
        c1.y = 12;
        c1.radius = 200;
        shapes.add(c1);

        Circle anotherCircle = (Circle) c1.clone();
        shapes.add(anotherCircle);
    }

}
