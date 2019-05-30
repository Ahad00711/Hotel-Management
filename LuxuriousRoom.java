
public class LuxuriousRoom extends FurnishedRoom
{
    public final double Lrent = 20000;
	private boolean smallKitchenwithcookingutilities;
	private boolean roomTemcontroller;
	private boolean studyTable;
	private boolean tableLamp;
	private boolean Scenery;
	private boolean bathTub;
	public boolean isSmallKitchenwithcookingutilities() {
		return smallKitchenwithcookingutilities;
	}
	public void setSmallKitchenwithcookingutilities(boolean smallKitchenwithcookingutilities) {
		this.smallKitchenwithcookingutilities = smallKitchenwithcookingutilities;
	}
	public boolean isRoomTemcontroller() {
		return roomTemcontroller;
	}
	public void setRoomTemcontroller(boolean roomTemcontroller) {
		this.roomTemcontroller = roomTemcontroller;
	}
	public boolean isStudyTable() {
		return studyTable;
	}
	public void setStudyTable(boolean studyTable) {
		this.studyTable = studyTable;
	}
	public boolean isTableLamp() {
		return tableLamp;
	}
	public void setTableLamp(boolean tableLamp) {
		this.tableLamp = tableLamp;
	}
	public boolean isScenery() {
		return Scenery;
	}
	public void setScenery(boolean scenery) {
		Scenery = scenery;
	}
	public boolean isBathTub() {
		return bathTub;
	}
	public void setBathTub(boolean bathTub) {
		this.bathTub = bathTub;
	}
	public LuxuriousRoom(boolean bed, boolean closet, boolean window, boolean fan, boolean light, WASHROOM washroom,
			boolean led, WIFI wifi, boolean sofa, TABLE table, boolean smallKitchenwithcookingutilities,
			boolean roomTemcontroller, boolean studyTable, boolean tableLamp, boolean scenery, boolean bathTub) {
		super(bed, closet, window, fan, light, washroom, led, wifi, sofa, table);
		this.smallKitchenwithcookingutilities = smallKitchenwithcookingutilities;
		this.roomTemcontroller = roomTemcontroller;
		this.studyTable = studyTable;
		this.tableLamp = tableLamp;
		Scenery = scenery;
		this.bathTub = bathTub;
	}
	
	
	
	public LuxuriousRoom() {
		super();
		this.smallKitchenwithcookingutilities = true;
		this.roomTemcontroller = true;
		this.studyTable = true;
		this.tableLamp = true;
		Scenery = true;
		this.bathTub = true;
	}
	public LuxuriousRoom(boolean b, boolean c, boolean d, boolean e, WASHROOM wr, boolean f, boolean g, WIFI wifi,
			boolean h, teatable t, boolean i, boolean j, boolean k, boolean l, boolean m, boolean n, boolean o) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("________________\nLuxurious Room\n________________\nFurnished Room Rent = "+getLrent()+" -/Rs. \nHas bed -->" + isBed() + "\nHas Closet -->" + isCloset() + "\nHas Window -->" + isWindow() + "\nHas a Fan -->"
				+ isFan() + "\nHas a Light -->" + isLight()+" \nHas washroom -->" + getWashroom() + "\nLED -->" + isLed() + "\nHas Wifi -->" + getWifi() + "\nHas  Sofa -->" + isSofa() + "\nHas Table -->"
				+ getTable() + "\nHas Bed -->" + isBed() + "\nHas Closet -->" + isCloset() + "\nHas Window -->" + isWindow()
				+ "\nHas Fan -->" + isFan() + "\nHas Light -->" + isLight()  +"\nHas Small Kitchen with cooking utilities -->" + isSmallKitchenwithcookingutilities()
				+ "\nHas room Temperature Controller -->" + isRoomTemcontroller() + "\nHas Study Table -->" + isStudyTable() + "\nHas Table Lamp -->" + isTableLamp()
				+ "\nHas Scenery -->" + isScenery() + "\nHas Bath-Tub For Bathing -->" + isBathTub() + " .");
	}
	public double getLrent() {
		return Lrent;
	}
	
	
	
}
