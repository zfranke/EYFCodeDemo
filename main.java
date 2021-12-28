package EYFCodeDemo;
public class main {

    public void pickupFood(player playername) {
        if(playername.getSize() < 11) {
            playername.addSize(1);
        }
        
    } 

    public void takeDamage(player playername) {
        if(playername.getSize() > 0) {
            playername.removeSize(1);
        }
    }
    
    public void eatPlayer(player playername,player player2) {
        if (playername.getSize() > player2.getSize()) {
            System.out.println(playername.getName() + " ate " + player2.getName() + "!");
            player2.resetSize();
        } else {
            System.out.println(player2.getName() + " ate " + playername.getName() + "!");
            playername.resetSize();
        }
    }

    public static void main(String[] args) {
        //Create two player objects
        player p1 = new player("Todd");
        player p2 = new player("Albert");

        //Print the size of each player
        System.out.println("Player 1 Size: " + p1.getSize());
        System.out.println("Player 2 Size: " + p2.getSize());

        //Simulate gameplay where player 1 eats player 2 after both pick up food and player 1 damage player 2
        main game = new main();
        System.out.println("Game Begins!");
        System.out.println(" ");

        System.out.println("Player 1 picks up food");
        game.pickupFood(p1);
        System.out.println(" ");

        System.out.println("Player 2 picks up food");
        game.pickupFood(p2);
        System.out.println(" ");

        System.out.println("Player 1 takes damage");
        game.takeDamage(p1);
        System.out.println(" ");

        System.out.println("Player 2 takes damage");
        game.takeDamage(p2);
        System.out.println(" ");

        System.out.println("Player 2 takes damage");
        game.takeDamage(p2);
        System.out.println(" ");

        System.out.println("Player 1 eats player 2");
        game.eatPlayer(p1,p2);
        System.out.println(" ");
        
        System.out.println("Game Over!"); 


    }
}