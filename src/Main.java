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
import javax.swing.border.EmptyBorder;

public class Main extends JFrame{

	public Main() {
		setSize(400, 220);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		JPanel topPanel = new JPanel();
		topPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JPanel midPanel = new JPanel(new BorderLayout());
		midPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

		JPanel midBottomPanel = new JPanel(new GridLayout(1, 4));
		midBottomPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

		JPanel bottomPanel = new JPanel(new GridLayout(1, 3));
		bottomPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JLabel recommend = new JLabel("오늘의 추천메뉴");
		topPanel.add(recommend);		
		
		JTextField searchAll = new JTextField(50);
		midPanel.add(searchAll);
		
		JButton search = new JButton("search");
		search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Restaurant res = new Restaurant();
			}
		});
		
		
		midPanel.add(search, BorderLayout.EAST);
		
		String categoryName[] = {"한식", "중식", "일식", "양식"};
		
		JButton categoryButton[] = new JButton[4];
		
		for(int i = 0; i < categoryName.length; i++) {
			categoryButton[i] = new JButton(categoryName[i]);
			midBottomPanel.add(categoryButton[i]);

			categoryButton[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Category log = new Category();
				}
			});
		}
		
		JButton shoppingCart = new JButton("장바구니");
		shoppingCart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Cart cart = new Cart();
			}
		});
		bottomPanel.add(shoppingCart);
		
		JButton analysis = new JButton("통계");
		analysis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Analysis analysis = new Analysis();
			}
		});
		bottomPanel.add(analysis);

		JButton logOut = new JButton("나가기");
		logOut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		bottomPanel.add(logOut);

		add(topPanel);
		add(midPanel);
		add(midBottomPanel);
		add(bottomPanel);
	}
}
