data class CharactersDetailsDataClass(  // Each new instance of a Character must have these values...
    val name: String,
    val race: String,
    val power: Int
) : AttackInterface {   // Making this data class sign the contract with the interface to implement the function transform

    override fun transform() {      // The transformation will depend on the characters race just like in the show
        if(race.equals("saiyan")){
            println("Super Saiyan")
        }
        else if(race.equals("earthling")){
            println("Unable to transform")
        }
        else if(race.equals("namekian")){
            println("Orange $name")
        }
        else {
            print("Unknown warrior race")
        }
    }
}
