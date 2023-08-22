

fun main() {
    while(true) {
        //get two numbers from the user
        print("Please enter the first number: ")
        val numOne = readLine()
        if(numOne.isNullOrBlank()){
            println("Error: Please enter a numerical value")
            continue
        }

        print("Please enter the second number: ")
        val numTwo = readLine()

        if(!numOne.isNullOrBlank() && !numTwo.isNullOrBlank()){
            if(isNumeric(numOne) && isNumeric(numTwo))
                printPower(numOne.toInt(), numTwo.toInt())
            else
                println("Error: Please enter only numerical values")
        }
        else{
            println("Error: Please enter exactly two numerical values.")
        }


    }
}

fun printPower(numOne: Int, numTwo: Int) {
    println("input was valid, todo, calculate powers")
}


fun isNumeric(toCheck: String): Boolean {
    val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
    return toCheck.matches(regex)
}