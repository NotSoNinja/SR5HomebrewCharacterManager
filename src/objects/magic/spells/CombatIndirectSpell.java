package objects.magic.spells;

/**
 * An indirect combat spell manifests as energy which crashes into the target. Usually violently.
 * Roll Spellcasting + Magic [Force] versus Reaction + Intuition, like normal weapons. 
 * Damage is resisted with Body + Armor, as usual. 
 * Damage value is Force + Net Hits, AP is just -Force. 
 * 
 * @author alexanderfreeman
 *
 */
public abstract class CombatIndirectSpell extends CombatSpell {

	public int getDamage(int force, int netHits) {
		return force + netHits;
	}
	public int getAP(int force) {
		return -1 * force;
	}
}
