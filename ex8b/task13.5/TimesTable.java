import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimesTable extends JFrame
{
  private TimesTable(int rows, int number)
  {
    setTitle("TimesTable");
    Container contents = getContentPane();
    contents.setLayout(new GridLayout(rows, 5, 10, 5));
    
    for (int i = 1; i <= rows; i++)
    {
      contents.add(new JLabel(String.format("%d", i)));
      contents.add(new JLabel("X"));
      contents.add(new JLabel(String.format("%d", number)));
      contents.add(new JLabel("="));
      contents.add(new JLabel(String.format("%d", i * number)));
    }

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  } // TimesTable

  public static void main(String[] args)
  {
    int rows = Integer.parseInt(args[0]);
    int columns = Integer.parseInt(args[1]);
    TimesTable program = new TimesTable(rows, columns);
    program.setVisible(true);
  } // main
} // TimesTable