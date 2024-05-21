import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyAccountPage extends JFrame {
	private JLabel name;
	private JLabel surname;
	private JLabel phone;
	private JLabel email;
	private JLabel username;
	private JLabel password;
	private JLabel icon;
	public MyAccountPage(Customer customer) {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(600, 450);
		
		icon = new JLabel(new ImageIcon("images/myAccount128px.png"));
		icon.setBounds(450, 10, 128, 128);
		
		name = new JLabel("Name: " + customer.getName());
		name.setBounds(10, 10, 400, 25);
		name.setFont(new Font("MV Boli", Font.PLAIN, 20));
		
		surname = new JLabel("Surname: " + customer.getSurname());
		surname.setBounds(10, 50, 400, 25);
		surname.setFont(new Font("MV Boli", Font.PLAIN, 20));
		
		phone = new JLabel("Phone: " + customer.getPhone());
		phone.setBounds(10, 90, 400, 25);
		phone.setFont(new Font("MV Boli", Font.PLAIN, 20));
		
		email = new JLabel("Email: " + customer.getEmail());
		email.setBounds(10, 130, 400, 25);
		email.setFont(new Font("MV Boli", Font.PLAIN, 20));
		
		username = new JLabel("Username: " + customer.getUsername());
		username.setBounds(10, 170, 400, 25);
		username.setFont(new Font("MV Boli", Font.PLAIN, 20));
		
		password = new JLabel("Password: " + customer.getPassword());
		password.setBounds(10, 210, 400, 25);
		password.setFont(new Font("MV Boli", Font.PLAIN, 20));
		
		this.add(icon);
		this.add(name);
		this.add(surname);
		this.add(phone);
		this.add(email);
		this.add(username);
		this.add(password);
		this.setLocationRelativeTo(null);
	}
	
}
