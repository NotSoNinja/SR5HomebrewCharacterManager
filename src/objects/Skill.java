package objects;

import java.util.ArrayList;

import enums.SkillGroup;

public class Skill {
	boolean def;
	SkillGroup group;
	ArrayList<String> specializations;
	String nme, desc;
	int rating;
	public Skill(String name, boolean defaul, SkillGroup grp, ArrayList<String>specs, String description){
		nme = name;
		def = defaul;
		group = grp;
		specializations = specs;
		desc = description;
		if(defaul){
			rating = 2;
		}else{
			rating = 0;
		}
	}
	/**
	 * @return the def
	 */
	public boolean isDefault() {
		return def;
	}
	/**
	 * @param def is the skill default
	 */
	public void setDefault(boolean def) {
		this.def = def;
	}
	/**
	 * @return the group
	 */
	public SkillGroup getGroup() {
		return group;
	}
	/**
	 * @param group the group to set
	 */
	public void setGroup(SkillGroup group) {
		this.group = group;
	}
	/**
	 * @return the specializations
	 */
	public ArrayList<String> getSpecializations() {
		return specializations;
	}
	/**
	 * @param specializations the specializations to set
	 */
	public void addSpecializations(String specialization) {
		this.specializations.add(specialization);
	}
	/**
	 * 
	 * @see java.util.ArrayList#clear()
	 */
	public void clearSpecs() {
		specializations.clear();
	}
	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#contains(java.lang.Object)
	 */
	public boolean specsContains(Object o) {
		return specializations.contains(o);
	}
	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#indexOf(java.lang.Object)
	 */
	public int indexOfSpecialization(Object o) {
		return specializations.indexOf(o);
	}
	/**
	 * @return
	 * @see java.util.ArrayList#isEmpty()
	 */
	public boolean noSpecializations() {
		return specializations.isEmpty();
	}
	/**
	 * @param index
	 * @return
	 * @see java.util.ArrayList#remove(int)
	 */
	public String removeSpecialization(int index) {
		return specializations.remove(index);
	}
	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	public boolean removeSpecialization(Object o) {
		return specializations.remove(o);
	}
	/**
	 * @return
	 * @see java.util.ArrayList#size()
	 */
	public int sizeOfSpecializations() {
		return specializations.size();
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return nme;
	}
	/**
	 * @param nme the name to set
	 */
	public void setName(String nme) {
		this.nme = nme;
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
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	//TODO Getters and Setters (if necessary...)
	
}
