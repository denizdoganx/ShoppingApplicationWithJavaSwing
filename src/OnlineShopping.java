
import java.io.IOException;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class OnlineShopping extends JFrame {
	
	
	public OnlineShopping(Customer customer) throws IOException {
		this.setTitle("Online Shopping");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new ControlPanel(customer));
		this.pack();
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
	}
}
