package objects.magic.spells.combat;

import enums.DamageType;
import enums.ElementalDamageType;
import enums.magic.spells.SpellDuration;
import enums.magic.spells.SpellRange;
import enums.magic.spells.SpellType;
import objects.magic.spells.CombatIndirectSpell;

public class AcidStream extends CombatIndirectSpell {
	public AcidStream() {
		name = "Acid Stream";
		type = SpellType.PHYSICAL;
		range = SpellRange.LOS;
		duration = SpellDuration.INSTANTANEOUS;
		isArea = false;
		drainModifier = -3;
		description = "These spells create a powerful corrosive that sprays "+
				"the target, causing terrible burns and eating away "+
				"organic and metallic material—treat it as Acid damage "+
				"(p. 170), with appropriate effects on the affected area "+
				"and any objects therein. The acid quickly evaporates, "+
				"but the damage it inflicts remains. Acid Stream is a "+
				"single-target spell, Toxic Wave is an area spell. ";

		damageType = DamageType.PHYSICAL;
		elementalDamageType = ElementalDamageType.ACID;
	}
}
