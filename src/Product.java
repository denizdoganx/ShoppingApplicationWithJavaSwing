
public class Product {
	
	private String id;
	private String description;
	private String price;
	private String seller;
	public Product(String id, String description, String price, String seller) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.seller = seller;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getseller() {
		return seller;
	}
	public void setseller(String seller) {
		this.seller = seller;
	}
	
}
