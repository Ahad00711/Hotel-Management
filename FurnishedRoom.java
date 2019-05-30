
public class FurnishedRoom extends ROOM {
	private WASHROOM washroom;
	
   public final int frent = 15000;
	public int getFrent() {
	return frent;
}

	private boolean led;
	private WIFI wifi;
	private boolean sofa;
	private TABLE table;

	public WASHROOM getWashroom() {
		return washroom;
	}

	public void setWashroom(WASHROOM washroom) {
		this.washroom = washroom;
	}

	public boolean isLed() {
		return led;
	}

	public void setLed(boolean led) {
		this.led = led;
	}

	public WIFI getWifi() {
		return wifi;
	}

	public void setWifi(WIFI wifi) {
		this.wifi = wifi;
	}

	public boolean isSofa() {
		return sofa;
	}

	public void setSofa(boolean sofa) {
		this.sofa = sofa;
	}

	public TABLE getTable() {
		return table;
	}

	public void setTable(TABLE table) {
		this.table = table;
	}

	public FurnishedRoom(boolean bed, boolean closet, boolean window, boolean fan, boolean light, WASHROOM washroom,
			boolean led, WIFI wifi, boolean sofa, TABLE table) {
		super(bed, closet, window, fan, light);
		this.washroom = washroom;
		this.led = led;
		this.wifi = wifi;
		this.sofa = sofa;
		this.table = table;
	}

	public FurnishedRoom() {
		super();
		this.washroom = new WASHROOM();
		this.led = true;
		this.wifi = new WIFI();
		this.sofa = true;
		this.table = new teatable();
	}
	
	@Override
	public String toString() {
		return String.format("________________\nFurnished Room \n________________\nFurnished Room Rent = "+getFrent()+" -/Rs. \nHas bed -->" + isBed() + "\nHas Closet -->" + isCloset() + "\nHas Window -->" + isWindow() + "\nHas a Fan -->"
				+ isFan() + "\nHas a Light -->" + isLight()+" \nHas washroom -->" + getWashroom() + "\nLED -->" + isLed() + "\nHas Wifi -->" + getWifi() + "\nHas  Sofa -->" + isSofa() + "\nHas Table -->"
				+ getTable() + "\nHas Bed -->" + isBed() + "\nHas Closet -->" + isCloset() + "\nHas Window -->" + isWindow()
				+ "\nHas Fan -->" + isFan() + "\nHas Light -->" + isLight()  + 
				   " .");
	}
	
	

}
