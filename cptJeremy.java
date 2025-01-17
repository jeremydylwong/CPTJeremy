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
    
    public static void playGame(Console con) {
		
		int intDeck[][];
		intDeck = new int[52][3];
        
        initializeDeck(intDeck);
        shuffleDeck(intDeck);

        int intPlayerMoney = 1000;

        con.println("Enter your name:");
        String strPlayerName = con.readLine();

        // Game loop
        while (true) {
            con.println("You have $" + intPlayerMoney);
            con.println("Enter your bet:");
            int intBet = con.readInt();

            if (intBet > intPlayerMoney) {
                con.println("You don't have enough money to place that bet.");
                con.println("Enter a valid bet:");
                intBet = con.readInt();
            }

            int intPlayerHand[][];
            intPlayerHand = new int[5][2];
            int intDealerHand[][];
            intDealerHand = new int[5][2];

            int intPlayerChoice = 0;
            while (intPlayerValue <= 21 && intPlayerChoice != 2) {
                con.println("Do you want to (1) Hit or (2) Stay?");
                intPlayerChoice = con.readInt();
                if (intPlayerChoice == 1) {
                    con.println("Your hand value: " + intPlayerValue);
                }
            }


            if (intPlayerValue > 21) {
                con.println("You busted!");
                intPlayerMoney -= intBet;
            } else {
                con.println("Dealer's hand value: " + intDealerValue);

                while (intDealerValue < 17) {
                    con.println("Dealer's hand value: " + intDealerValue);
                }

                if (intDealerValue > 21) {
                    con.println("Dealer busted! You win $" + intBet);
                    intPlayerMoney += intBet;
                } else if (intPlayerValue > intDealerValue) {
                    con.println("You win! You win $" + intBet);
                    intPlayerMoney += intBet;
                } else if (intPlayerValue < intDealerValue) {
                    con.println("Dealer wins! You lose $" + intBet);
                    intPlayerMoney -= intBet;
                } else {
                    con.println("It's a tie! No money lost.");
                }
            }

            // Ask if player wants to play again or quit
            con.println("Do you want to play again? (1) Yes (2) No");
            int intPlayAgain = con.readInt();
            if (intPlayAgain == 2 || intPlayerMoney <= 0) {
                con.println("Game over. You have $" + intPlayerMoney);
            }

            initializeDeck(intDeck);
            shuffleDeck(intDeck);
        }
    }

	public static void initializeDeck(){
		int intCount;
		for(intCount = 0; intCount < 52; intCount++){
			intDeck[intCount][0] = intCount;
		}
		
		for(intCount = 0; intCount < 13; intCount++){
			intDeck[intCount][1] = 1;
		}
		for(intCount = 13; intCount < 26; intCount++){
			intDeck[intCount][1] = 2;
		}
		for(intCount = 26; intCount < 39; intCount++){
			intDeck[intCount][1] = 3;
		}
		for(intCount = 39; intCount < 52; intCount++){
			intDeck[intCount][1] = 4;
		}
		
		for(intCount = 0; intCount < 52; intCount++){
			intDeck[intCount][2] = (int)(Math.random() * 100) + 1;
		}
	}

	public static void shuffleDeck(int[][] intDeck) {
		int intTempValue;
		int intTempSuit;
		int intTempRandom;
		int intRow2;
		for(intRow2 = 0; intRow2 < 52-1; intRow2++){
			for(int intRow = 0; intRow < 52-1-intRow2; intRow++){
				// Bubble sort. If left is bigger than right
				if(intDeck[intRow][2] > intDeck[intRow + 1][2]){
					// Take the left item
					intTempValue = intDeck[intRow][0];
					intTempSuit = intDeck[intRow][1];
					intTempRandom = intDeck[intRow][2];
					// Right item moves to the left
					intDeck[intRow][0] = intDeck[intRow + 1][0];
					intDeck[intRow][1] = intDeck[intRow + 1][1];
					intDeck[intRow][2] = intDeck[intRow + 1][2];
					// Put temporary value on the right
					intDeck[intRow + 1][0] = intTempValue;
					intDeck[intRow + 1][1] = intTempSuit;
					intDeck[intRow + 1][2] = intTempRandom;
				}
			}
		}
	}
	
	public static void dealCards(int[][] intPlayerHand, int[][] intDealerHand, int[][] intDeck) {
		int intCount;
        for (intCount = 0; intCount < 2; intCount++) {
            intPlayerHand[intCount][0] = intDeck[intCount][0];
            intPlayerHand[intCount][1] = intDeck[intCount][1];
            intDealerHand[intCount][0] = intDeck[intCount + 2][0];
            intDealerHand[intCount][1] = intDeck[intCount + 2][1];
        }
    }


}
	
