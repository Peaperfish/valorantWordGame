package valorantWordGame;

public class Player1 {


    // Attributes
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health < 0 || health > 100){
            this.health = 100;
        } else this.health = health;
    }


    // Method
    public void damageByGun1(){
        this.health -= 39;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by Phantom, Health is reduced by 39, your health is now: " + this.health);

            if(this.health == 0){
                System.out.println("You are dead" + this.name);
            }
    }


    public void damageByGun1Crit(){
        this.health -= 140;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by Phantom Headshot, Health is reduced by 140, your health is now: " + this.health);

            if(this.health == 0){
                System.out.println("You are dead" + this.name);
        }
    }


    public void damageByGun2(){
        this.health -= 40;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by Vandal, Health is reduced by 40, your health is now: " + this.health);

            if(this.health == 0){
                System.out.println("You are dead" + this.name);
        }
    }



    public void damageByGun2Crit(){
        this.health -= 140;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by Vandal Headshot, Health is reduced by 140, your health is now: " + this.health);

        if(this.health == 0){
            System.out.println("You are dead" + this.name);
        }
    }

    public void heal(){
        if (this.health <= 0){
            System.out.println("Player is dead, this not possible");
        }
        else {
            this.health = 150;
            System.out.println("Health is " + this.health);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
