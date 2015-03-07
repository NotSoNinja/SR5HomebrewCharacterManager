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
	
	//TODO Getters and Setters (if necessary...)
	
}
