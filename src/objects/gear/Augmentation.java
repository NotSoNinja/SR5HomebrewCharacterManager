/*
 * Author: NotSoNinja & jpmesser
 * Purpose: Holds data required for Cyberwear/Biowear Augmentations to a character
 * Bugs: not syncing
 * Plans: Body parts into total body (a class above). Plug strings out into the Creator. 
 */
package objects.gear;

import enums.Augments.*;

public class Augmentation extends Gear {
	//Stores the capacity of the Augment
	int cap;
	//Stores the req
	float essenc;
	//Stores the state of the Augmentation (working or not)
	boolean validAug;
	//Stores the Modifications located in the Augmentation
	Modification modArray[];
	//Stores the augmentation grade
	AugGrade grade;
	//Stores the body part the augment is located in
	Body location;
	
	public Augmentation(String namestr, int rating, float essence, int capacity, int availability, boolean r, boolean f, int price, String description,Modification modArrayIn[],AugGrade gradeIn,Body locIn) {
		super(namestr, rating, availability, r, f, price, description);
		cap = capacity;
		essenc = essence;
		modArray = modArrayIn;
		grade = gradeIn;
		location = locIn;
		validateAug();
	}
	public Augmentation(String namestr, int rating, float essence, int capacity, int availability, boolean r, boolean f, int price, String description,AugGrade gradeIn, Body locIn) {
		super(namestr, rating, availability, r, f, price, description);
		cap = capacity;
		essenc = essence;
		grade = gradeIn;
		location = locIn;
		modArray = new Modification[capacity];
		validateAug();
	}
	
	//Methods
	//Checks if the Modifications contained in modArray exceed the Capacity for the Augment
	private boolean checkModifications(){
		if(modCapacityTotal()>cap){
			return false;
		}
		else{
			return true;
		}
	}
	//Sums the required capacity of each of the Modifications contained in modArray and returns the total
	public int modCapacityTotal(){
		int modTotal = 0;
		for(Modification i:modArray){
			modTotal += i.getModSize();
		}
		return modTotal;
	}
	//Checks to see if the Augment is valid and returns a String. As part of validation validAug will be set
	public String validateAug(){
		validAug = checkModifications();
		String out;
		if(validAug){
			out = "Augmentation accepted. ";
		}
		else{
			out = "Augmentation denied (modifications exceed Augmentation capacity).";
		}
		out += "Modification Total: " + modCapacityTotal() + " out of " + getCap();
		return out;
	}
	//Getters and Setters
	public Modification[] getModArray() {
		return modArray;
	}

	public void setModArray(Modification[] modArray) {
		this.modArray = modArray;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public float getEssenc() {
		return essenc;
	}

	public void setEssenc(float essenc) {
		this.essenc = essenc;
	}
	
	public AugGrade getAugGrade() {
		return grade;
	}
	public void setGrade(AugGrade grade) {
		this.grade = grade;
	}
	public Body getLocation() {
		return location;
	}
	public void setLocation(Body location) {
		this.location = location;
	}
	public boolean getValidAug(){
		return validAug;
	}
}
