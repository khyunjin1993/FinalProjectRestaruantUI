import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


//look for https://docs.oracle.com/javase/tutorial/uiswing/components/table.html
public class Restaurant extends JFrame {
	public Restaurant() {
		ArrayList <Menu> menuList = new ArrayList<>();

		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		JPanel topPanel = new JPanel(new BorderLayout());
		JPanel midPanel = new JPanel(new GridLayout(1, 2));
		JPanel bottomPanel = new JPanel();
		
		JLabel restaurantName = new JLabel("name...");
		JLabel leastPurchaseCost = new JLabel("cost...");
		
		for(Menu m : menuList) {
			
		}
			
		
		add(topPanel);
		add(midPanel);
	}
}

class Menu {
	//will be ported over
}