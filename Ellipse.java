public class Ellipse extends Rectangle {

  public Ellipse(int width, int height) {
      super(width, height); // Inherits width and height attributes from Rectangle class therefore it doesnt need to be defined again
  }

  // No new getters or setters needed as they are inherited from Rectangle class (no new attributes to make them for)
  
  @Override
  public int getArea() {
    return (int) (Math.PI * getWidth() * getHeight()); // formula for ellipse area is ab*pi no new attributes needed
  }
}