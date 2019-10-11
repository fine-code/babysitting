package babysitting;
import java.time.LocalDate;
public class Mother {
	
	private String name;
	private int numKids;
	private String address;
	private String phoneNum;
	private boolean needsBabysitter;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumKids() {
		return numKids;
	}

	public void setNumKids(int numKids) {
		this.numKids = numKids;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public boolean isNeedsBabysitter() {
		return needsBabysitter;
	}

	public void setNeedsBabysitter(boolean needsBabysitter) {
		this.needsBabysitter = needsBabysitter;
	}

	public int getNumRequests() {
		return numRequests;
	}

	public void setNumRequests(int numRequests) {
		this.numRequests = numRequests;
	}

	private int numRequests = 0;
	
	public Mother(String name, int numKids, String address, String string) {
		this.name = name;
		this.numKids = numKids;
		this.address = address;
		this.phoneNum = string;
	}
	
	public String request(String date) {
		this.numRequests++;
		this.needsBabysitter = true;
		String message = "Would you be able to " +
				"babysit for me on " + date + "?";
		return message;
	}
	
	

}
