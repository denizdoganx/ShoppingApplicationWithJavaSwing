import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class OrderDetailPage extends JFrame {
	private JLabel orderID;
	private JLabel orderDate;
	private JLabel totalPiece;
	private JLabel totalPrice;
	private JLabel customerInfo = new JLabel("Customer Informations");
	private JLabel nameSurname;
	private JLabel email;
	private JLabel phone;
	public OrderDetailPage(Order order, Customer customer) {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(600,400);
		this.setTitle("Order Details");
		
		orderID = new JLabel("Order ID: " + String.valueOf(order.getOrderID()));
		orderID.setBounds(0, 0, 500, 25);
		orderID.setFont(new Font(null, Font.PLAIN, 20));
		
		orderDate = new JLabel("Order Date: " + String.valueOf(order.getOrderDate()));
		orderDate.setBounds(0, 40, 500, 25);
		orderDate.setFont(new Font(null, Font.PLAIN, 20));
		
		totalPiece = new JLabel("Total Piece: " + order.getTotalPiece());
		totalPiece.setBounds(0, 80, 500, 25);
		totalPiece.setFont(new Font(null, Font.PLAIN, 20));
		
		totalPrice = new JLabel("Total Price: " + order.getTotalPrice() + "$");
		totalPrice.setBounds(0, 120, 500, 25);
		totalPrice.setFont(new Font(null, Font.PLAIN, 20));
		
		customerInfo.setBounds(0, 160, 500, 25);
		customerInfo.setFont(new Font(null, Font.PLAIN, 20));
		
		nameSurname = new JLabel("Name Surname: " + customer.getName() + " " + customer.getSurname());
		nameSurname.setBounds(0, 200, 500, 25);
		nameSurname.setFont(new Font(null, Font.PLAIN, 20));
		
		email = new JLabel("Email: " + customer.getEmail());
		email.setBounds(0, 240, 500, 25);
		email.setFont(new Font(null, Font.PLAIN, 20));
		
		phone = new JLabel("Phone: " + customer.getPhone());
		phone.setBounds(0, 280, 500, 25);
		phone.setFont(new Font(null, Font.PLAIN, 20));
		
		this.add(nameSurname);
		this.add(email);
		this.add(phone);
		this.add(customerInfo);
		this.add(orderID);
		this.add(orderDate);
		this.add(totalPiece);
		this.add(totalPrice);
		this.setLocationRelativeTo(null);
	}
}
