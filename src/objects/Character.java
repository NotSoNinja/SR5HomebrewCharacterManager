package objects;

import java.util.ArrayList;

import objects.gear.Augmentation;
import objects.gear.Gear;
import objects.gear.MeleeWeapon;
import objects.gear.RangedWeapon;
import enums.Lifestyle;
import enums.Metatype;

public class Character {
	//Personal Data
	String name, ethnicity, sex, bio, player;
	Metatype type;
	Lifestyle StdOfLiving;
	int nuyen;
	int age, streetCred, notariety, awareness, karma, totalKarma;
	float height, weight; //in feet, lbs typically
	
	//Attributes
	int bdy, agi, rea, str, wil, log, intu, cha, edge;
	int edgePoints, essence, magres, initStd, initMat, initAst;
	int composure, judgeIntentions, memory, lift, movement;
	
	//Limits
	int physLimit, mentLimit, socLimit;
	
	//Skills
	Skill skills[]; //71? slots (maybe 70)
	
	//Knowledges
	ArrayList<KnowledgeSkill> knowledges;
	
	//ID's
	ArrayList<Identity> ids;
	
	//Condition
	int physDamage, stunDamage, overflow;
	
	//Qualities
	ArrayList<Quality> qualities;
	
	//Contacts
	ArrayList<Contact> contacts;
	
	//Ranged Weapons
	ArrayList<RangedWeapon> rangedWeapons;
	
	//Melee Weapons
	ArrayList<MeleeWeapon> meleeWeapons;
	
	//Armor
	ArrayList<Gear> armorList;
	
	//Augmentations
	ArrayList<Augmentation> Augs;
	
	//Gear
	ArrayList<Gear> gearList;
	
	//Rig/Deck
	ArrayList<Gear> commlinks;
	
	//Vehicle
	ArrayList<Vehicle> vehicles;
	
	//Spells, etc.
	//TODO ArrayList of MagicObject
	//TODO find someone who wants to implement this
	
	//Adept Powers
	//TODO ArrayList of Ability objects
	//TODO find someone who wants to implement this
	
	public Character(){
		//TODO An actual constructor
		
	}
	
	//TODO Getters and setters OUT THE WHAZOO
	
}
