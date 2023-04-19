package Bridge.Demo2;

public class Rectangle extends Shape {
  private double x, y, width, height;

  public Rectangle(double x, double y, double width, double height, DrawingAPI drawingAPI) {
    super(drawingAPI);
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  @Override
  public void draw() {
    drawingAPI.drawRectangle(x, y, width, height);
  }
}
