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

	/**
	 * @return the acc
	 */
	public int getAcc() {
		return acc;
	}

	/**
	 * @param acc the acc to set
	 */
	public void setAcc(int acc) {
		this.acc = acc;
	}

	/**
	 * @return the dam
	 */
	public int getDam() {
		return dam;
	}

	/**
	 * @param dam the dam to set
	 */
	public void setDam(int dam) {
		this.dam = dam;
	}

	/**
	 * @return the ap
	 */
	public int getAp() {
		return ap;
	}

	/**
	 * @param ap the ap to set
	 */
	public void setAp(int ap) {
		this.ap = ap;
	}

	/**
	 * @return the rc
	 */
	public int getRc() {
		return rc;
	}

	/**
	 * @param rc the rc to set
	 */
	public void setRc(int rc) {
		this.rc = rc;
	}

	/**
	 * @return the modes
	 */
	public FireMode[] getModes() {
		return modes;
	}

	/**
	 * @param modes the modes to set
	 */
	public void setModes(FireMode[] modes) {
		this.modes = modes;
	}

}
