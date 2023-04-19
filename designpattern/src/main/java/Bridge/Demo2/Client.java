package Bridge.Demo2;

public class Client {

  public static void main(String[] args) {
    Shape circleOpenGL = new Circle(1, 2, 3, new OpenGLAPI());
    Shape rectangleOpenGL = new Rectangle(4, 5, 6, 7, new OpenGLAPI());
    Shape circleDirectX = new Circle(1, 2, 3, new DirectXAPI());
    Shape rectangleDirectX = new Rectangle(4, 5, 6, 7, new DirectXAPI());

    circleOpenGL.draw();
    rectangleOpenGL.draw();
    circleDirectX.draw();
    rectangleDirectX.draw();
  }
}
