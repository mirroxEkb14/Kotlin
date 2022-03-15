package Introduction.PracticalTask.SkillFactoryEdition.model

import Introduction.PracticalTask.SkillFactoryEdition.service.WheelOfFortune

/**
 * This is an heir of the king('Ruler' class). Contains same fields but
 * the values of 'intellect' and 'power' fields are set randomly
 */

class Heir(name: String, wheelOfFortune: WheelOfFortune) : Ruler(name) {
    init {
        intellect *= wheelOfFortune.coefficient()
        power *= wheelOfFortune.coefficient()
    }
}