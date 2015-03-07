package objects.magic.spells;

/**
 * A direct spell is one which manifests directly in its targets. 
 * Make a Spellcasting + Magic [Force] roll against the target's Body (for physical) or Willpower (for mana spell). 
 * Net hits is damage. There is no roll to resist this damage, therefore no AP method. 
 * 
 * @author alexanderfreeman
 *
 */
public abstract class CombatDirectSpell extends CombatSpell {
	
	public int getDamage(int netHits) {
		return netHits; //Damage for direct spells is really simple!
	}
}
