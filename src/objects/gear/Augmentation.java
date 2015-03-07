package objects.gear;

public class Augmentation extends Gear {
	int rate, cap;
	float essenc;
	//TODO Something to hold mods

	public Augmentation(String namestr, int rating, float essence, int capacity, int availability, boolean r, boolean f, int price, String description) {
		super(namestr, rating, availability, r, f, price, description);
		rate = rating;
		cap = capacity;
		essenc = essence;
		//TODO Something to hold mods
	}
	
	//TODO Getters and setters

}
