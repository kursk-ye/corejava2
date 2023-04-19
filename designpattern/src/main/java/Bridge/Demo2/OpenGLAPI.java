package Bridge.Demo2;

public class OpenGLAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing circle using OpenGL: (" + x + ", " + y + "), radius: " + radius);
    }

    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        System.out.println("Drawing rectangle using OpenGL: (" + x + ", " + y + "), width: " + width + ", height: " + height);
    }
}



