import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame
{
  private HelloWorld()
  {
    setTitle("Hello World");
    Container contents = getContentPane();
    contents.add(new JLabel("Bonjour..."));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  } // HelloWorld

  public static void main(String[] args)
  {
    HelloWorld program1 = new HelloWorld();
    program1.setVisible(true);
    HelloWorld program2 = new HelloWorld();
    program2.setVisible(true);
  } // main
} // HelloWorld