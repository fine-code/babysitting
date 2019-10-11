package babysitting;

public class Babysitter {

	private String name;
	private String address;
	private String phoneNum;
	private boolean available = true;
	
	public Babysitter(String name, String address, String phoneNum) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Name: " + this.name);
		str.append("Phone Number" + this.phoneNum);
		return str.toString();
	}

}
