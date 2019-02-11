import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloFamily extends JFrame
{
  private HelloFamily(int rows, int columns)
  {
    setTitle("Hello Family");
    Container contents = getContentPane();
    contents.setLayout(new GridLayout(rows, columns));
    contents.add(new JLabel("Hello, Vytautas"));
    contents.add(new JLabel("Hello, Raima"));
    contents.add(new JLabel("Hello, Audrius"));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  } // HelloWorld

  public static void main(String[] args)
  {
    int rows = Integer.parseInt(args[0]);
    int columns = Integer.parseInt(args[1]);
    HelloFamily program = new HelloFamily(rows, columns);
    program.setVisible(true);
  } // main
} // HelloWorld