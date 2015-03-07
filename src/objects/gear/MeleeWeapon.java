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
	 * @return the rea
	 */
	public int getRea() {
		return rea;
	}

	/**
	 * @param rea the rea to set
	 */
	public void setRea(int rea) {
		this.rea = rea;
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
	
}
