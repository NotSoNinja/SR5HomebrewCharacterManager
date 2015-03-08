/**
 * 
 */
package objects.system;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import objects.Quality;
import objects.Skill;
import objects.Vehicle;
import objects.gear.Armor;
import objects.gear.Augmentation;
import objects.gear.Cyberdeck;
import objects.gear.Gear;
import objects.gear.MeleeWeapon;
import objects.gear.RangedWeapon;

import com.google.gson.Gson;

/**
 * A class to hold the reference files during execution
 * @author Johnathan
 *
 */
public class SR5Archive {
	File saveLoc;
	String name;
	int size;

	Skill skills[];
	protected Quality qualities[];
	protected Character characters[];
	protected RangedWeapon rangedWeapons[];
	protected MeleeWeapon meleeWeapons[];
	protected Armor armorList[];
	protected Augmentation augs[];
	protected Gear gearList[];
	protected Cyberdeck commlinks[];
	protected Vehicle vehicles[];

	//Spells, etc.
	//TODO Array of MagicObject
	//TODO find someone who wants to implement this

	//Adept Powers
	//TODO Array of Ability objects
	//TODO find someone who wants to implement this

	public SR5Archive(String name, int size){
		saveLoc = new File(name + ".saf");
		this.name = name;
		this.size = size;
		qualities = new Quality[size];
		characters = new Character[size];
		rangedWeapons = new RangedWeapon[size];
		meleeWeapons = new MeleeWeapon[size];
		armorList = new Armor[size];
		augs = new Augmentation[size];
		gearList = new Gear[size];
		commlinks = new Cyberdeck[size];
		vehicles = new Vehicle[size];
	}
	
	public boolean writeArchiveToFile(File fi) {
		if(fi == null){
			saveLoc = new File("UnnamedArchive.saf");
			fi = saveLoc;
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
