public class Triangle
{
  private Point point1, point2, point3;
  private double edge1, edge2, edge3;

  public Triangle(Point point1, Point point2, Point point3)
  {
    this.point1 = point1;
    this.point2 = point2;
    this.point3 = point3;

    this.edge1 = Math.pow(
                 Math.pow(point2.getX() - point1.getX(), 2) +
                 Math.pow(point2.getY() - point1.getY(), 2)
                 , 0.5);
    this.edge2 = Math.pow(
                 Math.pow(point3.getX() - point2.getX(), 2) +
                 Math.pow(point3.getY() - point2.getY(), 2)
                 , 0.5);
    this.edge3 = Math.pow(
                 Math.pow(point1.getX() - point3.getX(), 2) +
                 Math.pow(point1.getY() - point3.getY(), 2)
                 , 0.5);
  } // Triangle

  public String toString()
  {
    return String.format("Triangle(%s, %s, %s)", 
                  point1, point2, point3);
  } // toString

  public Triangle shift(double xShift, double yShift)
  {
    Point newPoint1 = new Point(point1.getX() + xShift, 
                                point1.getY() + yShift);
    Point newPoint2 = new Point(point2.getX() + xShift, 
                                point2.getY() + yShift);
    Point newPoint3 = new Point(point3.getX() + xShift, 
                                point3.getY() + yShift);

    return new Triangle(newPoint1, newPoint2, newPoint3);
  } // shift

  public double area()
  {
    double s = (edge1 + edge2 + edge3) / 2;
    return Math.pow(s * (s - edge1) * (s - edge2) * (s - edge3), 0.5);
  } // area

  public double perimeter()
  {
    return edge1 + edge2 + edge3;
  } // perimeter
}