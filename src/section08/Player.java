package section08;

/**
 * To create an encapsulated class, you want to:
 * Create constructor for object initialization, which enforces that only objects with valid data will get created.
 * Use the private access modifier for your fields.
 * Use setter methods sparingly and only as needed.
 * Use access modifiers that aren't private, only fot the methods that the calling code needs to use.
 */
public class Player {
    private String name;
    private int health;
    private String weapon;

    public Player(String name) {
        this(name, 100, "Sword");
    }

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health <= 0 ? 1 : Math.min(health, 100);
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println("Player knocked out of game.");
        }
    }

    public void getHealth(int damage) {
        this.health -= damage;
        System.out.println("Health reduced to " + this.health);
    }

    public void restoreHealth(int extraHealth) {
        this.health += extraHealth;
        if (this.health > 100) {
            this.health = 100;
            System.out.println("Player's health fully restored.");
        }

        System.out.println("Health restored" + this.health);
    }

    public int healthRemaining() {
        return this.health;
    }
}
