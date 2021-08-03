fun main(args: Array<String>) {
    motto()
    mission()
    avg(1515,52.8934,6473.434f)
    rectangle_area(7.0, 10.0)
    cylinder_volume("king", 200.0, 450.0)
}

fun motto() {
    println("Hey, this is our motto")
}

fun mission() {
    println("hey, this is our mission")
}

fun avg(x:Int, y:Double, z:Float){
    var average = (x + y + z)/3.0
    println("Your average is $average")
}

fun rectangle_area(l:Double, w:Double){
    var area = l * w
    println("Your area is $area")
}

fun cylinder_volume(n:String, r:Double, h:Double){
    var volume = Math.PI * Math.pow(r,2.0) * h
    if (volume < 10000){
        println("hi, $n, your vole is $volume and this is a small cylinder")

    }else{
        println("hi, $n, your vole is $volume and this is a large cylinder")
    }
}