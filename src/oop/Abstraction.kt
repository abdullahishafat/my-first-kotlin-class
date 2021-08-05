package oop

fun main(args: Array<String>) {
    var xyz = Mysecond("king", "king@gmail")
    println(xyz.name)
    xyz.acc_balance_checker()
    xyz.age_checker()
}
abstract class Myfirst(open var name:String, open var email:String){
    abstract fun age_checker()
    abstract fun acc_balance_checker()
}

class Mysecond(override var name: String, override var email: String):Myfirst(name, email){
    override fun age_checker() {
        println("Yeah, I can check the age")
    }
    override fun acc_balance_checker(){
        println("Yeah, I can check the balance")
    }
}