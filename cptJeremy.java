import arc.*;

public class cptJeremy{
	public static void main(String[] args){
		Console con = new Console();
        
        // Home screen 
        while (true) {
            con.println("Welcome to Blackjack!");
            con.println("1. Play");
            con.println("2. View Highscores");
            con.println("3. Quit");

            int intChoice = con.readInt();
            
            if (intChoice == 1) {
                playGame(con);  
            } else if (intChoice == 2) {
                con.println("Viewing Highscores...");
            } else if (intChoice == 3) {
                con.println("Thanks for playing!");
            } else {
                con.println("Invalid choice, please try again.");
            }
        }
    }
}
	
