
public class CustomerStatus {

	private String nowState;
	private final String newState = "New";
	private final String activeState = "Active";
	private final String blockedState = "Blocked";
	
	public CustomerStatus(String nowState) {
		
		this.nowState = nowState;
	}

	public String getNowState() {
		return nowState;
	}
	
	public boolean setNowState(String nowState) {
		if(nowState.equals(newState) || nowState.equals(activeState) || nowState.equals(blockedState)) {
			this.nowState = nowState;
			return true;
		}
		else {
			return false;
		}
	}
	
}
