public class Rectangle
{
  private Point point1, point2, point3, point4;
  private double edgeX, edgeY;

  public Rectangle(Point diagEnd1, Point diagEnd2)
  {
    this.point1 = diagEnd1;
    this.point4 = diagEnd2;
    this.point2 = new Point(point1.getX(), point4.getY());
    this.point3 = new Point(point4.getX(), point1.getY());

    this.edgeX = point3.getX() - point1.getX();
    this.edgeY = point2.getY() - point1.getY();
  } // Rectangle

  public String toString()
  {
    return String.format("Rectangle(%s, %s, %s, %s)",
                         point1, point2, point3, point4);
  } // toString

  public Rectangle shift(double xShift, double yShift)
  {
    Point newPoint1 = new Point(point1.getX() + xShift, 
                                point1.getY() + yShift);
    Point newPoint4 = new Point(point4.getX() + xShift, 
                                point4.getY() + yShift);

    return new Rectangle(newPoint1, newPoint4);
  } // shift

  public double area()
  {
    return edgeX * edgeY;
  } // area

  public double perimeter()
  {
    return edgeX * 2 + edgeY * 2;
  } // perimeter
}