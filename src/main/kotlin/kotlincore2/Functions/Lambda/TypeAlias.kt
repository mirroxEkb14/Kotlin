package Introduction.Functions.Lambda

/**
 * In all our classes we need to pass 'authToken' field that is a 'String'
 * Using 'typealias' allows to have much more meaning inside the application
 */

typealias AuthToken = String

fun main() {
    val user = User("Donn", "S505OAM")

    Order(user.authToken)
    Order("my-auth-token")
}

data class User(val username: String, val authToken: AuthToken)

data class Account(val authToken: AuthToken)

data class Order(val authToken: AuthToken)

//data class User(val username: String, val authToken: String)
//
//data class Account(val authToken: String)
//
//data class Order(val authToken: String)