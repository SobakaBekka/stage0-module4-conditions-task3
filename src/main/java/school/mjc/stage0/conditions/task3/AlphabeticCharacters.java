package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        if(!(String.valueOf(character).matches("A-Za-z"))){
            System.out.println("wrong alphabet!");
        }else{
            if(character == 'A' || character == 'a' || character == 'U' || character == 'u' || character == 'E'
            || character == 'e' || character == 'I' || character == 'i' || character == 'Y' || character == 'y'
            || character == 'O' || character == 'o'){
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        }

    }
}
