package objects;

import enums.Lifestyle;

public class Identity {
	String name, licenses;
	Lifestyle stdOfLiving;
	int nuyen;
	
	public Identity(String nameStr, Lifestyle sty, int cash){
		name = nameStr;
		stdOfLiving = sty;
		nuyen = cash;
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
	 * @return the licenses
	 */
	public String getLicenses() {
		return licenses;
	}

	/**
	 * @param licenses the licenses to set
	 */
	public void setLicenses(String licenses) {
		this.licenses = licenses;
	}

	/**
	 * @return the stdOfLiving
	 */
	public Lifestyle getStdOfLiving() {
		return stdOfLiving;
	}

	/**
	 * @param stdOfLiving the stdOfLiving to set
	 */
	public void setStdOfLiving(Lifestyle stdOfLiving) {
		this.stdOfLiving = stdOfLiving;
	}

	/**
	 * @return the nuyen
	 */
	public int getNuyen() {
		return nuyen;
	}

	/**
	 * @param nuyen the nuyen to set
	 */
	public void setNuyen(int nuyen) {
		this.nuyen = nuyen;
	}
	
	//TODO getters and setters

}
