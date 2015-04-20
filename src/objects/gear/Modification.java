/*
 * Author: jpmesser
 * Purpose: Holds data required for a Modification to a Augmentation
 * Bugs: not syncing   
 */
package objects.gear;

import enums.Augments.Attribute;

public class Modification extends Gear{
	//String modStat;
	//Stores the target Attribute for the Modification
	Attribute modAttri;
	//Stores the Amount that the Attribute is changed by the Modification
	int modStatAmnt;
	//Stores the Amount of Capacity that the Modification takes up
	int modSize;
	
	public Modification(String namestr, int availability, int rating, boolean r, boolean f, int price, String description, Attribute modAttriIn,  int modStatAmntIn,int modSizeIn){
		super(namestr, rating, availability, r, f, price, description);
		modAttri = modAttriIn;
		modStatAmnt = modStatAmntIn;
		modSize = modSizeIn;
	}
	public Modification(String namestr, int rating, int availability, boolean r, boolean f, int price, String description){
		super(namestr, rating, availability, r, f, price, description);
		modAttri = Attribute.NONE;
		modStatAmnt = 0;
		modSize = 0;
	}
	//Getters and Setters
	/*	
	public String getModStat() {
		return modStat;
	}
	
	public void setModStat(String modStat) {
		this.modStat = modStat;
	}
	*/
	public Attribute getModAttri() {
		return modAttri;
	}
	public void setModAttri(Attribute modAttri) {
		this.modAttri = modAttri;
	}
	public int getModStatAmnt() {
		return modStatAmnt;
	}
	public void setModStatAmnt(int modStatAmnt) {
		this.modStatAmnt = modStatAmnt;
	}
	public int getModSize() {
		return modSize;
	}
	public void setModSize(int modSize) {
		this.modSize = modSize;
	}
}
