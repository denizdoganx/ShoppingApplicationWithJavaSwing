import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ItemPanel extends JPanel implements ActionListener {
	private JButton forwardButton;
	private JButton backwardButton;
	private JButton minusButton;
	private JButton plusButton;
	private JButton addToCartButton;
	private JLabel itemImage;
	private JLabel itemProperties;
	private JLabel itemDescription;
	private JLabel itemPrice;
	private JLabel itemSeller;
	private JLabel itemQuantity;
	private JLabel numberOfPieces;
	private JLabel pieceLetters;
	private JLabel messageForOutOfStock;
	private final int frameWidth = 1400;
	private final int frameHeight = 432;
	private final int imageWidth = 614;
	private final int imageHeight = 384;
	private Item item;
	private ArrayList<ImageIcon> allImages = new ArrayList<ImageIcon>() ;
	private int itemImageNo;
	private int totalPiece;
	protected ItemFrame itemFrame;
	
	public ItemPanel(Item item, ItemFrame itemFrame) {
		this.itemFrame = itemFrame;
		this.item = item;
		allImages = (this.item).getAllImages();
		itemImageNo = 0;
		if(item.getQuantity() == 0) totalPiece = 0;
		else 
			totalPiece = 1;
		itemProperties = new JLabel();
		itemProperties.setBounds(900, 0, 570, 30);
		itemProperties.setFont(new Font("Comic Sans", Font.BOLD, 30));
		itemProperties.setText("Product Features");
		
		
		itemDescription = new JLabel();
		itemDescription.setBounds(640, 35, 760, 25);
		itemDescription.setFont(new Font("Comic Sans", Font.PLAIN, 15));
		itemDescription.setText(item.getDescription());
		
		itemPrice = new JLabel();
		itemPrice.setBounds(640, 60, 200, 25);
		itemPrice.setFont(new Font("Comic Sans", Font.PLAIN, 18));
		itemPrice.setText("Product price: " + item.getPrice());
		
		itemSeller = new JLabel();
		itemSeller.setBounds(640, 85, 760, 25);
		itemSeller.setFont(new Font("Comic Sans", Font.PLAIN, 18));
		itemSeller.setText("Product seller: " + item.getseller());
		
		itemQuantity = new JLabel();
		itemQuantity.setBounds(640, 110, 760, 25);
		itemQuantity.setFont(new Font("Comic Sans", Font.PLAIN, 18));
		itemQuantity.setText("Number of remaining stocks of the product: " + item.getQuantity());
		
		itemImage = new JLabel();
		itemImage.setBounds(0, 0, imageWidth, imageHeight);
		itemImage.setIcon(allImages.get(itemImageNo));
		

		
		minusButton = new JButton(new ImageIcon("images/minusButton.png"));
		minusButton.addActionListener(this);
		minusButton.setBorder(BorderFactory.createSoftBevelBorder(0));
		minusButton.setBounds(716, 375, 24, 48);
		minusButton.setFocusable(false);
		minusButton.setBackground(Color.lightGray);
		minusButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		numberOfPieces = new JLabel();
		numberOfPieces.setBounds(732, 375, 48, 24);
		numberOfPieces.setText(String.valueOf(totalPiece));
		numberOfPieces.setHorizontalTextPosition(JLabel.CENTER);
		numberOfPieces.setHorizontalAlignment(JLabel.CENTER);
		
		pieceLetters = new JLabel();
		pieceLetters.setBounds(732, 399, 48, 24);
		pieceLetters.setText("Piece");
		pieceLetters.setHorizontalTextPosition(JLabel.CENTER);
		pieceLetters.setHorizontalAlignment(JLabel.CENTER);
		
		plusButton = new JButton(new ImageIcon("images/plusButton.png"));
		plusButton.addActionListener(this);
		plusButton.setBorder(BorderFactory.createSoftBevelBorder(0));
		plusButton.setBounds(772, 375, 24, 48);
		plusButton.setFocusable(false);
		plusButton.setBackground(Color.lightGray);
		plusButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		forwardButton = new JButton(new ImageIcon("images/forwardButton.png"));
		forwardButton.addActionListener(this);
		forwardButton.setBorder(BorderFactory.createBevelBorder(0));
		forwardButton.setBounds((imageWidth / 2) + 8, 384, 48, 48);
		forwardButton.setFocusable(false);
		forwardButton.setBackground(Color.white);
		forwardButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		backwardButton = new JButton(new ImageIcon("images/backwardButton.png"));
		backwardButton.addActionListener(this);
		backwardButton.setBorder(BorderFactory.createBevelBorder(0));
		backwardButton.setBounds((imageWidth / 2) - 56, 384, 48, 48);
		backwardButton.setFocusable(false);
		backwardButton.setBackground(Color.white);
		backwardButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		addToCartButton = new JButton("Add To Cart", new ImageIcon("images/cart.png"));
		addToCartButton.addActionListener(this);
		addToCartButton.setBounds(850, 375, 180, 48);
		addToCartButton.setHorizontalAlignment(JLabel.LEFT);
		addToCartButton.setHorizontalTextPosition(JLabel.RIGHT);
		addToCartButton.setFocusable(false);
		addToCartButton.setBackground(Color.orange);
		addToCartButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		messageForOutOfStock = new JLabel("!!! Out Of Stock !!!");
		messageForOutOfStock.setFont(new Font("MV Boli", Font.PLAIN, 25));
		messageForOutOfStock.setBounds(1080, 375, 250, 48);
		messageForOutOfStock.setForeground(Color.white);
		messageForOutOfStock.setOpaque(true);
		messageForOutOfStock.setBackground(Color.red);
		if(item.getQuantity() == 0)
			messageForOutOfStock.setVisible(true);
		else
			messageForOutOfStock.setVisible(false);
		
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(frameWidth, frameHeight));
		this.setLayout(null);
		
		this.add(itemImage);
		this.add(forwardButton);
		this.add(backwardButton);
		this.add(itemProperties);
		this.add(itemDescription);
		this.add(itemPrice);
		this.add(itemSeller);
		this.add(itemQuantity);
		this.add(minusButton);
		this.add(plusButton);
		this.add(numberOfPieces);
		this.add(pieceLetters);
		this.add(addToCartButton);
		this.add(messageForOutOfStock);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == forwardButton) {
			if(itemImageNo == 3) {
				itemImageNo = 0;
			}
			else {
				itemImageNo++;
			}
			itemImage.setIcon(allImages.get(itemImageNo));
		}
		else if(e.getSource() == backwardButton) {
			if(itemImageNo == 0) {
				itemImageNo = 3;
			}
			else {
				itemImageNo--;
			}
			itemImage.setIcon(allImages.get(itemImageNo));
		}
		else if(e.getSource() == minusButton) {
			if(totalPiece != 1 && totalPiece != 0) {
				totalPiece--;
				numberOfPieces.setText(String.valueOf(totalPiece));
			}
		}
		else if(e.getSource() == plusButton) {
			if(totalPiece != item.getQuantity() && item.getQuantity() != 0) {
				totalPiece++;
				numberOfPieces.setText(String.valueOf(totalPiece));
			}
		}
		else if (e.getSource() == addToCartButton) {
			boolean flag = false;
			flag = itemFrame.itemsPanel.controlPanel.customer.updateCart(item, totalPiece);
			if(flag)
				new MessagePage(item, this);
			else
				JOptionPane.showInternalMessageDialog(null, "You can add up to 4 different types of products to the cart", "Warning", JOptionPane.WARNING_MESSAGE);
		}
	}

}
