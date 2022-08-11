public class Main {
    public static void main(String[] args) {
//        Player playerOne = new Player("Mike", 200, "Sword");
//        //    problem 1
//        System.out.println("Player name : " + playerOne.fullName);
//        System.out.println("Player health " + playerOne.health);
//        playerOne.looseHealth(30);
//        System.out.println("Player health " + playerOne.health);
//        playerOne.looseHealth(130);
//
//        System.out.println("Player health " + playerOne.health);
//        //    problem 2
//        playerOne.health = 300;
//        playerOne.looseHealth(100);
//        System.out.println("Player health " + playerOne.health);


        Player playerOne = new Player("Mike", 200, "Sword");
        //    problem 1
        System.out.println("Player name : " + playerOne.getName());
        System.out.println("Player health " + playerOne.getHealth());
        playerOne.looseHealth(30);
        System.out.println("Player health " + playerOne.getHealth());
        playerOne.looseHealth(130);

        System.out.println("Player health " + playerOne.getHealth());
        //    problem 2
        playerOne.setHealth(300);
        System.out.println("Player health " + playerOne.getHealth());
        System.out.println(playerOne.toString());
        playerOne.looseHealth(100);
        System.out.println("Player health " + playerOne.getHealth());




    }
}
