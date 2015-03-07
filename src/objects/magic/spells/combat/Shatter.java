package objects.magic.spells.combat;

import enums.DamageType;
import enums.ElementalDamageType;
import enums.magic.spells.SpellDuration;
import enums.magic.spells.SpellRange;
import enums.magic.spells.SpellType;
import objects.magic.spells.CombatDirectSpell;

public class Shatter extends CombatDirectSpell {
	public Shatter() {
		name = "Shatter";
		type = SpellType.PHYSICAL;
		range = SpellRange.TOUCH;
		duration = SpellDuration.INSTANTANEOUS;
		isArea = false;
		drainModifier = -6;
		description = "These spells channel destructive magical power" +
" into the targets causing Physical damage. The target" +
" is cooked from the inside, like magically microwaving" +
" a hot dog. As physical energies, they can affect both" +
" living and non-living targets and are resisted by the" +
" target’s Body. Shatter requires you to touch the target," +
" Powerbolt affects a single target, and Powerball is an" +
" area spell.";

		damageType = DamageType.PHYSICAL;
		elementalDamageType = ElementalDamageType.NONE;
	}
}
