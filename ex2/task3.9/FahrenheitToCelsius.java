public class FahrenheitToCelsius
{
  public static void main(String[] args)
  {
    double fahr = Double.parseDouble(args[0]);
    double celsius = (fahr - 32) * 5 / 9;

    System.out.println("Fahrenheit: " + fahr + "; " + "Celsius: " + celsius);
  }
}