import java.util.Date;

public class Check extends PaymentMethod {
	
	private String name;
	private String bankName;
	public Check(String paymentType, Date paymentDate, int paymentAmount) {
		super(paymentType, paymentDate, paymentAmount);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
}
