package lab1;

/**
* Driver class to test Rectangle objects
*/

public class Driver {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(5, 10);
    Rectangle r2 = new Rectangle(10, 10);
    Rectangle r3 = new Rectangle(15, 10);

    System.out.println(r1);
    System.out.println(r1.getHeight());
    System.out.println(r1.getWidth());
    System.out.println(r1.getArea());
    System.out.println("The rectangle has"+ r1.getSides() + "sides");


    Circle c1 = new Circle(5);
    Circle c2 = new Circle(10);
    Circle c3 = new Circle(15);
    System.out.println("Circle 1:");
    System.out.println(c1.getRadius());
    System.out.println(c1.getArea());
    System.out.println("Circle 2:");
    System.out.println(c2.getRadius());
    System.out.println(c2.getArea());
    System.out.println("Circle 3:");
    System.out.println(c3.getRadius());
    System.out.println(c3.getArea());
  }
}