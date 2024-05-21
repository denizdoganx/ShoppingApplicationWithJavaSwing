import java.util.Date;

public abstract class PaymentMethod {

	private String paymentType;
	private Date paymentDate;
	private int paymentAmount;
	
	public PaymentMethod(String paymentType, Date paymentDate, int paymentAmount) {
		super();
		this.paymentType = paymentType;
		this.paymentDate = paymentDate;
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
}
