
public class ItemsMENU {
	private String itemname = null;
	private int price = 0;

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ItemsMENU(String itemname, int price) {
		setItemname(itemname);
		this.price = price;
	}

	public String toString() {
		return String.format(itemname + ", price = " + price + "-/Rs.");
	}

}
