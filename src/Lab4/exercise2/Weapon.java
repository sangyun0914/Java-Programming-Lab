package Lab4.exercise2;

public class Weapon {
    private int damage;
    private int durability;
    private int usedTimes = 0;

    public Weapon(int damg, int dur) {
        this.damage = damg;
        this.durability = dur;
    }

    public void setUsed() {
        this.usedTimes++;
    }

    public int getDamg() {
        return this.damage;
    }

    public int getDur() {
        return this.durability;
    }

    public int getUsed() {
        return this.usedTimes;
    }

}
