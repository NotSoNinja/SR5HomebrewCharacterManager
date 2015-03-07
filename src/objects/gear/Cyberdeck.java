package objects.gear;

public class Cyberdeck extends Gear {
	int attribs[] = {0,0,0,0};
	int progs;
	//TODO something to hold installed programs
	//TODO figure if we use these for RCC's or not...

	public Cyberdeck(String namestr, int rating, int attributes[], int programs, int availability, boolean r, boolean f, int price, String description) {
		super(namestr, rating, availability, r, f, price, description);
		attribs = attributes;
		progs = programs;
	}
	
	//TODO getters and setters

}
