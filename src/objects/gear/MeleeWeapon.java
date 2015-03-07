package objects.gear;

public class MeleeWeapon extends Gear {
	int acc, rea, dam, ap;

	public MeleeWeapon(String namestr, int accuracy, int reach, int damage, int armorPierce, int availability, boolean r, boolean f, int price, String description) {
		super(namestr, 0, availability, r, f, price, description);
		// TODO Auto-generated constructor stub
		acc = accuracy;
		rea = reach;
		dam = damage;
		ap = armorPierce;
	}

	//TODO getters and setters
	
}
