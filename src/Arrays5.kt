import java.util.*

fun main(args: Array<String>) {
    var test_yangu = Scanner(System.`in`)
    println("How many names do you have?")
    var number_of_names = test_yangu.nextInt()

    println("Enter the names with their corresponding ADM numbers")
    var names = arrayOfNulls<String>(number_of_names)
    var adm_numbers = arrayOfNulls<String>(number_of_names)

    //write a loop to take the names
    var position = 0
    while (position < number_of_names){
        names[position] = test_yangu.next()
        adm_numbers[position] = test_yangu.next()
        position++
    }
    var print_position = 0
    while (print_position < number_of_names){
        println("Name is "+names[print_position]+"____ADM No is "+ adm_numbers[print_position])
        print_position++
    }

}