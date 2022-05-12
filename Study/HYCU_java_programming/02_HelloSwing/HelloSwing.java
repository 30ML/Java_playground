import javax.swing.JFrame;

public class HelloSwing {
  public static void main(String[] args) {
    JFrame myFrame = new JFrame();

    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setTitle("Hello Swing!");
    myFrame.setSize(300, 300);
    myFrame.setVisible(true);
  }
}
