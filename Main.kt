import kotlin.random.Random

fun main(args: Array<String>) {

    // Take the User Input
    println("Enter the name of your new character: ")
    val enterName = readLine()!!
    enterName.lowercase()

    println("Enter the race of your new character: ")
    val enterRace = readLine()!!
    val lowerCaseRace = enterRace.lowercase()   // Lowercase for easier processing on transform function Initialized on the interface but Implemented on the data class

    // Build the new character with the User entered data
    val newCharacter = CharactersDetailsDataClass(
        name = enterName,
        race = lowerCaseRace,
        power = Random.nextInt(1,10)    // Randomize the power level with the Random function
    )

    // Print the information about the newly created character
    println("Your new character is a ${newCharacter.race} named ${newCharacter.name} and its power level is ${newCharacter.power}")

    // Process the divine state of the character
    var divinePower = 0

    if(newCharacter.power <= 6){
        divinePower = 1
    }
    else if(newCharacter.power <= 9){
        divinePower = 2
    } else {
        divinePower = 3
    }

    // Print the divine state of the character
    println("With a power level of ${newCharacter.power} your character would be a ${when(divinePower){ 
        1 -> DivineStateEnumClass.MORTAL
        2 -> DivineStateEnumClass.GOD
        3 -> DivineStateEnumClass.ANGEL
        else -> println("Unknown")
    }}")

    // Ask the user whether he wants to transform (To use the functions from the interface)
    println("Would you like to transform?   yes/no")
    val transform = readLine()!!.lowercase()

    if (transform == "yes"){
        newCharacter.yell()         // call the function from the interface that is Initialized and Implemented inside the interface
        newCharacter.transform()    // call the function Initialized on the interface but Implemented (overwritten) in the data class
    } else if (transform == "no"){
        println("Later!")
    }
    else{
        println("Bye!")
    }
}