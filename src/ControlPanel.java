
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel implements ActionListener {
	
	protected Customer customer;
	private JButton myAccount = new JButton("My Account");
	private JButton myCart = new JButton("My Cart");
	private JLabel appName = new JLabel("ShoppApp");
	private JTextField searchField = new JTextField("Search for products");
	private JButton searchButton = new JButton("SEARCH");
	private JLabel searchLabel = new JLabel();
	public ControlPanel(Customer customer) throws IOException {
		this.customer = customer;
		this.setBackground(Color.white);
		appName.setBounds(80, 50, 300, 60);
		appName.setForeground(Color.red);
		appName.setFont(new Font("MV Boli", Font.BOLD, 50));
		
		searchLabel.setBounds(450, 55, 48, 48);
		searchLabel.setIcon(new ImageIcon("images/search-icon.png"));
		
		searchField.setBounds(500, 60, 400, 40);
		searchField.setFont(new Font("MV Boli", Font.BOLD, 15));
		
		searchButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		searchButton.addActionListener(this);
		searchButton.setBackground(Color.gray);
		searchButton.setForeground(Color.white);
		searchButton.setFocusable(false);
		searchButton.setBounds(900, 60, 100, 40);
		
		myCart.setCursor(new Cursor(Cursor.HAND_CURSOR));
		myCart.addActionListener(this);
		myCart.setBackground(Color.gray);
		myCart.setForeground(Color.white);
		myCart.setFocusable(false);
		myCart.setIcon(new ImageIcon("images/shop-cart-icon.png"));
		myCart.setHorizontalTextPosition(JButton.CENTER);
		myCart.setVerticalTextPosition(JButton.BOTTOM);
		myCart.setBounds(1100, 40, 120, 80);
		
		myAccount.setCursor(new Cursor(Cursor.HAND_CURSOR));
		myAccount.addActionListener(this);
		myAccount.setBackground(Color.gray);
		myAccount.setForeground(Color.white);
		myAccount.setFocusable(false);
		myAccount.setIcon(new ImageIcon("images/user-info-icon.png"));
		myAccount.setHorizontalTextPosition(JButton.CENTER);
		myAccount.setVerticalTextPosition(JButton.BOTTOM);
		myAccount.setBounds(1250, 40, 120, 80);

		this.add(myAccount);
		this.add(myCart);
		this.add(searchButton);
		this.add(searchLabel);
		this.add(searchField);
		this.add(appName);
		this.add(new ItemsPanel(new ProductDataBase(), this));
		this.setLayout(null);
		this.setPreferredSize(new Dimension(1500,800));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == myCart) {
			new ShoppingCartPage(customer.getCart(), customer);
		}
		else if(e.getSource() == myAccount) {
			new MyAccountPage(customer);
		}
	}
}
