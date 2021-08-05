package oop

fun main(args: Array<String>) {
    var teacher= Mwalimu("king","king012")
}

open class Mwanafunzi(open var email:String, open var password:String){
    fun register(){
        println("Yeah, I can register")

    }
    fun login(){
        println("Yeah, I can login")
    }
}
class Mwalimu(override var email: String, override var password: String):Mwanafunzi(email, password){

    fun add_marks(){
        println("Yeah, I can add marks")
    }
}

