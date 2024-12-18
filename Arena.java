package mkr_2;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character.getName() + " додано до арени.");
    }

    public void showAllCharacters() {
        System.out.println("\nПерсонажі на арені:");
        for (Character c : characters) {
            c.displayInfo();
        }
    }
}
