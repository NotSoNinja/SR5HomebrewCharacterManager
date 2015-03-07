package objects.gear;

public class Augmentation extends Gear {
	int cap;
	float essenc;
	//TODO Something to hold mods

	public Augmentation(String namestr, int rating, float essence, int capacity, int availability, boolean r, boolean f, int price, String description) {
		super(namestr, rating, availability, r, f, price, description);
		cap = capacity;
		essenc = essence;
		//TODO Something to hold mods
	}
	
	//TODO Getters and setters

}
