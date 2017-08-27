package package04_AdapterPattern.Example00;

public class Address {
	private String streeName;
	private int houseNumber;
	private int postcode;
	private String city;
	
	public Address(){}
	
	public Address(String streeName, int houseNumber, int postcode, String city) {
			this.streeName = streeName;
			this.houseNumber = houseNumber;
			this.postcode = postcode;
			this.city = city;
	}
	public String getStreeName() {
		return streeName;
	}
	public void setStreeName(String streeName) {
		this.streeName = streeName;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [streeName=" + streeName 
				+  ", houseNumber=" + houseNumber 
				+  ", postcode=" + postcode 
				+ ", city=" + city + "]";
	}

}
