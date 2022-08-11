public class Player {
    private String nameAndLastName;
    private int health;
    private String weapon;

    public Player(String fullName, int health, String weapon) {
        this.nameAndLastName = fullName;
        this.health = health;
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0){
            System.out.println("Game over");
        }
    }

//getter
    public int getHealth(){
        return this.health;
    }

//getter
    public String getName(){
        return this.nameAndLastName;
    }

    public void setHealth(int health){
        if(health>100){
            return;
        }else{
            this.health =health;
        }
        System.out.println("End of setter");
    }


    @Override
    public String toString() {
        return "Player{" +
                "nameAndLastName='" + nameAndLastName + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
