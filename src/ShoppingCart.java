import java.util.ArrayList;
import java.util.Random;

public class ShoppingCart {

	private TodaysDate date;
	private ArrayList<Item> items;
	private Random rnd;
	public ShoppingCart() {
		date = new TodaysDate();
		rnd = new Random();
		items = new ArrayList<>();
	}
	


	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public boolean update(Item item, int totalPiece) {
		boolean flag = false;
		if(totalPiece != 0) {
			for(Item i: items) {
				if(i.getId().equals(item.getId()))
					flag = true;
			}
			if(flag) {
				item.setHowMany(item.getHowMany() + totalPiece);
				item.setQuantity(item.getQuantity() - totalPiece);
			}
			else {
				if(items.size() < 4) {
					item.setHowMany(item.getHowMany() + totalPiece);
					item.setQuantity(item.getQuantity() - totalPiece);
					items.add(item);
					flag = true;
				}
				else
					flag = false;
			}
		}
		return flag;
	}

	public int calculateTotalPrice() {
		int totalPrice = 0;
		for(Item i: items)
			totalPrice += Integer.valueOf(i.getPrice().substring(0, i.getPrice().length() - 1)) * i.getHowMany();
		return totalPrice;
	}
	
	public int calculateTotalPiece() {
		int totalPiece = 0;
		for(Item i: items)
			totalPiece += i.getHowMany();
		return totalPiece;
	}
	
	public boolean remove(Item item) {
		return items.remove(item);
	}

	public Order purchase() {
		Order order = new Order(rnd.nextInt(100000000), date.getDate(), calculateTotalPrice(), calculateTotalPiece());
		emptyCart();
		return order;
	}
	
	public void emptyCart() {
		items.clear();
	}
	
	public int size() {
		return items.size();
	}
	
	public ArrayList<Item> getAllItems(){
		return items;
	}
}
