import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Cart extends JFrame {
	Cart(){
		setSize(400, 280);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

		JPanel topPanel = new JPanel();
		JPanel midPanel = new JPanel(new GridLayout(1, 2));
		
		String data[][]={ {"101","Amit","670000"},    
				{"102","Jai","780000"},    
				{"101","Sachin","700000"},    
				{"101","Sachin","700000"},    
				{"101","Sachin","700000"},    
				{"101","Sachin","700000"},    
				{"101","Sachin","700000"},    
				{"101","Sachin","700000"},    
				{"101","Sachin","700000"},    
				{"101","Sachin","700000"},    
				{"101","Sachin","700000"},    
				{"101","Sachin","700000"}};    
		
		String column[]={"ID","NAME","SALARY"};   

		JTable table = new JTable(data, column);
		table.setBounds(30, 40, 200, 300);
	    JScrollPane sp = new JScrollPane(table);
	    sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

	    topPanel.add(table);
	    topPanel.add(sp);
	    
	    JButton delete = new JButton("삭제");
	    midPanel.add(delete);
	    
	    JButton exit = new JButton("나가기");
	    midPanel.add(exit);
	    
	    
		
		this.add(topPanel);
		this.add(midPanel);
		
	}
}
