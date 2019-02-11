import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopClock extends JFrame implements ActionListener
{
  private boolean isRunning = false;
  private long startTime = 0;
  private long stopTime = 0;
  private long splitTime = 0;
  private final JTextField startTimeJLabel = new JTextField("Not started");
  private final JTextField splitTimeJLabel = new JTextField("Not started");
  private final JTextField stopTimeJLabel = new JTextField("Not started");
  private final JTextField elapsedTimeJLabel = new JTextField("Not started");
  private final JButton startStopJButton = new JButton("Start");
  private final JButton splitJButton = new JButton("Split");
  private final JButton resetJButton = new JButton("Reset");

  public StopClock()
  { 
    setTitle("Stop Clock");

    startTimeJLabel.setEnabled(false);
    splitTimeJLabel.setEnabled(false);
    stopTimeJLabel.setEnabled(false);
    elapsedTimeJLabel.setEnabled(false);

    Container contents = getContentPane();

    contents.setLayout(new GridLayout(0, 1));

    contents.add(new JTextField("Started at:"));
    contents.add(startTimeJLabel);

    contents.add(new JTextField("Split ellapsed time:"));
    contents.add(splitTimeJLabel);

    contents.add(new JTextField("Stopped at:"));
    contents.add(stopTimeJLabel);

    contents.add(new JTextField("Elapsed time (seconds):"));
    contents.add(elapsedTimeJLabel);
    
    startStopJButton.addActionListener(this);
    contents.add(startStopJButton);

    splitJButton.addActionListener(this);
    contents.add(splitJButton);
    splitJButton.setEnabled(false);

    resetJButton.addActionListener(this);
    contents.add(resetJButton);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  } // StopClock

  public void actionPerformed(ActionEvent event)
  {
    if (event.getSource() == startStopJButton)
    {
      if (!isRunning)
      {
        startTime = System.currentTimeMillis();
        startTimeJLabel.setText("" + startTime);
        splitTimeJLabel.setText("Running...");
        stopTimeJLabel.setText("Running...");
        elapsedTimeJLabel.setText("Running...");
        startStopJButton.setText("Stop");
        isRunning = true;
        splitJButton.setEnabled(true);
      } // if
      else
      {
        // update stop time
        stopTime = System.currentTimeMillis();
        stopTimeJLabel.setText("" + stopTime);
        long elapsedMilliSeconds = stopTime - startTime;
        elapsedTimeJLabel.setText("" + elapsedMilliSeconds / 1000.0);
        startStopJButton.setText("Start");
        isRunning = false;
        splitJButton.setEnabled(false);

        // update split time
        if (splitTime == 0)
          splitTimeJLabel.setText("N/A");  
      } // else
    }// if

    if (event.getSource() == splitJButton)
    {
      if (isRunning)
      {
        splitTime = System.currentTimeMillis();
        long elapsedMilliSeconds = splitTime - startTime;
        splitTimeJLabel.setText("" + elapsedMilliSeconds / 1000.0);
      } // if
    } // if

    if (event.getSource() == resetJButton)
    {
      isRunning = false;
      startTime = 0;
      stopTime = 0;
      splitTime = 0;

      startStopJButton.setText("Start");
      splitJButton.setEnabled(false);

      startTimeJLabel.setText("Not started");
      splitTimeJLabel.setText("Not started");
      stopTimeJLabel.setText("Not started");
      elapsedTimeJLabel.setText("Not started");
    }
    pack();
  } // actionPerformed

  public static void main(String[] args)
  {
    StopClock theStopClock = new StopClock();
    theStopClock.setVisible(true);
  } // main
} // StopClock