package valorantWordGame;

public class Player2 extends Player1 {

    private int health;
    private boolean armour;


    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    public Player2(String name, String weapon, int health) {
        super(name, weapon, health);

    }

    public boolean inArmour() {
        return armour;
    }

    public void setArmour(boolean armour) {
        this.armour = armour;
    }


    @Override
    public void damageByGun1() {
        if (armour) {
            this.health -= 30;
            if (this.health <= 0) {
                System.out.println("Armour is on, got hit by Vandal, health is reduced by 30, now your health is" + this.health);
            }
        }
        if (!armour) {
            this.health -= 39;
            if (this.health <= 0) {
                System.out.println("Armour is off, got hit by Vandal, health is reduced by 40, now your health is" + this.health);
            }
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void damageByGun2() {
        if (armour) {
            this.health -= 30;
            if (this.health <= 0) {
                System.out.println("Armour is on, got hit by Phantom, health is reduced by 29, now your health is" + this.health);
            }
        }
        if (!armour) {
            this.health -= 39;
            if (this.health <= 0) {
                System.out.println("Armour is off, got hit by Phantom, health is reduced by 39, now your health is" + this.health);
            }
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void damageByGun1Crit() {
        if (armour) {
            this.health -= 140;
            if (this.health <= 0) {
                System.out.println("Armour is on, got hit by Phantom Headshot, health is reduced by 150, now your health is" + this.health);
            }
        }
        if (!armour) {
            this.health -= 124;
            if (this.health <= 0) {
                System.out.println("Armour is off, got hit by Phantom Headshot, health is reduced by 140, now your health is" + this.health);
            }
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void damageByGun2Crit() {
        if (armour) {
            this.health -= 150;
            if (this.health <= 0) {
                System.out.println("Armour is on, got hit by Vandal Headshot, health is reduced by 150, now your health is" + this.health);
            }
        }
        if (!armour) {
            this.health -= 160;
            if (this.health <= 0) {
                System.out.println("Armour is off, got hit by Vandal Headshot, health is reduced by 160, now your health is" + this.health);
            }
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }



    @Override
    public void heal() {
        super.heal();
    }




}