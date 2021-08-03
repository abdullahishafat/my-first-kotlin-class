fun main(args: Array<String>) {
    var names = arrayOf("King","Grace","Mariga","Issack","Ahmed","Abdull")
    for (x in names){
        println(x)
    }

    var ages = arrayOfNulls<Int>(5)
    ages[0]= 105
    ages[1]= 768
    ages[2]= 978
    ages[3]= 758
    ages[4]= 534
    for (mwaka in ages){
        println(mwaka)
    }

}