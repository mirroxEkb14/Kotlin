package Introduction.PracticalTask.Project.model.monarchy

/**
 * All high society is nobles, so this is abstract and
 * all the monarchy will be inherited from this class
 *
 * Has fields that every monarch has: intellect and power
 * (values equals to 10 by default, 'var' because can be changed)
 */

abstract class Noble(val name: String) {
    var intellect: Float = 10f
    var force: Float = 10f
}
