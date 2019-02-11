public class Point
{
  private double x, y;

  public Point(double x, double y)
  {
    this.x = x;
    this.y = y;
  } // Point

  public String toString() { return String.format("(%.1f, %.1f)", x, y); }

  public double getX() { return x; }
  public double getY() { return y; }
}