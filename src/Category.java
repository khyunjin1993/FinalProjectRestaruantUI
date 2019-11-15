import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Category extends JFrame{	
	public Category() {
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel topPanel = new JPanel(new BorderLayout());
		JPanel midPanel = new JPanel();
		JPanel bottomPanel = new JPanel();

		JTextField search = new JTextField(50);
		topPanel.add(search);
		
		JButton searchButton = new JButton("검색");	
		topPanel.add(searchButton, BorderLayout.EAST);
		
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
	    
		midPanel.add(table);
		midPanel.add(sp);
		
		this.add(topPanel);
		this.add(midPanel);
	}
}
