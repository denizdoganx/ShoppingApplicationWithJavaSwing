import java.util.Date;

public class Credit extends PaymentMethod {
	private String name;
	private Date expDate;
	
	public Credit(String paymentType, Date paymentDate, int paymentAmount) {
		super(paymentType, paymentDate, paymentAmount);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
}
