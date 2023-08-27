package aux3.social

import aux3.user.IUser

trait ISocialY {

    def login(username: String, password: String): Option[IUser]

    def register(username: String, password: String): Option[IUser]

}