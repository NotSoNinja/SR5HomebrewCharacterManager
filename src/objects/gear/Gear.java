package objects.gear;

public class Gear {
	String name, desc;
	int grade, avail, cost;  //grade = rating
	boolean restricted, forbidden;
	
	public Gear(String namestr, int rating, int availability, boolean r, boolean f, int price, String description){
		name = namestr;
		grade = rating;
		avail = availability;
		restricted = r;
		forbidden = f;
		cost = price;
		desc = description;
	}
	
	//TODO getters and setters

}
