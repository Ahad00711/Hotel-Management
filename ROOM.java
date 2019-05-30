
public class ROOM {

	private boolean bed ;
	private boolean closet ;
	private boolean window ;
	private boolean fan ;
	private boolean light ;
    public final int rent = 8000; 
	// Getter setter method

	public boolean isBed() {
		return bed;
	}

	public void setBed(boolean bed) {
		this.bed = bed;
	}

	public boolean isCloset() {
		return closet;
	}

	public void setCloset(boolean closet) {
		this.closet = closet;
	}

	public boolean isWindow() {
		return window;
	}

	public void setWindow(boolean window ) {
		this.window = window;
	}

	public boolean isFan() {
		
		return fan;
	}

	public void setFan(boolean fan) {
		this.fan = fan;
	}

	public boolean isLight() {
		return light;
	}

	public void setLight(boolean light) {
		this.light = light;
	}

	public ROOM(boolean bed, boolean closet, boolean window, boolean fan, boolean light) {
		
		setBed(bed);
		this.closet = closet;
		this.window = window;
		this.fan = fan;
		this.light = light;
	}

	public ROOM() {
		super();
		this.bed = true;
		this.closet = true;
		this.window = true;
		this.fan = true;
		this.light = true;
	}

	public int getRent() {
		return rent;
	}

	@Override
	public String toString() {
		return String.format("________________\nROOM \n________________\nRoom rent = "+getRent()+" -/Rs.\nHas bed -->" + isBed() + "\nHas Closet -->" + isCloset() + "\nHas Window -->" + isWindow() + "\nHas a Fan -->"
				+ isFan() + "\nHas a Light -->" + isLight() + " .");
	}

}
