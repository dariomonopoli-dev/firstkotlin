import java.util.*

const val PI = 3.1416 //This is a global constant (known before code execution), val would not work here.
fun main(args: Array<String>) {
    println("Hello World!")
    //This is a comment

    /* This is a
    multiline comment
     */
    //Explicit types
    var name: String = "Dario"
    var age: Int = 20
    var pi: Any = 3.1416 //"Any" is a generic type, but it is not recommended to use it, here it is just for example, and it would be better to use "Double" instead of "Any"
    print("Hello, I am $name and I am $age years old\n")
    println("Pi: $pi")

    //Implicit types
    var name2 = "Dario"
    var age2 = 20
    var pi2 = 3.1416
    print("Hello, I am $name2 and I am $age2 years old\n")
    println("Pi: $pi2")

    val name3 = "Dario" //val is a constant (final in Java), it's value cannot be changed.
    println(name3.uppercase())
    println(name3.lowercase())
    println(name3[0])

    //String comparison
    val name4 = "Dario"
    val name5 = "dario"
    println(name4 == name5) //false
    println(name4.equals(name5, ignoreCase = true)) //true


    //Data type conversion
    val age3 = 20
    val age4 = "20"
    println(age3.toString() + age4) //2020

    val age5 = 20
    val age6 = "20"
    println(age5 + age6.toInt()) //40

    val input = "M"
    val gender = when(input.uppercase(Locale.getDefault())) {
        "M" -> "Male"
        "F" -> "Female"

        else -> {
            "Unknown Gender"
        }
    }

    println(gender)



}