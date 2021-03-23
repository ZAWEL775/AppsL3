package sample;

public class Cast {

    /** Variables
     * */
    private static String CharacterName;
    private static String ActorName;
    private static String CharacterRole;
    private static String Nationality;

    /** Constructor
     * */
    public Cast(String characterName, String actorName, String characterRole, String nationality){
        this.CharacterName = characterName;
        this.ActorName = actorName;
        this.CharacterRole = characterRole;
        this.Nationality = nationality;
    }


    public static String getCharacterName() {
        return CharacterName;
    }

    public static void setCharacterName(String characterName) {
        CharacterName = characterName;
    }

    public static String getActorName() {
        return ActorName;
    }

    public static void setActorName(String actorName) {
        ActorName = actorName;
    }

    public static String getCharacterRole() {
        return CharacterRole;
    }

    public static void setCharacterRole(String characterRole) {
        CharacterRole = characterRole;
    }

    public static String getNationality() {
        return Nationality;
    }

    public static void setNationality(String nationality) {
        Nationality = nationality;
    }

    @Override
    public String toString(){
        // TODO Add toSting method for Cast object.
        return "";
    }



}
