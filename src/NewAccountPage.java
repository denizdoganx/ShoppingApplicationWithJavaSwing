import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class NewAccountPage extends JFrame implements ActionListener {
	private HashMap<String , String> idPasswords;
	private IDandPasswords idAndPasswords;
	private JButton back = new JButton("Back");
	private JButton create = new JButton("Create");
	private JLabel nameLabel;
	private JTextField nameField;
	private JLabel surnameLabel;
	private JTextField surnameField;
	private JLabel emailLabel;
	private JTextField emailField;
	private JLabel phoneLabel;
	private JTextField phoneField;
	private JLabel usernameLabel;
	private JTextField usernameField;
	private JLabel passwordLabel;
	private JPasswordField passwordField;
	private JLabel messageLabel;
	private JLabel emailControlLabel = new JLabel();
	private final JLabel nameControlLabel = new JLabel("This field cannot be left blank !!!");
	private final JLabel surnameControlLabel = new JLabel("This field cannot be left blank !!!");
	private JLabel phoneControlLabel = new JLabel();
	private JLabel usernameControlLabel = new JLabel();
	private JLabel passwordLControlLabel = new JLabel();
	public NewAccountPage(IDandPasswords idAndPasswords) {
		this.idAndPasswords = idAndPasswords;
		this.setTitle("New Account Page");
		idPasswords = idAndPasswords.getIDandPasswords();
		back.setBounds(50, 450, 200, 50);
		back.setFocusable(false);
		back.addActionListener(this);

		create.setBounds(320, 450, 200, 50);
		create.setFocusable(false);
		create.addActionListener(this);

		messageLabel = new JLabel("New Account");
		messageLabel.setBounds(200, 40, 400, 25);
		messageLabel.setFont(new Font("MV Boli", Font.BOLD, 30));

		emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(50, 100, 75, 25);

		emailField = new JTextField();
		emailField.setBounds(125, 100, 200, 25);
		
		emailControlLabel.setVisible(false);
		emailControlLabel.setForeground(Color.red);
		emailControlLabel.setFont(new Font("MV Boli", Font.PLAIN, 12));
		emailControlLabel.setBounds(350, 100, 200, 25);

		nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(50, 150, 75, 25);

		nameField = new JTextField();
		nameField.setBounds(125, 150, 200, 25);
		
		nameControlLabel.setVisible(false);
		nameControlLabel.setForeground(Color.red);
		nameControlLabel.setFont(new Font("MV Boli", Font.PLAIN, 12));
		nameControlLabel.setBounds(350, 150, 200, 25);

		surnameLabel = new JLabel("Surname: ");
		surnameLabel.setBounds(50, 200, 75, 25);

		surnameField = new JTextField();
		surnameField.setBounds(125, 200, 200, 25);
		
		surnameControlLabel.setVisible(false);
		surnameControlLabel.setForeground(Color.red);
		surnameControlLabel.setFont(new Font("MV Boli", Font.PLAIN, 12));
		surnameControlLabel.setBounds(350, 200, 200, 25);

		phoneLabel = new JLabel("Phone: ");
		phoneLabel.setBounds(50, 250, 75, 25);

		phoneField = new JTextField();
		phoneField.setBounds(125, 250, 200, 25);
		
		phoneControlLabel.setVisible(false);
		phoneControlLabel.setForeground(Color.red);
		phoneControlLabel.setFont(new Font("MV Boli", Font.PLAIN, 12));
		phoneControlLabel.setBounds(350, 250, 300, 25);

		usernameLabel = new JLabel("User ID: ");
		usernameLabel.setBounds(50, 300, 75, 25);
		
		usernameField = new JTextField();
		usernameField.setBounds(125, 300, 200, 25);
		
		usernameControlLabel.setVisible(false);
		usernameControlLabel.setForeground(Color.red);
		usernameControlLabel.setFont(new Font("MV Boli", Font.PLAIN, 12));
		usernameControlLabel.setBounds(350, 300, 200, 25);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(50, 350, 75, 25);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(125, 350, 200, 25);
		
		passwordLControlLabel.setVisible(false);
		passwordLControlLabel.setForeground(Color.red);
		passwordLControlLabel.setFont(new Font("MV Boli", Font.PLAIN, 12));
		passwordLControlLabel.setBounds(350, 350, 300, 25);
		
		this.add(usernameLabel);
		this.add(usernameField);
		this.add(usernameControlLabel);
		this.add(passwordLabel);
		this.add(passwordField);
		this.add(passwordLControlLabel);
		this.add(phoneLabel);
		this.add(phoneField);
		this.add(phoneControlLabel);
		this.add(back);
		this.add(create);
		this.add(surnameField);
		this.add(surnameLabel);
		this.add(surnameControlLabel);
		this.add(nameField);
		this.add(nameLabel);
		this.add(nameControlLabel);
		this.add(messageLabel);
		this.add(emailLabel);
		this.add(emailField);
		this.add(emailControlLabel);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(400, 0);
		this.setSize(650, 600);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == back) {
			this.dispose();
			new StartPage();
		}
		if (e.getSource() == create) {
			if(emailControl() & nameControl() & surnameControl() & phoneControl() & usernameControl() & passwordControl()) {
				Customer newCustomer = new Customer(nameField.getText(), surnameField.getText(), phoneField.getText(), emailField.getText(), null);
				newCustomer.setUsername(usernameField.getText());
				newCustomer.setPassword(String.valueOf(passwordField.getPassword()));
				try {
					idAndPasswords.putInTheDatabase(newCustomer);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				this.dispose();
				new LoginPage(idAndPasswords);
			}
				
		}
	}
	
	private boolean emailControl() {
		String temp = emailField.getText();
		if(temp.equals(null) || temp.equals("")) {
			emailControlLabel.setText("This field cannot be left blank !!!");
			emailControlLabel.setVisible(true);
			return false;
		}
		else if(!temp.endsWith("@outlook.com") && !temp.endsWith("@hotmail.com") && !temp.endsWith("@gmail.com")) {
			emailControlLabel.setText("Invalid email address !!!");
			emailControlLabel.setVisible(true);
			return false;
		}
		else {
			emailControlLabel.setVisible(false);
			return true;
		}
	}
	
	private boolean nameControl() {
		String temp = nameField.getText();
		if(temp.equals(null) || temp.equals("")) {
			nameControlLabel.setVisible(true);
			return false;
		}
		else {
			nameControlLabel.setVisible(false);
			return true;
		}
	}
	
	private boolean surnameControl() {
		String temp = surnameField.getText();
		if(temp.equals(null) || temp.equals("")) {
			surnameControlLabel.setVisible(true);
			return false;
		}
		else {
			surnameControlLabel.setVisible(false);
			return true;
		}
	}
	
	private boolean phoneControl() {
		String temp = phoneField.getText();
		if(temp.equals(null) || temp.equals("")) {
			phoneControlLabel.setVisible(true);
			phoneControlLabel.setText("This field cannot be left blank !!!");
			return false;
		}
		else if(temp.startsWith("0")) {
			phoneControlLabel.setText("Enter the number without 0 at the beginning !!!");
			phoneControlLabel.setVisible(true);
			return false;
		}
		else if(temp.length() != 10) {
			phoneControlLabel.setVisible(true);
			phoneControlLabel.setText("Number must be 10 digits !!!");
			return false;
		}
		else {
			phoneControlLabel.setVisible(false);
			return true;
		}
	}
	
	private boolean usernameControl() {
		String temp = usernameField.getText();
		if(temp.equals(null) || temp.equals("")) {
			usernameControlLabel.setVisible(true);
			usernameControlLabel.setText("This field cannot be left blank !!!");
			return false;
		}
		else if(idPasswords.containsKey(temp)) {
			usernameControlLabel.setVisible(true);
			usernameControlLabel.setText("This username is used !!!");
			return false;
		}
		else {
			usernameControlLabel.setVisible(false);
			return true;
		}
	}
	
	private boolean passwordControl() {
		String temp = String.valueOf(passwordField.getPassword());
		if(temp.equals(null) || temp.equals("")) {
			passwordLControlLabel.setVisible(true);
			passwordLControlLabel.setText("This field cannot be left blank !!!");
			return false;
		}
		else if(temp.length() < 4) {
			passwordLControlLabel.setVisible(true);
			passwordLControlLabel.setText("Password must be at least 4 characters !!!");
			return false;
		}
		else {
			passwordLControlLabel.setVisible(false);
			return true;
		}
	}
}
