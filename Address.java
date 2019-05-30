public class Address {
	private int houseNumber = 0;
	private int sectorNumber = 0;
	private String societyName = null;
	private String city = null;

	// getter setter methods

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public int getSectorNumber() {
		return sectorNumber;
	}

	public void setSectorNumber(int sectorNumber) {
		this.sectorNumber = sectorNumber;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(int houseNumber, int sectorNumber, String societyName, String city) {
		super();
		setHouseNumber(houseNumber);
		setSectorNumber(sectorNumber);
		setSocietyName(societyName);
		setCity(city);
	}

	@Override
	public String toString() {
		return "Address: " + sectorNumber + "-" + houseNumber + "," + societyName + "," + city;

	}

}