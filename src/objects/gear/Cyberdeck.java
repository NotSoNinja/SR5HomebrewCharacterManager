package objects.gear;

public class Cyberdeck extends Gear {
	int attribs[] = {0,0,0,0};
	int maxprogs;
	//TODO something to hold installed programs
	//TODO figure if we use these for RCC's or not...

	public Cyberdeck(String namestr, int rating, int attributes[], int programs, int availability, boolean r, boolean f, int price, String description) {
		super(namestr, rating, availability, r, f, price, description);
		attribs = attributes;
		maxprogs = programs;
	}
	/**
	 * get the attack value
	 * @return the attack value
	 */
	int getAttack(){
		return attribs[0];
	}
	/**
	 * set the attack value
	 * @param i the new attack value
	 */
	void setAttack(int i){
		attribs[0] = i;
	}
	/**
	 * get the sleaze attribute
	 * @return the sleaze attribute
	 */
	int getSleaze(){
		return attribs[1];
	}
	/**
	 * set the sleaze attribute
	 * @param i the sleaze attribute
	 */
	void setSleaze(int i){
		attribs[1] = i;
	}
	/**
	 * get the data processing rating
	 * @return the data processing rating
	 */
	int getDP(){
		return attribs[2];
	}
	/**
	 * set the data processing rating
	 * @param i the data processing rating
	 */
	void setDP(int i){
		attribs[2] = i;
	}
	/**
	 * get the firewall value
	 * @return the firewall value
	 */
	int getFirewall(){
		return attribs[3];
	}
	/**
	 * set the firewall value
	 * @param i the firewall value
	 */
	void setFirewall(int i){
		attribs[3] = i;
	}
	/**
	 * get the maximum number of programs the deck can have
	 * @return the maximum number of programs the deck can have
	 */
	int getMaxPrograms(){
		return maxprogs;
	}
	/**
	 * set the maximum number of programs the deck can have
	 * @param i the maximum number of programs the deck can have
	 */
	void setMaxPrograms(int i){
		maxprogs = i;
	}
}
