package Lab4.exercise2;

import java.util.Random;

public class Character {
    private int hp;
    private int attack;
    private Weapon[] items = new Weapon[2];
    private int weaponNum = 1;

    public Character() { // Default constructor not needed

    }

    public Character(int hp, int att) { // Two argument constructor
        this.hp = hp;
        this.attack = att;
    }

    public void addWeapon(Weapon wp) { // Add weapon to items
        if (this.getWeapon() != 3) {
            this.items[weaponNum - 1] = wp;
            weaponNum++;
        }

    }

    public void removeWeapon(int position) { // Remove weapon in position
        Weapon[] newArray = new Weapon[1];
        for (int i = 0, k = 0; i < this.items.length; i++) {
            if (i == position) {
                continue;
            }
            newArray[k++] = this.items[i];
        }
        this.items = newArray;
        this.weaponNum--;
    }

    public int getWeapon() {
        return this.weaponNum;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int damage) {
        this.hp -= damage;
    }

    public int getAttack() {
        Random Random = new Random();
        int randomDmg = Random.nextInt(this.getWeapon());

        if (randomDmg == 0)
            return this.attack;

        else if (randomDmg == 1) {
            this.items[0].setUsed();
            int damage = this.items[0].getDamg();
            if (this.items[0].getUsed() == this.items[0].getDur())
                this.removeWeapon(0);
            return damage;
        }

        else {
            this.items[1].setUsed();

            int damage = this.items[1].getDamg();
            if (this.items[1].getUsed() == this.items[1].getDur())
                this.removeWeapon(1);
            return damage;
        }
    }

}
