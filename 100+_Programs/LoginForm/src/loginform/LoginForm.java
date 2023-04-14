package loginform;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Administrator
 */
public class LoginForm extends JFrame {
    // method to initialize frame

    public void initFrame() {
        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
