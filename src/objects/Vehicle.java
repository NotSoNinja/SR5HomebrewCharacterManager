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
		pilot = attribs[4];
		body = attribs[5];
		armor = attribs[6];
		sensor = attribs[7];
		restricted = r;
		forbidden = f;
		desc = description;
	}
	
	//TODO getters and setters
	
}
