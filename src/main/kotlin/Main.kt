fun main(args: Array<String>) {

    var userChoice = 0

    do {
        println("What would you like to eat?")
        println("1. Hamburger ")
        println("2. Cheeseburger")
        println("3. Veggieburger")
        println("4. Grilled Cheese ")
        println("5. Hotdog")
        println("6. French Fries")
        println("7. Exit")

        println("Enter the number of your choice: ")
        userChoice = readln()!!.toInt()

        if (userChoice > 7)
            println("out of bounds. Choose again.")
        else
            when (userChoice){
                1 -> println("You chose a Hamburger.\n")
                2 -> println("You chose a Cheeseburger.\n")
                3 -> println("You chose a Veggieburger. Good for you.\n")
                4 -> println("You chose a Grilled Cheese.\n")
                5 -> println("You chose a Hotdog.\n")
                6 -> println("You chose French Fries.\n")
                7 -> println("GoodBye\n")

            }


    } while (userChoice != 7)



}