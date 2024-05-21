
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
public class LoginPage extends JFrame implements ActionListener {
	
	private IDandPasswords customerDatabase;
	
	private JButton login;
	
	private JButton reset;
	
	private JTextField userIDField;
	
	private JPasswordField userPasswordField;
	
	private JLabel userIDLabel;
	
	private JLabel userPasswordLabel;
	
	private JLabel messageLabel;
	
	public LoginPage(IDandPasswords customerDatabase) {
		
		this.customerDatabase = customerDatabase;
		this.setTitle("Login Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(540, 120);
		this.setSize(420, 420);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
		login = new JButton("Login");
		reset = new JButton("Reset");
		userIDField = new JTextField();
		userPasswordField = new JPasswordField();
		userIDLabel = new JLabel("User ID: ");
		userPasswordLabel = new JLabel("Password: ");
		messageLabel = new JLabel();
		
		
		userIDLabel.setBounds(50, 100, 75, 25);
		userIDField.setBounds(125, 100, 200, 25);
		
		userPasswordLabel.setBounds(50, 150, 75, 25);
		userPasswordField.setBounds(125, 150, 200, 25);
		
		
		
		login.setFocusable(false);
		login.setBounds(125, 200, 100, 25);
		login.addActionListener(this);
		
		reset.setFocusable(false);
		reset.setBounds(225, 200, 100, 25);
		reset.addActionListener(this);
		
		messageLabel.setBounds(85, 250, 250, 35);
		messageLabel.setFont(new Font(null, Font.BOLD, 20));
		
		this.add(login);
		this.add(reset);
		this.add(userIDLabel);
		this.add(userIDField);
		this.add(userPasswordLabel);
		this.add(userPasswordField);
		this.add(messageLabel);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			HashMap<String, String> idPasswords = customerDatabase.getIDandPasswords();
			if(idPasswords.containsKey(userID)) {
				if(idPasswords.get(userID).equals(password)) {
					messageLabel.setText("Login Successful");
					this.dispose();
					try {
						new OnlineShopping(customerDatabase.getCustomerInformations(userID));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					messageLabel.setText("Wrong Password !!!");
				}
			}
			else {
				messageLabel.setText("Username not found !!!");
			}
		}
		if(e.getSource() == reset) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
	}
}
