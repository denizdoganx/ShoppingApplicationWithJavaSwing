
import java.util.ArrayList;

public class Customer extends Person {

	private String username;
	
	private String password;

	private ShoppingCart cart;
	
	private ArrayList<Order> orders;
	
	public Customer(String name, String surname, String phone, String email, Address address) {
		super(name, surname, phone, email, address);
		initialize();
	}
	
	private void initialize() {
		orders = new ArrayList<>();
		cart = new ShoppingCart();
	}
	
	public void changeEmail(String email) {
		super.setEmail(email);
	}

	public boolean changePassword(String newPassword) {
		if(!password.equals(newPassword) && password.length() >= 5) {
			setPassword(newPassword);
			return true;
		}
		else return false;
	}
	
	public void emptyCart() {
		cart.emptyCart();
	}
	
	public boolean updateCart(Item item, int totalPiece) {
		return cart.update(item, totalPiece);
	}
	
	public ArrayList<Item> getAllItems(){
		return cart.getAllItems();
	}
	
	public ShoppingCart getCart() {
		return cart;
	}
	
	public void purchase() {
		cart.purchase();
	}
	
	public ArrayList<Order> getOrders() {
		return orders;
	}

	public boolean addOrder(Order order) {
		return orders.add(order);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
