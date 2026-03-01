package ProjectOfCoreJava.Core;

public enum Genre {
    FICTION("fictional Story"),
    NON_FICTION("non-fictional story"),
    SCIENCE("Scientific content"),
    HISTORY("Historical events"),
    TECHNOLOGY("Technology related ");


    private final String description;
    Genre(String descrption) {

        this.description = descrption;
    }
    public String getDescription(){
        return description;
    }
    public static Genre validateGenre(String name) throws InvalidGenreException{
        try{
            return Genre.valueOf(name.toUpperCase());
        }catch (IllegalArgumentException e){
            throw new InvalidGenreException("Invalid Genre"+name+"Valid genres : FICTION , NON_FICTION , SCIENCE , HISTORY,TECHNOLOGY");
        }
    }
}
