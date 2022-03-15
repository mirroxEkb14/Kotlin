package Introduction.Classes

fun main() {
    val shooter = Shooter(Pistol())
    shooter.shooterGun.shoot()
    shooter.shooterGun.reload()

    // Implement 'Gun' interface without creating a class('Pistol' class).
    // To use anonymous classes we write the 'object' keyword and put ':', after
    // write interface name and in '{}' override interface methods
    val bazookaShooter = Shooter(object : Gun {
        override fun shoot() {
            println("KABOOM")
        }

        override fun reload() {
            println("wank-wank")
        }
    })

    bazookaShooter.shooterGun.shoot()
    bazookaShooter.shooterGun.reload()

    // if to use abstract class instead of interface
    val abstractShooter = ShooterAbstract(object : GunAbstract("armor-piercing") {
        override fun shoot() {
            TODO("Not yet implemented")
        }

        override fun reload() {
            TODO("Not yet implemented")
        }
    })

    abstractShooter.shooterGun.shoot()
    abstractShooter.shooterGun.reload()
    abstractShooter.shooterGun.ammoType // armor-piercing
}

class Pistol : Gun {
    override fun shoot() {
        println("puff-puff")
    }

    override fun reload() {
        println("click-clack")
    }
}

class Shooter(var shooterGun: Gun)

interface Gun {
    fun shoot()
    fun reload()
}

class ShooterAbstract(var shooterGun: GunAbstract)

abstract class GunAbstract(val ammoType: String) {
    open fun shoot() {}
    open fun reload() {}
}