package src.objects.gear;

public class Augmentation extends Gear {
	int cap;
	float essenc;
	//Something that holds Mods?
	Modification modArray[];

	public Augmentation(String namestr, int rating, float essence, int capacity, int availability, boolean r, boolean f, int price, String description,Modification modArrayIn[]) {
		super(namestr, rating, availability, r, f, price, description);
		cap = capacity;
		essenc = essence;
		//Something that holds Mods?
		modArray = modArrayIn;
	}
	public Augmentation(String namestr, int rating, float essence, int capacity, int availability, boolean r, boolean f, int price, String description) {
		super(namestr, rating, availability, r, f, price, description);
		cap = capacity;
		essenc = essence;
		//Something that holds Mods?
		modArray = new Modification[capacity];
	}
	
	//Methods
	private boolean checkModifications(){
		if(modCapacityTotal()>cap){
			return false;
		}
		else{
			return true;
		}
	}
	public int modCapacityTotal(){
		int modTotal = 0;
		for(Modification i:modArray){
			modTotal += i.getModSize();
		}
		return modTotal;
	}
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
	
	public boolean getValidAug(){
		return validAug;
	}
}
