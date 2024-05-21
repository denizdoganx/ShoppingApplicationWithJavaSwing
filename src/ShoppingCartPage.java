import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ShoppingCartPage extends JFrame  implements ActionListener {
	private Customer customer;
	private ShoppingCart cart;
	private ArrayList<Item> productInTheCart;
	private JLabel myCart;
	
	private JLabel selectedProducts;
	private JLabel priceTable;
	
	private JLabel firstItemIcon;
	private JLabel firstItemDescription;
	private JLabel firstItemPrice;
	
	private JLabel secondItemIcon;
	private JLabel secondItemDescription;
	private JLabel secondItemPrice;
	
	private JLabel thirdItemIcon;
	private JLabel thirdItemDescription;
	private JLabel thirdItemPrice;
	
	private JLabel fourthItemIcon;
	private JLabel fourthItemDescription;
	private JLabel fourthItemPrice;
	
	private JButton firstItemPlusButton;
	private JLabel firstItemQuantity;
	private JButton firstItemMinusButton;
	
	private JButton secondItemPlusButton;
	private JLabel secondItemQuantity;
	private JButton secondItemMinusButton;
	
	private JButton thirdItemPlusButton;
	private JLabel thirdItemQuantity;
	private JButton thirdItemMinusButton;
	
	private JButton fourthItemPlusButton;
	private JLabel fourthItemQuantity;
	private JButton fourthItemMinusButton;
	
	private JButton completeShopingButton;
	
	public ShoppingCartPage(ShoppingCart cart, Customer customer) {
		
		this.setTitle("My Cart");
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(1000, 800);
		this.setLayout(null);
		
		this.customer = customer;
		this.cart = cart;
		this.productInTheCart = cart.getAllItems();
		
		myCart = new JLabel();
		myCart.setFont(new Font("MV Boli", Font.BOLD, 25));
		myCart.setForeground(Color.red);
		myCart.setBounds(10, 10, 400, 30);
		
		if(cart.calculateTotalPiece() == 0) {
			myCart.setText("Your cart is currently empty");
		}
		else {
			myCart.setText("My Cart " + cart.calculateTotalPiece() + " item");
			selectedProducts = new JLabel("Selected Products (" + productInTheCart.size() + ")");
			selectedProducts.setBounds(750, 50, 300, 25);
			selectedProducts.setForeground(Color.orange);
			selectedProducts.setFont(new Font("Comic Sans", Font.BOLD, 20));
			
			priceTable = new JLabel();
			priceTable.setBounds(800, 100, 200, 30);
			priceTable.setFont(new Font(null, Font.BOLD, 25));
			priceTable.setText(cart.calculateTotalPrice() + "$");
			
			firstItemIcon = new JLabel();
			firstItemIcon.setBounds(10, 60, 240, 150);
			
			firstItemDescription = new JLabel();
			firstItemDescription.setBounds(270, 60, 400, 25);
			
			firstItemPrice = new JLabel();
			firstItemPrice.setBounds(270, 100, 100, 30);
			firstItemPrice.setFont(new Font("Comic Sans", Font.BOLD, 18));
			
			firstItemMinusButton = new JButton(new ImageIcon("images/minusButton.png"));
			firstItemMinusButton.addActionListener(this);
			firstItemMinusButton.setBounds(400, 100, 24, 24);
			firstItemMinusButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			firstItemMinusButton.setFocusable(false);
			firstItemMinusButton.setBackground(Color.white);
			firstItemMinusButton.setVisible(false);
			firstItemMinusButton.setEnabled(false);
			
			firstItemQuantity = new JLabel();
			firstItemQuantity.setBounds(424, 100, 24, 24);
			firstItemQuantity.setFont(new Font("Comic Sans", Font.BOLD, 18));
			firstItemQuantity.setHorizontalAlignment(JLabel.CENTER);
			firstItemQuantity.setVisible(false);
			
			firstItemPlusButton = new JButton(new ImageIcon("images/plusButton.png"));
			firstItemPlusButton.addActionListener(this);
			firstItemPlusButton.setBounds(448, 100, 24, 24);
			firstItemPlusButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			firstItemPlusButton.setFocusable(false);
			firstItemPlusButton.setBackground(Color.white);
			firstItemPlusButton.setVisible(false);
			firstItemPlusButton.setEnabled(false);
			
			secondItemIcon = new JLabel();
			secondItemIcon.setBounds(10, 240, 240, 150);
			
			secondItemDescription = new JLabel();
			secondItemDescription.setBounds(270, 240, 400, 25);
			
			secondItemPrice = new JLabel();
			secondItemPrice.setBounds(270, 280, 100, 30);
			secondItemPrice.setFont(new Font("Comic Sans", Font.BOLD, 18));
			
			secondItemMinusButton = new JButton(new ImageIcon("images/minusButton.png"));
			secondItemMinusButton.addActionListener(this);
			secondItemMinusButton.setBounds(400, 280, 24, 24);
			secondItemMinusButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			secondItemMinusButton.setFocusable(false);
			secondItemMinusButton.setBackground(Color.white);
			secondItemMinusButton.setVisible(false);
			secondItemMinusButton.setEnabled(false);
			
			secondItemQuantity = new JLabel();
			secondItemQuantity.setBounds(424, 280, 24, 24);
			secondItemQuantity.setFont(new Font("Comic Sans", Font.BOLD, 18));
			secondItemQuantity.setHorizontalAlignment(JLabel.CENTER);
			secondItemQuantity.setVisible(false);
			
			secondItemPlusButton = new JButton(new ImageIcon("images/plusButton.png"));
			secondItemPlusButton.addActionListener(this);
			secondItemPlusButton.setBounds(448, 280, 24, 24);
			secondItemPlusButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			secondItemPlusButton.setFocusable(false);
			secondItemPlusButton.setBackground(Color.white);
			secondItemPlusButton.setVisible(false);
			secondItemPlusButton.setEnabled(false);
			
			thirdItemIcon = new JLabel();
			thirdItemIcon.setBounds(10, 420, 240, 150);
			
			thirdItemDescription = new JLabel();
			thirdItemDescription.setBounds(270, 420, 400, 25);
			
			thirdItemPrice = new JLabel();
			thirdItemPrice.setBounds(270, 460, 100, 30);
			thirdItemPrice.setFont(new Font("Comic Sans", Font.BOLD, 18));
			
			thirdItemMinusButton = new JButton(new ImageIcon("images/minusButton.png"));
			thirdItemMinusButton.addActionListener(this);
			thirdItemMinusButton.setBounds(400, 460, 24, 24);
			thirdItemMinusButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			thirdItemMinusButton.setFocusable(false);
			thirdItemMinusButton.setBackground(Color.white);
			thirdItemMinusButton.setVisible(false);
			thirdItemMinusButton.setEnabled(false);
			
			thirdItemQuantity = new JLabel();
			thirdItemQuantity.setBounds(424, 460, 24, 24);
			thirdItemQuantity.setFont(new Font("Comic Sans", Font.BOLD, 18));
			thirdItemQuantity.setHorizontalAlignment(JLabel.CENTER);
			thirdItemQuantity.setVisible(false);
			
			thirdItemPlusButton = new JButton(new ImageIcon("images/plusButton.png"));
			thirdItemPlusButton.addActionListener(this);
			thirdItemPlusButton.setBounds(448, 460, 24, 24);
			thirdItemPlusButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			thirdItemPlusButton.setFocusable(false);
			thirdItemPlusButton.setBackground(Color.white);
			thirdItemPlusButton.setVisible(false);
			thirdItemPlusButton.setEnabled(false);
			
			fourthItemIcon = new JLabel();
			fourthItemIcon.setBounds(10, 600, 240, 150);
			
			fourthItemDescription = new JLabel();
			fourthItemDescription.setBounds(270, 600, 400, 25);
			
			fourthItemPrice = new JLabel();
			fourthItemPrice.setBounds(270, 640, 100, 30);
			fourthItemPrice.setFont(new Font("Comic Sans", Font.BOLD, 18));
			
			fourthItemMinusButton = new JButton(new ImageIcon("images/minusButton.png"));
			fourthItemMinusButton.addActionListener(this);
			fourthItemMinusButton.setBounds(400, 640, 24, 24);
			fourthItemMinusButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			fourthItemMinusButton.setFocusable(false);
			fourthItemMinusButton.setBackground(Color.white);
			fourthItemMinusButton.setVisible(false);
			fourthItemMinusButton.setEnabled(false);
			
			fourthItemQuantity = new JLabel();
			fourthItemQuantity.setBounds(424, 640, 24, 24);
			fourthItemQuantity.setFont(new Font("Comic Sans", Font.BOLD, 18));
			fourthItemQuantity.setHorizontalAlignment(JLabel.CENTER);
			fourthItemQuantity.setVisible(false);
			
			fourthItemPlusButton = new JButton(new ImageIcon("images/plusButton.png"));
			fourthItemPlusButton.addActionListener(this);
			fourthItemPlusButton.setBounds(448, 640, 24, 24);
			fourthItemPlusButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			fourthItemPlusButton.setFocusable(false);
			fourthItemPlusButton.setBackground(Color.white);
			fourthItemPlusButton.setVisible(false);
			fourthItemPlusButton.setEnabled(false);
			
			completeShopingButton = new JButton("Complete The Shopping");
			completeShopingButton.addActionListener(this);
			completeShopingButton.setBounds(720, 200, 250, 40);
			completeShopingButton.setFont(new Font("Comic Sans", Font.BOLD, 18));
			completeShopingButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			completeShopingButton.setFocusable(false);
			completeShopingButton.setBackground(Color.orange);
			completeShopingButton.setForeground(Color.white);
			
			fillInTheLabels();
			
			this.add(firstItemIcon);
			this.add(firstItemDescription);
			this.add(firstItemPrice);
			this.add(firstItemMinusButton);
			this.add(firstItemQuantity);
			this.add(firstItemPlusButton);
			
			this.add(secondItemIcon);
			this.add(secondItemDescription);
			this.add(secondItemPrice);
			this.add(secondItemMinusButton);
			this.add(secondItemQuantity);
			this.add(secondItemPlusButton);
			
			this.add(thirdItemIcon);
			this.add(thirdItemDescription);
			this.add(thirdItemPrice);
			this.add(thirdItemMinusButton);
			this.add(thirdItemQuantity);
			this.add(thirdItemPlusButton);
			
			this.add(fourthItemIcon);
			this.add(fourthItemDescription);
			this.add(fourthItemPrice);
			this.add(fourthItemMinusButton);
			this.add(fourthItemQuantity);
			this.add(fourthItemPlusButton);
			
			this.add(selectedProducts);
			this.add(priceTable);
			this.add(completeShopingButton);
		}
		this.add(myCart);
		this.setLocationRelativeTo(null);
	}
	
	private void fillInTheLabels() {
		Item tempItem = null;
		for(int i = 0;i < productInTheCart.size(); i++) {
			tempItem = productInTheCart.get(i);
			if(i == 0) {
				firstItemMinusButton.setEnabled(true);
				firstItemMinusButton.setVisible(true);
				firstItemQuantity.setVisible(true);
				firstItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				firstItemPlusButton.setVisible(true);
				firstItemPlusButton.setEnabled(true);
				firstItemIcon.setIcon(tempItem.getIcon());
				firstItemDescription.setText(tempItem.getDescription());
				firstItemPrice.setText(tempItem.getPrice());
			}
			else if(i == 1) {
				secondItemMinusButton.setEnabled(true);
				secondItemMinusButton.setVisible(true);
				secondItemQuantity.setVisible(true);
				secondItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				secondItemPlusButton.setVisible(true);
				secondItemPlusButton.setEnabled(true);
				secondItemIcon.setIcon(tempItem.getIcon());
				secondItemDescription.setText(tempItem.getDescription());
				secondItemPrice.setText(tempItem.getPrice());
			}
			else if(i == 2) {
				thirdItemMinusButton.setEnabled(true);
				thirdItemMinusButton.setVisible(true);
				thirdItemQuantity.setVisible(true);
				thirdItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				thirdItemPlusButton.setVisible(true);
				thirdItemPlusButton.setEnabled(true);
				thirdItemIcon.setIcon(tempItem.getIcon());
				thirdItemDescription.setText(tempItem.getDescription());
				thirdItemPrice.setText(tempItem.getPrice());
			}
			else if(i == 3) {
				fourthItemMinusButton.setEnabled(true);
				fourthItemMinusButton.setVisible(true);
				fourthItemQuantity.setVisible(true);
				fourthItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				fourthItemPlusButton.setVisible(true);
				fourthItemPlusButton.setEnabled(true);
				fourthItemIcon.setIcon(tempItem.getIcon());
				fourthItemDescription.setText(tempItem.getDescription());
				fourthItemPrice.setText(tempItem.getPrice());
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == firstItemPlusButton) {
			Item tempItem = productInTheCart.get(0);
			if(tempItem.getQuantity() != 0) {
				cart.update(tempItem, 1);
				firstItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				priceTable.setText(cart.calculateTotalPrice() + "$");
				myCart.setText("My Cart " + cart.calculateTotalPiece() + " item");
			}
			
		}
		else if(e.getSource() == firstItemMinusButton) {
			Item tempItem = productInTheCart.get(0);
			if(tempItem.getHowMany() > 1) {
				cart.update(tempItem, - 1);
				firstItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				priceTable.setText(cart.calculateTotalPrice() + "$");
				myCart.setText("My Cart " + cart.calculateTotalPiece() + " item");
			}
		}
		else if(e.getSource() == secondItemPlusButton) {
			Item tempItem = productInTheCart.get(1);
			if(tempItem.getQuantity() != 0) {
				cart.update(tempItem, 1);
				secondItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				priceTable.setText(cart.calculateTotalPrice() + "$");
				myCart.setText("My Cart " + cart.calculateTotalPiece() + " item");
			}
		}
		else if(e.getSource() == secondItemMinusButton) {
			Item tempItem = productInTheCart.get(1);
			if(tempItem.getHowMany() > 1) {
				cart.update(tempItem, - 1);
				secondItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				priceTable.setText(cart.calculateTotalPrice() + "$");
				myCart.setText("My Cart " + cart.calculateTotalPiece() + " item");
			}
		}
		else if(e.getSource() == thirdItemPlusButton) {
			Item tempItem = productInTheCart.get(2);
			if(tempItem.getQuantity() != 0) {
				cart.update(tempItem, 1);
				thirdItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				priceTable.setText(cart.calculateTotalPrice() + "$");
				myCart.setText("My Cart " + cart.calculateTotalPiece() + " item");
			}
		}
		else if(e.getSource() == thirdItemMinusButton) {
			Item tempItem = productInTheCart.get(2);
			if(tempItem.getHowMany() > 1) {
				cart.update(tempItem, - 1);
				thirdItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				priceTable.setText(cart.calculateTotalPrice() + "$");
				myCart.setText("My Cart " + cart.calculateTotalPiece() + " item");
			}
		}
		else if(e.getSource() == fourthItemPlusButton) {
			Item tempItem = productInTheCart.get(3);
			if(tempItem.getQuantity() != 0) {
				cart.update(tempItem, 1);
				fourthItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				priceTable.setText(cart.calculateTotalPrice() + "$");
				myCart.setText("My Cart " + cart.calculateTotalPiece() + " item");
			}
		}
		else if(e.getSource() == fourthItemMinusButton) {
			Item tempItem = productInTheCart.get(3);
			if(tempItem.getHowMany() > 1) {
				cart.update(tempItem, - 1);
				fourthItemQuantity.setText(String.valueOf(tempItem.getHowMany()));
				priceTable.setText(cart.calculateTotalPrice() + "$");
				myCart.setText("My Cart " + cart.calculateTotalPiece() + " item");
			}
		}
		else if(e.getSource() == completeShopingButton) {
			this.dispose();
			new OrderCompletionPage(cart, customer);
		}
	}
}
