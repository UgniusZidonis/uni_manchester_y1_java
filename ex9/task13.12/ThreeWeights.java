import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreeWeights extends JFrame implements ActionListener
{
  private final JTextField inputWeight1JTextField = new JTextField();
  private final JTextField inputWeight2JTextField = new JTextField();
  private final JTextField inputWeight3JTextField = new JTextField();
  private final JButton showResultsJButton = new JButton("Show results");

  public ThreeWeights()
  { 
    setTitle("Three weights");

    Container contents = getContentPane();

    contents.setLayout(new GridLayout(0, 3));

    contents.add(new JLabel());
    contents.add(new JLabel("Please input 3 weights"));
    contents.add(new JLabel());

    contents.add(new JLabel("Weight 1:"));
    contents.add(new JLabel("Weight 2:"));
    contents.add(new JLabel("Weight 3:"));

    contents.add(inputWeight1JTextField);
    contents.add(inputWeight2JTextField);
    contents.add(inputWeight3JTextField);
    
    showResultsJButton.addActionListener(this);
    contents.add(new JLabel());
    contents.add(showResultsJButton);
    contents.add(new JLabel());

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  } // ThreeWeights

  public void actionPerformed(ActionEvent event)
  {
    int number1 = Integer.parseInt(inputWeight1JTextField.getText());
    int number2 = Integer.parseInt(inputWeight2JTextField.getText());
    int number3 = Integer.parseInt(inputWeight3JTextField.getText());

    for (int a = -1; a <= 1; a++)
      for (int b = -1; b <= 1; b++)
        for (int c = -1; c <= 1; c++){
          int availableWeight =
            number1 * a +
            number2 * b +
            number3 * c;
          getContentPane().add(new JLabel("" + availableWeight));
        }

    pack();
  } // actionPerformed

  public static void main(String[] args)
  {
    ThreeWeights theThreeWeights = new ThreeWeights();
    theThreeWeights.setVisible(true);
  } // main
} // ThreeWeights