import java.util.Date;

public class Order {
	private int orderID;
	private Date orderDate;
	private int totalPrice;
	private int totalPiece;
	private Address deliveryAddress;
	public Order() {
		super();
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getTotalPiece() {
		return totalPiece;
	}
	public void setTotalPiece(int totalPiece) {
		this.totalPiece = totalPiece;
	}
	public Order(int orderID, Date orderDate, int totalPrice, int totalPiece) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.totalPiece = totalPiece;
	}
	
	
	
	public Address getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public Order(int orderID, Date orderDate, int totalPrice, int totalPiece, Address deliveryAddress) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.totalPiece = totalPiece;
		this.deliveryAddress = deliveryAddress;
	}
	public Bill createBillingInformation() {
		return new Bill(orderDate, totalPrice, deliveryAddress);
	}
	
}
