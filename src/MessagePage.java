import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MessagePage extends JFrame implements ActionListener {
	protected ItemPanel itemPanel;
	private JButton goToCart;
	private JButton keepShopping;
	private JLabel imageIcon;
	private JLabel descriptionLabel;
	private JLabel cartInfo;
	public MessagePage(Item item, ItemPanel itemPanel) {
		this.itemPanel = itemPanel;
		this.setSize(850, 200);
		this.setLayout(null);
		
		descriptionLabel = new JLabel(item.getDescription());
		descriptionLabel.setBounds(250, 10, 500, 25);
		
		imageIcon = new JLabel(item.getIcon());
		imageIcon.setBounds(10, 10, 240, 150);
		
		goToCart = new JButton("Go to cart");
		goToCart.setFocusable(false);
		goToCart.setCursor(new Cursor(Cursor.HAND_CURSOR));
		goToCart.setBounds(600, 40, 200, 25);
		goToCart.setBackground(Color.orange);
		goToCart.addActionListener(this);
		
		keepShopping = new JButton("Keep shopping");
		keepShopping.setFocusable(false);
		keepShopping.setCursor(new Cursor(Cursor.HAND_CURSOR));
		keepShopping.setBounds(600, 75, 200, 25);
		keepShopping.setBackground(Color.orange);
		keepShopping.addActionListener(this);
		
		cartInfo = new JLabel("The product has been added to your cart");
		cartInfo.setIcon(new ImageIcon("images/okeyButton.png"));
		cartInfo.setBounds(250, 50, 300, 25);
		
		this.add(cartInfo);
		this.add(goToCart);
		this.add(keepShopping);
		this.add(imageIcon);
		this.add(descriptionLabel);
		this.add(cartInfo);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == goToCart) {
			this.dispose();
			itemPanel.itemFrame.dispose();
			new ShoppingCartPage(itemPanel.itemFrame.itemsPanel.controlPanel.customer.getCart(), itemPanel.itemFrame.itemsPanel.controlPanel.customer);
		}
		else if(e.getSource() == keepShopping) {
			this.dispose();
			itemPanel.itemFrame.dispose();
		}
	}
	
}
