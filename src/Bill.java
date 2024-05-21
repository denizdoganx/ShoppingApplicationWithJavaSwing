import java.util.Date;

public class Bill {
	private Date issueDate;
	private int totalPrice;
	private Address deliveryAddress;
	public Bill(Date issueDate, int totalPrice) {
		super();
		this.issueDate = issueDate;
		this.totalPrice = totalPrice;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Address getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public Bill(Date issueDate, int totalPrice, Address deliveryAddress) {
		super();
		this.issueDate = issueDate;
		this.totalPrice = totalPrice;
		this.deliveryAddress = deliveryAddress;
	}
	
	
}
