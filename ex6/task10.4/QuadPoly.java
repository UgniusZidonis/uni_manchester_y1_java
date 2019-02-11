public class QuadPoly
{
  public double a, b, c;

  public QuadPoly(double a, double b, double c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public boolean lessThan(QuadPoly other)
  {
    // {<} = -1, {==} = 0, {>} = 1
    int compare = this.a < other.a ? -1 : this.a == other.a ? 0 : 1;
    // if a1 < a2
    if (compare < 0)
      return true;
    // if a1 > a2
    else if (compare > 0)
      return false;

    // {<} = -1, {==} = 0, {>} = 1
    compare = this.b < other.b ? -1 : this.b == other.b ? 0 : 1;
    // if b1 < b2
    if (compare < 0)
      return true;
    // if b1 > b2
    else if (compare > 0)
      return false;

    // {<} = -1, {==} = 0, {>} = 1
    compare = this.c < other.c ? -1 : this.c == other.c ? 0 : 1;
    // if c1 < c2
    if (compare < 0)
      return true;
    // else
    return false;
  }

  public boolean equals(QuadPoly other)
  {
    return this.a == other.a &&
           this.b == other.b &&
           this.c == other.c;
  }

  public String toString()
  {
    String firstPart = String.format("%.1fx^2", this.a);
    String secondPart = " " + (this.b >= 0 ? "+" : "-") + 
                        " " + Math.abs(this.b) + "x";
    String thirdPart = " " + (this.c >= 0 ? "+" : "-") + 
                       " " + Math.abs(this.c);
    return String.format(firstPart + secondPart + thirdPart);
  }
}