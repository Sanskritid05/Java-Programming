import java.util.Scanner ; 
/**
 * This class represents the Guesser who selects a number that players have to guess.
 */
class Guesser{
    
    int gnum ;  // The number chosen by the Guesser.
    
    /**
     * The method allows the Guesser to input a number.
     * 
     * @return The number guessed by the Guesser.
     */
    
    int guessingNum(){
        
        System.out.println("Guess The Number : ") ;
        
        Scanner scan = new Scanner(System.in) ;
        
        gnum = scan.nextInt() ;
        scan.close() ;
        return gnum ; 
    }
}
/**
 * This class represents a Player who guesses a number.
 */

class Player{
    
    int playerInput ; // The number chosen by the player.
    
    /**
     * The method allows the Player to input a guess.
     * 
     * @return The number guessed by the Player.
     */
    
    int playerNum(){
        
        System.out.println("Player , make an input") ; 
        
        Scanner scan = new Scanner(System.in) ;
        
        playerInput = scan.nextInt() ;
        scan.close() ;

        
        return playerInput ; 
    }
}
/**
 * This class represents the Umpire, who manages the game and checks the results.
 */

class Umpire{
    
    int num_from_guesser ; // The number chosen by the Guesser.
    int num_from_player_1 ;// The guess from Player 1.
    int num_from_player_2 ;// The guess from Player 2.
    int num_from_player_3 ;// The guess from Player 3.
    
     /**
     * Collects the guess number from the Guesser.
     */
    void collectGuessNumber(){
        
        Guesser g = new Guesser() ; 
        
        num_from_guesser = g.guessingNum();
    }  
    /**
     * Collects the guesses from all players.
     */
    
    void collectPlayerInput() {
        
        Player p1 = new Player() ; 
        num_from_player_1 = p1.playerNum() ;
        
        
        
        Player p2 = new Player() ;
        num_from_player_2 = p2.playerNum() ; 
        
        
        
        Player p3 = new Player() ;
        num_from_player_3 = p3.playerNum() ; 
        
        
    }
     /**
     * Compares the guesses of the players with the Guesser's number and declares the winner.
     * If no player guesses correctly, a message indicating the game was lost is displayed.
     */
    void predictTheOutput(){
        
        if(num_from_guesser == num_from_player_1){
            System.out.println("Player 1 wins the game") ; 
        }
        else if(num_from_guesser == num_from_player_2){
            System.out.println("Player 2 wins the game") ; 
        }
        else if(num_from_guesser == num_from_player_3){
            System.out.println("Player 3 wins the game") ; 
        }
        else{
            System.out.println("You Loose the game. Restart.") ; 
        }
    }
    
}
/**
 * The main class that initiates and runs the Guesser game.
 */

public class GuesserGame{
    public static void main(String[] args){
        
        Umpire u = new Umpire() ;  
    
        u.collectGuessNumber(); // Collect the Guesser's number.
        
        u.collectPlayerInput();  // Collect the guesses from all players.
        
        u.predictTheOutput();   //predicts the output
    }
     
}


