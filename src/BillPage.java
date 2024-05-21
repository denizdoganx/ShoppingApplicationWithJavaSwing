import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class BillPage extends JFrame {
	private JLabel issueDate = new JLabel();
	private JLabel totalPrice = new JLabel();
	private JLabel country = new JLabel();
	private JLabel city = new JLabel();
	private JLabel zipcode = new JLabel();
	private JLabel street = new JLabel();
	private JLabel buildingNumber = new JLabel();
	private JLabel info1 = new JLabel("<Issue Date>");
	private JLabel info2 = new JLabel("<Total Price>");
	private JLabel info3 = new JLabel("<Delivery Address>");
	public BillPage(Bill bill) {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(400, 400);
		this.setTitle("Bill Details");
		
		info1.setBounds(10, 10, 300, 25);
		info1.setFont(new Font(null, Font.BOLD, 18));
		
		issueDate.setBounds(10, 40, 300, 25);
		issueDate.setFont(new Font(null, Font.BOLD, 18));
		issueDate.setText(String.valueOf(bill.getIssueDate()));
		
		info2.setBounds(10, 90, 300, 25);
		info2.setFont(new Font(null, Font.BOLD, 18));
		
		totalPrice.setBounds(10, 120, 300, 25);
		totalPrice.setFont(new Font(null, Font.BOLD, 18));
		totalPrice.setText("Total Price: " + String.valueOf(bill.getTotalPrice()) + "$");
		
		info3.setBounds(10, 170, 300, 25);
		info3.setFont(new Font(null, Font.BOLD, 18));
		
		Address tempAddress = bill.getDeliveryAddress();
		
		country.setText("Country: " + tempAddress.getCountry());
		country.setBounds(10, 200, 300, 25);
		country.setFont(new Font(null, Font.BOLD, 18));
		
		city.setText("City: " + tempAddress.getCity());
		city.setBounds(10, 230, 300, 25);
		city.setFont(new Font(null, Font.BOLD, 18));
		
		zipcode.setText("Zipcode: " + tempAddress.getZipcode());
		zipcode.setBounds(10, 260, 300, 25);
		zipcode.setFont(new Font(null, Font.BOLD, 18));
		
		street.setText("Street: " + tempAddress.getStreet());
		street.setBounds(10, 290, 300, 25);
		street.setFont(new Font(null, Font.BOLD, 18));
		
		buildingNumber.setText("Building Number: " + tempAddress.getbuildingNumber());
		buildingNumber.setBounds(10, 320, 300, 25);
		buildingNumber.setFont(new Font(null, Font.BOLD, 18));
		
		this.add(info3);
		this.add(info2);
		this.add(info1);
		
		this.add(issueDate);
		this.add(totalPrice);
		this.add(country);
		this.add(city);
		this.add(zipcode);
		this.add(street);
		this.add(buildingNumber);
		this.setLocationRelativeTo(null);
	}
}
