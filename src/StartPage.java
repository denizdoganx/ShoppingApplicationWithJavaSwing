
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class StartPage extends JFrame implements ActionListener {

	private JButton signIn;
	
	private JButton createAccount;
	
	public StartPage() {
		this.setTitle("Start  Page");
		this.setLocation(540, 120);
		this.setSize(420, 420);
		this.setLayout(null);
		signIn = new JButton("Sign In");
		signIn.setBounds(100, 150, 200, 25);
		signIn.setFocusable(false);
		signIn.addActionListener(this);
		
		createAccount = new JButton("Create Account");
		createAccount.setBounds(100, 200, 200, 25);
		createAccount.setFocusable(false);
		createAccount.addActionListener(this);
		
		
		this.add(signIn);
		this.add(createAccount);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setVisible(true);
		this.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		IDandPasswords loginInfo = null;
		try {
			loginInfo = new IDandPasswords();
		} catch (IOException e1) { e1.printStackTrace();} 	
		if(e.getSource() == signIn) {
			this.dispose();
			
			new LoginPage(loginInfo);
		}
		if(e.getSource() == createAccount) {
			this.dispose();
			new NewAccountPage(loginInfo);
		}
	}
}
