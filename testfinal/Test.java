package testfinal;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
public class Test extends JFrame{
  public Test () {
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("My Frame...");
    setLayout(new FlowLayout());

    JButton button = new JButton("버튼");
    add(button);
    setVisible(true);
  }
}
