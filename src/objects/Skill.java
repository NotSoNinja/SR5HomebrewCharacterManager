package objects;

import java.util.ArrayList;

import enums.SkillGroup;

public class Skill {
	boolean def;
	SkillGroup group;
	String specializations[];
	String nme, desc;
	int rating, length;
	public Skill(String name, boolean defaul, SkillGroup grp, ArrayList<String>specs, String description, int arrayLength){
		nme = name;
		def = defaul;
		group = grp;
		specializations = new String[arrayLength];
		length = arrayLength;
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
	public String[] getSpecializations() {
		return specializations;
	}
	/**
	 * @param specializations the specializations to set
	 */
	public void addSpecialization(String specialization) {
		
	}
	/**
	 * 
	 * @see java.util.ArrayList#clear()
	 */
	public void clearSpecs() {
		specializations = new String[length];
	}
	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#contains(java.lang.Object)
	 */
	public boolean specsContains(Object o) {
		for(int i = 0; i < specializations.length; i++){
			if(specializations[i] == o){
				return true;
			}
		}
		return false;
	}
	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#indexOf(java.lang.Object)
	 */
	public int indexOfSpecialization(Object o) {
		for(int i = 0; i < specializations.length; i++){
			if(specializations[i] == o){
				return i;
			}
		}
		return -1;
	}
	/**
	 * @return
	 * @see java.util.ArrayList#isEmpty()
	 */
	public boolean noSpecializations() {
		if(specializations[0] == null){
			return true;
		}
		return false;
	}
	/**
	 * @param index
	 * @return
	 * @see java.util.ArrayList#remove(int)
	 */
	public String removeSpecialization(int index) {
		String temp = specializations[index];
		specializations[index] = null;
		for(int i = index + 1; i < specializations.length; i++){
			if(specializations[i] != null){
				specializations[i - 1] = specializations[i];
				specializations[i] = null;
			}else{
				break;
			}
		}
		return temp;
	}
	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	public boolean removeSpecialization(Object o) {
		String temp = null;
		int index;
		for(index = 0; index < specializations.length; index++){
			if(specializations[index] == o){
				temp = specializations[index];
				break;
			}
		}
		for(int i = index + 1; i < specializations.length; i++){
			if(specializations[i] != null){
				specializations[i - 1] = specializations[i];
				specializations[i] = null;
			}else{
				break;
			}
		}
		return temp != null;
	}
	/**
	 * @return
	 * @see java.util.ArrayList#size()
	 */
	public int sizeOfSpecializations() {
		return specializations.length;
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
