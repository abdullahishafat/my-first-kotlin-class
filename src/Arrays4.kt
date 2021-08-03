import java.util.*

fun main(args: Array<String>) {
    var scanner_yangu = Scanner(System.`in`)
    println("How many names do you have?")
    var number_of_names = scanner_yangu.nextInt()
    //Instantiate a string array that can accommodate
    //up to the number entered
    println("Enter the $number_of_names names")
    var names = arrayOfNulls<String>(number_of_names)


    //write a loop to take the names
    var position = 0
    while (position < number_of_names){
        names[position] = scanner_yangu.next()
        position++
    }
    for (jina in names){
        println(jina)
    }

    //Create a logic that will capture both the names and the
    //admission numbers of any number of students


}