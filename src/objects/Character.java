package objects;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import objects.gear.Augmentation;
import objects.gear.Gear;
import objects.gear.MeleeWeapon;
import objects.gear.RangedWeapon;
import enums.Lifestyle;
import enums.Metatype;

public class Character {
	//Non-shadowrun variables
	File saveLoc;
	
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
	protected KnowledgeSkill knowledges[];

	//ID's
	protected Identity ids[];

	//Condition
	int physDamage, stunDamage, overflow;

	//Qualities
	protected Quality qualities[];

	//Contacts
	protected Contact contacts[];

	//Ranged Weapons
	protected RangedWeapon rangedWeapons[];

	//Melee Weapons
	protected MeleeWeapon meleeWeapons[];

	//Armor
	protected Gear armorList[];

	//Augmentations
	protected Augmentation augs[];

	//Gear
	protected Gear gearList[];

	//Rig/Deck
	protected Gear commlinks[];

	//Vehicle
	protected Vehicle vehicles[];

	//Spells, etc.
	//TODO ArrayList of MagicObject
	//TODO find someone who wants to implement this

	//Adept Powers
	//TODO ArrayList of Ability objects
	//TODO find someone who wants to implement this

	public Character(String namestr, int startkarma, int startessence, int arrayLength){
		//TODO An actual constructor
		player = namestr;
		karma = totalKarma = startkarma; //default starting value is 25
		essence = startessence; //Default starting value is 6
		//TODO Skill array initializer
		skills = new Skill[arrayLength];
		knowledges = new KnowledgeSkill[arrayLength];
		ids = new Identity[arrayLength];
		qualities = new Quality[arrayLength];
		contacts = new Contact[arrayLength];
		rangedWeapons = new RangedWeapon[arrayLength];
		meleeWeapons = new MeleeWeapon[arrayLength];
		armorList = new Gear[arrayLength];
		augs = new Augmentation[arrayLength];
		gearList = new Gear[arrayLength];
		commlinks = new Gear[arrayLength];
		vehicles = new Vehicle[arrayLength];
		saveLoc = null;
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
	public void setName(String name, File overrideSaveLocation) {
		this.name = name;
		if(overrideSaveLocation == null){
			saveLoc = new File(name + ".json");
		}
	}

	/**
	 * @return the ethnicity
	 */
	public String getEthnicity() {
		return ethnicity;
	}

	/**
	 * @param ethnicity the ethnicity to set
	 */
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * @return the player
	 */
	public String getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(String player) {
		this.player = player;
	}

	/**
	 * @return the type
	 */
	public Metatype getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Metatype type) {
		this.type = type;
	}

	/**
	 * @return the stdOfLiving
	 */
	public Lifestyle getStdOfLiving() {
		return StdOfLiving;
	}

	/**
	 * @param stdOfLiving the stdOfLiving to set
	 */
	public void setStdOfLiving(Lifestyle stdOfLiving) {
		StdOfLiving = stdOfLiving;
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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the streetCred
	 */
	public int getStreetCred() {
		return streetCred;
	}

	/**
	 * @param streetCred the streetCred to set
	 */
	public void setStreetCred(int streetCred) {
		this.streetCred = streetCred;
	}

	/**
	 * @return the notariety
	 */
	public int getNotariety() {
		return notariety;
	}

	/**
	 * @param notariety the notariety to set
	 */
	public void setNotariety(int notariety) {
		this.notariety = notariety;
	}

	/**
	 * @return the awareness
	 */
	public int getAwareness() {
		return awareness;
	}

	/**
	 * @param awareness the awareness to set
	 */
	public void setAwareness(int awareness) {
		this.awareness = awareness;
	}

	/**
	 * @return the karma
	 */
	public int getKarma() {
		return karma;
	}

	/**
	 * @param karma the karma to set
	 */
	public void setKarma(int karma) {
		this.karma = karma;
	}

	/**
	 * @return the totalKarma
	 */
	public int getTotalKarma() {
		return totalKarma;
	}

	/**
	 * @param totalKarma the totalKarma to set
	 */
	public void setTotalKarma(int totalKarma) {
		this.totalKarma = totalKarma;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * @return the bdy
	 */
	public int getBdy() {
		return bdy;
	}

	/**
	 * @param bdy the bdy to set
	 */
	public void setBdy(int bdy) {
		this.bdy = bdy;
	}

	/**
	 * @return the agi
	 */
	public int getAgi() {
		return agi;
	}

	/**
	 * @param agi the agi to set
	 */
	public void setAgi(int agi) {
		this.agi = agi;
	}

	/**
	 * @return the reaction
	 */
	public int getRea() {
		return rea;
	}

	/**
	 * @param rea the rea to set
	 */
	public void setRea(int rea) {
		this.rea = rea;
	}

	/**
	 * @return the str
	 */
	public int getStr() {
		return str;
	}

	/**
	 * @param str the str to set
	 */
	public void setStr(int str) {
		this.str = str;
	}

	/**
	 * @return the wil
	 */
	public int getWil() {
		return wil;
	}

	/**
	 * @param wil the wil to set
	 */
	public void setWil(int wil) {
		this.wil = wil;
	}

	/**
	 * @return the log
	 */
	public int getLog() {
		return log;
	}

	/**
	 * @param log the log to set
	 */
	public void setLog(int log) {
		this.log = log;
	}

	/**
	 * @return the intu
	 */
	public int getIntu() {
		return intu;
	}

	/**
	 * @param intu the intu to set
	 */
	public void setIntu(int intu) {
		this.intu = intu;
	}

	/**
	 * @return the cha
	 */
	public int getCha() {
		return cha;
	}

	/**
	 * @param cha the cha to set
	 */
	public void setCha(int cha) {
		this.cha = cha;
	}

	/**
	 * @return the edge
	 */
	public int getEdge() {
		return edge;
	}

	/**
	 * @param edge the edge to set
	 */
	public void setEdge(int edge) {
		this.edge = edge;
	}

	/**
	 * @return the edgePoints
	 */
	public int getEdgePoints() {
		return edgePoints;
	}

	/**
	 * @param edgePoints the edgePoints to set
	 */
	public void setEdgePoints(int edgePoints) {
		this.edgePoints = edgePoints;
	}

	/**
	 * @return the essence
	 */
	public int getEssence() {
		return essence;
	}

	/**
	 * @param essence the essence to set
	 */
	public void setEssence(int essence) {
		this.essence = essence;
	}

	/**
	 * @return the magres
	 */
	public int getMagres() {
		return magres;
	}

	/**
	 * @param magres the magres to set
	 */
	public void setMagres(int magres) {
		this.magres = magres;
	}

	/**
	 * @return the initStd
	 */
	public int getInitStd() {
		return initStd;
	}

	/**
	 * @param initStd the initStd to set
	 */
	public void setInitStd(int initStd) {
		this.initStd = initStd;
	}

	/**
	 * @return the initMat
	 */
	public int getInitMat() {
		return initMat;
	}

	/**
	 * @param initMat the initMat to set
	 */
	public void setInitMat(int initMat) {
		this.initMat = initMat;
	}

	/**
	 * @return the initAst
	 */
	public int getInitAst() {
		return initAst;
	}

	/**
	 * @param initAst the initAst to set
	 */
	public void setInitAst(int initAst) {
		this.initAst = initAst;
	}

	/**
	 * @return the composure
	 */
	public int getComposure() {
		return composure;
	}

	/**
	 * @param composure the composure to set
	 */
	public void setComposure(int composure) {
		this.composure = composure;
	}

	/**
	 * @return the judgeIntentions
	 */
	public int getJudgeIntentions() {
		return judgeIntentions;
	}

	/**
	 * @param judgeIntentions the judgeIntentions to set
	 */
	public void setJudgeIntentions(int judgeIntentions) {
		this.judgeIntentions = judgeIntentions;
	}

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}

	/**
	 * @return the lift
	 */
	public int getLift() {
		return lift;
	}

	/**
	 * @param lift the lift to set
	 */
	public void setLift(int lift) {
		this.lift = lift;
	}

	/**
	 * @return the movement
	 */
	public int getMovement() {
		return movement;
	}

	/**
	 * @param movement the movement to set
	 */
	public void setMovement(int movement) {
		this.movement = movement;
	}

	/**
	 * @return the physLimit
	 */
	public int getPhysLimit() {
		return physLimit;
	}

	/**
	 * @param physLimit the physLimit to set
	 */
	public void setPhysLimit(int physLimit) {
		this.physLimit = physLimit;
	}

	/**
	 * @return the mentLimit
	 */
	public int getMentLimit() {
		return mentLimit;
	}

	/**
	 * @param mentLimit the mentLimit to set
	 */
	public void setMentLimit(int mentLimit) {
		this.mentLimit = mentLimit;
	}

	/**
	 * @return the socLimit
	 */
	public int getSocLimit() {
		return socLimit;
	}

	/**
	 * @param socLimit the socLimit to set
	 */
	public void setSocLimit(int socLimit) {
		this.socLimit = socLimit;
	}

	/**
	 * @return the skills
	 */
	public Skill[] getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}

	/**
	 * @return the physDamage
	 */
	public int getPhysDamage() {
		return physDamage;
	}

	/**
	 * @param physDamage the physDamage to set
	 */
	public void setPhysDamage(int physDamage) {
		this.physDamage = physDamage;
	}

	/**
	 * @return the stunDamage
	 */
	public int getStunDamage() {
		return stunDamage;
	}

	/**
	 * @param stunDamage the stunDamage to set
	 */
	public void setStunDamage(int stunDamage) {
		this.stunDamage = stunDamage;
	}

	/**
	 * @return the overflow
	 */
	public int getOverflow() {
		return overflow;
	}

	/**
	 * @param overflow the overflow to set
	 */
	public void setOverflow(int overflow) {
		this.overflow = overflow;
	}

	/**
	 * Writes a string to a file
	 * @param json the string
	 * @param fi the file
	 * @return
	 */
	public boolean writeCharacterToFile(File fi) {
		if(fi == null){
			fi = new File("UnnamedCharacter.json");
		}
		Gson converter = new Gson();
		String json = converter.toJson(this);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fi));
			out.write(json, 0, json.length());
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}

}
