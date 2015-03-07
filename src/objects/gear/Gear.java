package objects.gear;

public class Gear {
	String name, desc;
	int grade, avail, cost;  //grade = rating
	boolean restricted, forbidden;
	
	public Gear(String namestr, int rating, int availability, boolean r, boolean f, int price, String description){
		name = namestr;
		grade = rating;
		avail = availability;
		restricted = r;
		forbidden = f;
		cost = price;
		desc = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the avail
	 */
	public int getAvail() {
		return avail;
	}

	/**
	 * @param avail the avail to set
	 */
	public void setAvail(int avail) {
		this.avail = avail;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return the restricted
	 */
	public boolean isRestricted() {
		return restricted;
	}

	/**
	 * @param restricted the restricted to set
	 */
	public void setRestricted(boolean restricted) {
		this.restricted = restricted;
	}

	/**
	 * @return the forbidden
	 */
	public boolean isForbidden() {
		return forbidden;
	}

	/**
	 * @param forbidden the forbidden to set
	 */
	public void setForbidden(boolean forbidden) {
		this.forbidden = forbidden;
	}

}
