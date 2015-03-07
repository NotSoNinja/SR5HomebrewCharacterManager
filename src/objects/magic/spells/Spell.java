package objects.magic.spells;

import enums.magic.spells.SpellDuration;
import enums.magic.spells.SpellRange;
import enums.magic.spells.SpellType;

public abstract class Spell {
	String name, description;
	SpellType type;
	SpellRange range;
	SpellDuration duration;
	boolean isArea;
	int drainModifier; //The amount of drain added to the force value. Usually negative.
	
	/**
	 * Computes the amount of drain a spell creates. 
	 * Note that the minimum amount of drain is always 2. 
	 * 
	 * @param force, the amount of force used to cast the spell. 
	 * @return the amount of drain to resist. 
	 */
	public int getDrain (int force) {
		return force + drainModifier > 2 ? force + drainModifier : 2;
	}
}
