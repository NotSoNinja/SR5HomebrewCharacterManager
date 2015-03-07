package objects.gear;

import enums.FireMode;

public class RangedWeapon extends Gear {
	int acc, dam, ap, rc;
	FireMode modes[]; //Maybe should be a bitmask?
	//ArrayList<WeaponMod> mods;

	public RangedWeapon(String namestr, int accuracy, int damage, int armorPierce, FireMode fireModes[], int recoilComp, int availability, boolean r, boolean f, int price, String description) {
		super(namestr, 0, availability, r, f, price, description);
		// TODO Auto-generated constructor stub
		acc = accuracy;
		dam = damage;
		ap = armorPierce;
		rc = recoilComp;
		modes = fireModes;
	}
	
	//TODO getters and setters

}
