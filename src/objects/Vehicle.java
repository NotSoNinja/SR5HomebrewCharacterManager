package objects;

public class Vehicle {
	int handling, accel, spd, pilot, body, armor, sensor, avail, price;
	boolean restricted, forbidden;
	String nam, desc;
	/** 
	 * This Constructor makes a vehicle object
	 * @param name The vehicle's name
	 * @param attribs an array in the format [handling, accel, spd, pilot, body, armor, sensor]
	 * @param availability taken from the entry in the appropriate rulebook
	 * @param cost taken from the entry in the appropriate rulebook
	 * @param r Is the item restricted?
	 * @param f Is the item forbidden?
	 * @param description A description to cover things that we can't predict
	 */
	public Vehicle(String name, int attribs[], int availability, int cost, boolean r, boolean f, String description){
		nam = name;
		handling = attribs[0];
		accel = attribs[1];
		spd = attribs[2];
		pilot = attribs[3];
		body = attribs[4];
		armor = attribs[5];
		sensor = attribs[6];
		avail = availability;
		restricted = r;
		forbidden = f;
		desc = description;
	}
	/**
	 * @return the handling
	 */
	public int getHandling() {
		return handling;
	}
	/**
	 * @param handling the handling to set
	 */
	public void setHandling(int handling) {
		this.handling = handling;
	}
	/**
	 * @return the accel
	 */
	public int getAccel() {
		return accel;
	}
	/**
	 * @param accel the accel to set
	 */
	public void setAccel(int accel) {
		this.accel = accel;
	}
	/**
	 * @return the spd
	 */
	public int getSpeed() {
		return spd;
	}
	/**
	 * @param spd the spd to set
	 */
	public void setSpeed(int spd) {
		this.spd = spd;
	}
	/**
	 * @return the pilot
	 */
	public int getPilot() {
		return pilot;
	}
	/**
	 * @param pilot the pilot to set
	 */
	public void setPilot(int pilot) {
		this.pilot = pilot;
	}
	/**
	 * @return the body
	 */
	public int getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(int body) {
		this.body = body;
	}
	/**
	 * @return the armor
	 */
	public int getArmor() {
		return armor;
	}
	/**
	 * @param armor the armor to set
	 */
	public void setArmor(int armor) {
		this.armor = armor;
	}
	/**
	 * @return the sensor
	 */
	public int getSensor() {
		return sensor;
	}
	/**
	 * @param sensor the sensor to set
	 */
	public void setSensor(int sensor) {
		this.sensor = sensor;
	}
	/**
	 * @return the avail
	 */
	public int getAvail() {
		return avail;
	}
	/**
	 * @param avail the avail to set
	 */
	public void setAvail(int avail) {
		this.avail = avail;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the restricted
	 */
	public boolean isRestricted() {
		return restricted;
	}
	/**
	 * @param restricted the restricted to set
	 */
	public void setRestricted(boolean restricted) {
		this.restricted = restricted;
	}
	/**
	 * @return the forbidden
	 */
	public boolean isForbidden() {
		return forbidden;
	}
	/**
	 * @param forbidden the forbidden to set
	 */
	public void setForbidden(boolean forbidden) {
		this.forbidden = forbidden;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return nam;
	}
	/**
	 * @param nam the name to set
	 */
	public void setName(String name) {
		this.nam = name;
	}
	/**
	 * @return the description
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the description to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	//TODO getters and setters
	
}
