import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JPanel {	
	public Login() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setSize(300, 100);
		JPanel topPanel[] = new JPanel[4];
		
		for(int i = 0; i < topPanel.length; i++) {
			topPanel[i] = new JPanel(new BorderLayout());
		}
		
//		JPanel topPanel = new JPanel(new BorderLayout());
		JPanel midPanel = new JPanel(new GridLayout(1, 2));
		JPanel bottomPanel = new JPanel();
		
		String[] labels = {"이름: ", "나이: ", "성별: ", "주소: "};
		int numPairs = labels.length;
		
		for(int i = 0; i < numPairs; i++) {
			JLabel l = new JLabel(labels[i], JLabel.TRAILING);
			topPanel[i].add(l, BorderLayout.WEST);
			JTextField text = new JTextField(20);
			l.setLabelFor(text);
			topPanel[i].add(text, BorderLayout.EAST);
			add(topPanel[i]);
		}
		
		JButton login = new JButton("들어가기");
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
			}
			
		});
		
		JButton exit = new JButton("나가기");
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		
		midPanel.add(login);
		midPanel.add(exit);
		
		add(midPanel);
	}
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Login screen");
		frame.setDefaultCloseOperation(3);
		
		JComponent newContentPane = new Login();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		
		frame.pack();
		frame.setVisible(true);		
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
