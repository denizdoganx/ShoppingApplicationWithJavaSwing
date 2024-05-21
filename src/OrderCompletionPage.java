import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class OrderCompletionPage extends JFrame implements ActionListener {
	private Customer customer;
	private ShoppingCart cart;
	private JLabel checkOrCreditCardLabel = new JLabel();
	private JButton confirmOrder = new JButton("Confirm Order");
	private JButton editCart = new JButton("Edit Cart");
	private JTextField checkOrCreditCardTextField = new JTextField();
	private JButton cash = new JButton("Cash");
	private JButton check = new JButton("Check");
	private JButton creditCard = new JButton("Credit Card");
	private JLabel paymentMethod = new JLabel("Please select a payment method");
	private JLabel address = new JLabel("Add an address for delivery");
	private JLabel countryLabel = new JLabel("Country: ");
	private JTextField countryTextField = new JTextField();
	private JLabel cityLabel = new JLabel("City: ");
	private JTextField cityTextField = new JTextField();
	private JLabel zipcodeLabel = new JLabel("Zipcode: ");
	private JTextField zipcodeTextField = new JTextField();
	private JLabel streetLabel = new JLabel("Street: ");
	private JTextField streetTextField = new JTextField();
	private JLabel buildingNumberLabel = new JLabel("Building Number: ");
	private JTextField buildingNumberTextField = new JTextField();
	private final JLabel controlLabelForCountry = new JLabel("This field cannot be left blank !!!");
	private final JLabel controlLabelForCity = new JLabel("This field cannot be left blank !!!");
	private final JLabel controlLabelForZipcode = new JLabel("This field cannot be left blank !!!");
	private final JLabel controlLabelForStreet = new JLabel("This field cannot be left blank !!!");
	private final JLabel controlLabelForBuildingNumber = new JLabel("This field cannot be left blank !!!");
	private JLabel controlLabelForPaymentMethod;
	public OrderCompletionPage(ShoppingCart cart, Customer customer) {
		this.cart = cart;
		this.customer = customer;
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(null);
		this.setSize(800, 800);
		
		
		address.setFont(new Font("MV Boli", Font.BOLD, 15));
		address.setBounds(10, 5, 300, 25);
		
		
		countryLabel.setBounds(10, 35, 110, 25);
		controlLabelForCountry.setVisible(false);
		controlLabelForCountry.setBounds(350, 35, 200, 25);
		controlLabelForCountry.setForeground(Color.red);
		countryTextField.setBounds(125, 35, 200, 25);
		
		
		cityLabel.setBounds(10, 60, 110, 25);
		controlLabelForCity.setVisible(false);
		controlLabelForCity.setBounds(350, 60, 200, 25);
		controlLabelForCity.setForeground(Color.red);
		cityTextField.setBounds(125, 60, 200, 25);
		
		
		zipcodeLabel.setBounds(10, 85, 110, 25);
		controlLabelForZipcode.setVisible(false);
		controlLabelForZipcode.setBounds(350, 85, 200, 25);
		controlLabelForZipcode.setForeground(Color.red);
		zipcodeTextField.setBounds(125, 85, 200, 25);
		
		
		streetLabel.setBounds(10, 110, 110, 25);
		controlLabelForStreet.setVisible(false);
		controlLabelForStreet.setBounds(350, 110, 200, 25);
		controlLabelForStreet.setForeground(Color.red);
		streetTextField.setBounds(125, 110, 200, 25);
		
		
		buildingNumberLabel.setBounds(10, 135, 110, 25);
		controlLabelForBuildingNumber.setVisible(false);
		controlLabelForBuildingNumber.setBounds(350, 135, 200, 25);
		controlLabelForBuildingNumber.setForeground(Color.red);
		buildingNumberTextField.setBounds(125, 135, 200, 25);
		
		
		paymentMethod.setFont(new Font("MV Boli", Font.BOLD, 16));
		controlLabelForPaymentMethod = new JLabel();
		controlLabelForPaymentMethod.setBounds(450, 250, 200, 25);
		controlLabelForPaymentMethod.setVisible(false);
		controlLabelForPaymentMethod.setForeground(Color.red);
		paymentMethod.setBounds(10, 175, 300, 25);
		
		
		cash.setBounds(10, 210, 100, 25);
		cash.setFocusable(false);
		cash.addActionListener(this);
		cash.setEnabled(false);
		
		
		check.setBounds(135, 210, 100, 25);
		check.setFocusable(false);
		check.addActionListener(this);
	
		
		creditCard.setBounds(260, 210, 100, 25);
		creditCard.setFocusable(false);
		creditCard.addActionListener(this);
		
		
		checkOrCreditCardLabel.setBounds(10, 250, 200, 25);
		checkOrCreditCardLabel.setVisible(false);
		
		
		checkOrCreditCardTextField.setBounds(235, 250, 200, 25);
		checkOrCreditCardTextField.setVisible(false);
		
		
		editCart.setBounds(10, 320, 200, 45);
		editCart.setFont(new Font("Comic Sans", Font.BOLD, 18));
		editCart.setFocusable(false);
		editCart.addActionListener(this);
		editCart.setBackground(Color.orange);
		
		
		confirmOrder.setBounds(240, 320, 200, 45);
		confirmOrder.setFont(new Font("Comic Sans", Font.BOLD, 18));
		confirmOrder.setFocusable(false);
		confirmOrder.addActionListener(this);
		confirmOrder.setBackground(Color.orange);
		
		
		this.add(cash);
		this.add(check);
		this.add(creditCard);
		this.add(paymentMethod);
		this.add(zipcodeLabel);
		this.add(zipcodeTextField);
		this.add(streetLabel);
		this.add(streetTextField);
		this.add(buildingNumberLabel);
		this.add(buildingNumberTextField);
		this.add(cityLabel);
		this.add(cityTextField);
		this.add(countryLabel);
		this.add(countryTextField);
		this.add(address);
		this.add(checkOrCreditCardLabel);
		this.add(checkOrCreditCardTextField);
		this.add(confirmOrder);
		this.add(editCart);
		this.add(controlLabelForCountry);
		this.add(controlLabelForCity);
		this.add(controlLabelForZipcode);
		this.add(controlLabelForStreet);
		this.add(controlLabelForBuildingNumber);
		this.add(controlLabelForPaymentMethod);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cash) {
			cash.setEnabled(false);
			check.setEnabled(true);
			creditCard.setEnabled(true);
			checkOrCreditCardLabel.setVisible(false);
			checkOrCreditCardTextField.setVisible(false);
		}
		else if(e.getSource() == check) {
			cash.setEnabled(true);
			check.setEnabled(false);
			creditCard.setEnabled(true);
			checkOrCreditCardLabel.setText("Enter Bank Name: ");
			checkOrCreditCardLabel.setVisible(true);
			checkOrCreditCardTextField.setVisible(true);
		}
		else if(e.getSource() == creditCard) {
			cash.setEnabled(true);
			check.setEnabled(true);
			creditCard.setEnabled(false);
			checkOrCreditCardLabel.setText("Enter Exp Date Of Your Card: ");
			checkOrCreditCardLabel.setVisible(true);
			checkOrCreditCardTextField.setVisible(true);
		}
		else if(e.getSource() == editCart) {
			this.dispose();
			new ShoppingCartPage(cart, customer);
		}
		else if(e.getSource() == confirmOrder) {
			if(countryControl() & cityControl() & zipcodeControl() & streetControl() & buildingNumberControl() & paymentMethodControl()) {
				Address address = new Address(streetTextField.getText(), buildingNumberTextField.getText(),
						zipcodeTextField.getText(), cityTextField.getText(), countryTextField.getText());
				Order order = cart.purchase();
				order.setDeliveryAddress(address);
				this.dispose();
				new OrderManagementPage(order, customer);
			}
		}
	}
	private boolean countryControl() {
		String temp = countryTextField.getText();
		if(temp.equals("") || temp.equals(null)) {
			controlLabelForCountry.setVisible(true);
			return false;
		}
		else {
			controlLabelForCountry.setVisible(false);
			return true;
		}
	}
	private boolean cityControl() {
		String temp = cityTextField.getText();
		if(temp.equals("") || temp.equals(null)) {
			controlLabelForCity.setVisible(true);
			return false;
		}
		else {
			controlLabelForCity.setVisible(false);
			return true;
		}
	}
	private boolean zipcodeControl() {
		String temp = zipcodeTextField.getText();
		if(temp.equals("") || temp.equals(null)) {
			controlLabelForZipcode.setVisible(true);
			return false;
		}
		else {
			controlLabelForZipcode.setVisible(false);
			return true;
		}
	}
	private boolean streetControl() {
		String temp = streetTextField.getText();
		if(temp.equals("") || temp.equals(null)) {
			controlLabelForStreet.setVisible(true);
			return false;
		}
		else {
			controlLabelForStreet.setVisible(false);
			return true;
		}
	}
	private boolean buildingNumberControl() {
		String temp = buildingNumberTextField.getText();
		if(temp.equals("") || temp.equals(null)) {
			controlLabelForBuildingNumber.setVisible(true);
			return false;
		}
		else {
			controlLabelForBuildingNumber.setVisible(false);
			return true;
		}
	}
	private boolean paymentMethodControl() {
		String temp = checkOrCreditCardTextField.getText();
		if((temp.equals("") || temp.equals(null)) && cash.isEnabled()) {
			controlLabelForPaymentMethod.setVisible(true);
			controlLabelForPaymentMethod.setText("This field cannot be left blank !!!");
			return false;
		}
		else {
			controlLabelForPaymentMethod.setVisible(false);
			return true;
		}
	}
}
