package mkr_2;

// Абстрактний клас Character є базовим для всіх типів персонажів у грі.
public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y;

    public Character(String name, int health, int attackPower, int x, int y) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }

    public abstract void displayInfo();

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getAttackPower() { return attackPower; }
    public int getX() { return x; }
    public int getY() { return y; }
}
