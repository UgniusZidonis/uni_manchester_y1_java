import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloFamily extends JFrame
{
  private HelloFamily()
  {
    setTitle("Hello Family");
    Container contents = getContentPane();
    contents.setLayout(new FlowLayout());
    contents.add(new JLabel("Hello, Vytautas"));
    contents.add(new JLabel("Hello, Raima"));
    contents.add(new JLabel("Hello, Audrius"));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  } // HelloWorld

  public static void main(String[] args)
  {
    HelloFamily program = new HelloFamily();
    program.setVisible(true);
  } // main
} // HelloWorld