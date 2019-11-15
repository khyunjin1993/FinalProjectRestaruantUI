import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Analysis extends JFrame {
	Analysis(){
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
	}
}
