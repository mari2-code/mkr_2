package mkr_2;

public class Main {
    public static void main(String[] args) {
        // Створення арени
        Arena arena = new Arena();

        // Створення персонажів за допомогою фабричного методу
        Character warrior = CharacterFactory.createCharacter("warrior", "Олег", 0, 0);
        Character mage = CharacterFactory.createCharacter("mage", "Андрій", 2, 3);
        Character archer = CharacterFactory.createCharacter("archer", "Марія", 5, 5);

        // Додавання персонажів на арену
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        // Виведення всіх персонажів на арені
        arena.showAllCharacters();
    }
}
