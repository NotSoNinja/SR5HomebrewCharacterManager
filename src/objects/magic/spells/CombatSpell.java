package objects.magic.spells;

import enums.DamageType;
import enums.ElementalDamageType;

public abstract class CombatSpell extends Spell {
	//Technically, combat spells have 3 keywords: direct/indirect, elemental, and/or area. 
	//We're representing direct through different classes, elemental through the enum, and area through a boolean.
	protected DamageType damageType;
	protected ElementalDamageType elementalDamageType; 
}
