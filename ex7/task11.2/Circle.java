public class Circle
{
  private Point center;
  private double radius;

  public Circle(Point center, double radius)
  {
    this.center = center;
    this.radius = radius;
  } // Circle

  public String toString()
  {
    return String.format("Circle(%s, %.1f)", 
                  center, radius);
  } // toString

  public Circle shift(double xShift, double yShift)
  {
    Point newCenter = new Point(center.getX() + xShift,
                                center.getY() + yShift);
    return new Circle(newCenter, radius);
  } // shift

  public double area() { return Math.PI * Math.pow(radius, 2); }

  public double perimeter() { return 2.0 * Math.PI * radius; }
}