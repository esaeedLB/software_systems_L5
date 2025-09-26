package lab1;

public class Circle extends Shape {

  private int radius;

  public Circle(int radius) {
    super(0); //tells the shape parent class that this shape has 0 sides in the sides placeholder
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override 
  public int getArea() {
    return (int) (Math.PI * radius * radius); // using math.pi to get PI value
  }
}