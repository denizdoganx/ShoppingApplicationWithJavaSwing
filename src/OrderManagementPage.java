import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class OrderManagementPage extends JFrame implements ActionListener {
	private Customer customer;
	private Order order;
	private JButton displayBillDetails = new JButton("Display Bill Details");
	private JButton displayOrderDetails = new JButton("Display Order Details");
	private JLabel infoMessage = new JLabel("Your order has been received.");
	public OrderManagementPage(Order order, Customer customer) {
		this.customer = customer;
		this.order = order;
		
		infoMessage.setBounds(10, 10, 375, 40);
		infoMessage.setFont(new Font(null, Font.BOLD, 25));
		infoMessage.setForeground(Color.GREEN);
		
		displayBillDetails.setBounds(10, 80, 180, 50);
		displayBillDetails.setFocusable(false);
		displayBillDetails.setCursor(new Cursor(Cursor.HAND_CURSOR));
		displayBillDetails.addActionListener(this);
		
		displayOrderDetails.setBounds(200, 80, 180, 50);
		displayOrderDetails.setFocusable(false);
		displayOrderDetails.setCursor(new Cursor(Cursor.HAND_CURSOR));
		displayOrderDetails.addActionListener(this);
	
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(400, 250);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.add(infoMessage);
		this.add(displayBillDetails);
		this.add(displayOrderDetails);
		
		this.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == displayBillDetails) {
			new BillPage(order.createBillingInformation());
		}
		else if(e.getSource() == displayOrderDetails) {
			new OrderDetailPage(order, customer);
		}
	}
}
