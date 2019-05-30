
public class WIFI {

	private String linkspeed;
	private boolean unlimited;

	public String getLinkspeed() {
		return linkspeed;
	}

	public void setLinkspeed(String linkspeed) {
		this.linkspeed = linkspeed;
	}

	public boolean isUnlimited() {
		return unlimited;
	}

	public void setUnlimited(boolean unlimited) {
		this.unlimited = (unlimited == true);
	}

	public WIFI() {
		super();
		setLinkspeed("8 MB/sec");
		setUnlimited(false);
	}

	@Override
	public String toString() {
		return "WIFI link speed << " + linkspeed + " >>. , Unlimited << " + unlimited + ">> .";
	}

}
