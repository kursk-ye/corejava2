package Bridge.Demo2;

public class DirectXAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing circle using DirectX: (" + x + ", " + y + "), radius: " + radius);
    }

    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        System.out.println("Drawing rectangle using DirectX: (" + x + ", " + y + "), width: " + width + ", height: " + height);
    }
}