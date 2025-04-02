package section08;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
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
