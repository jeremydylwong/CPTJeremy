import arc.*;

public class cptJeremy{
	public static void main(String[] args){
		Console con = new Console();
		
		con.println("Blackjack");

		
	}
	
	public static int[][] deck(){
		
		int intCards[][];
		intCards = new int[52][3];
		
		intCards[0][0] = 1;
		intCards[1][0] = 2;
		intCards[2][0] = 3;
		intCards[3][0] = 4;
		intCards[4][0] = 5;
		intCards[5][0] = 6;
		intCards[6][0] = 7;
		intCards[7][0] = 8;
		intCards[8][0] = 9;
		intCards[9][0] = 10;
		intCards[10][0] = 11;
		intCards[11][0] = 12;
		intCards[12][0] = 13;
		
		intCards[13][0] = 1;
		intCards[14][0] = 2;
		intCards[15][0] = 3;
		intCards[16][0] = 4;
		intCards[17][0] = 5;
		intCards[18][0] = 6;
		intCards[19][0] = 7;
		intCards[20][0] = 8;
		intCards[21][0] = 9;
		intCards[22][0] = 10;
		intCards[23][0] = 11;
		intCards[24][0] = 12;
		intCards[25][0] = 13;
		
		intCards[26][0] = 1;
		intCards[27][0] = 2;
		intCards[28][0] = 3;
		intCards[29][0] = 4;
		intCards[30][0] = 5;
		intCards[31][0] = 6;
		intCards[32][0] = 7;
		intCards[33][0] = 8;
		intCards[34][0] = 9;
		intCards[35][0] = 10;
		intCards[36][0] = 11;
		intCards[37][0] = 12;
		intCards[38][0] = 13;
		
		intCards[39][0] = 1;
		intCards[40][0] = 2;
		intCards[41][0] = 3;
		intCards[42][0] = 4;
		intCards[43][0] = 5;
		intCards[44][0] = 6;
		intCards[45][0] = 7;
		intCards[46][0] = 8;
		intCards[47][0] = 9;
		intCards[48][0] = 10;
		intCards[49][0] = 11;
		intCards[50][0] = 12;
		intCards[51][0] = 13;
		
		intCards[0][1] = 1;
		intCards[1][1] = 1;
		intCards[2][1] = 1;
		intCards[3][1] = 1;
		intCards[4][1] = 1;
		intCards[5][1] = 1;
		intCards[6][1] = 1;
		intCards[7][1] = 1;
		intCards[8][1] = 1;
		intCards[9][1] = 1;
		intCards[10][1] = 1;
		intCards[11][1] = 1;
		intCards[12][1] = 1;
		
		intCards[13][1] = 2;
		intCards[14][1] = 2;
		intCards[15][1] = 2;
		intCards[16][1] = 2;
		intCards[17][1] = 2;
		intCards[18][1] = 2;
		intCards[19][1] = 2;
		intCards[20][1] = 2;
		intCards[21][1] = 2;
		intCards[22][1] = 2;
		intCards[23][1] = 2;
		intCards[24][1] = 2;
		intCards[25][1] = 2;
		
		intCards[26][1] = 3;
		intCards[27][1] = 3;
		intCards[28][1] = 3;
		intCards[29][1] = 3;
		intCards[30][1] = 3;
		intCards[31][1] = 3;
		intCards[32][1] = 3;
		intCards[33][1] = 3;
		intCards[34][1] = 3;
		intCards[35][1] = 3;
		intCards[36][1] = 3;
		intCards[37][1] = 3;
		intCards[38][1] = 3;
	
		intCards[39][1] = 4;
		intCards[40][1] = 4;
		intCards[41][1] = 4;
		intCards[42][1] = 4;
		intCards[43][1] = 4;
		intCards[44][1] = 4;
		intCards[45][1] = 4;
		intCards[46][1] = 4;
		intCards[47][1] = 4;
		intCards[48][1] = 4;
		intCards[49][1] = 4;
		intCards[50][1] = 4;
		intCards[51][1] = 4;
		
		intCards[0][2] = randomNumber();
		intCards[1][2] = randomNumber();
		intCards[2][2] = randomNumber();
		intCards[3][2] = randomNumber();
		intCards[4][2] = randomNumber();
		intCards[5][2] = randomNumber();
		intCards[6][2] = randomNumber();
		intCards[7][2] = randomNumber();
		intCards[8][2] = randomNumber();
		intCards[9][2] = randomNumber();
		intCards[10][2] = randomNumber();
		intCards[11][2] = randomNumber();
		intCards[12][2] = randomNumber();
		
		intCards[13][2] = randomNumber();
		intCards[14][2] = randomNumber();
		intCards[15][2] = randomNumber();
		intCards[16][2] = randomNumber();
		intCards[17][2] = randomNumber();
		intCards[18][2] = randomNumber();
		intCards[19][2] = randomNumber();
		intCards[20][2] = randomNumber();
		intCards[21][2] = randomNumber();
		intCards[22][2] = randomNumber();
		intCards[23][2] = randomNumber();
		intCards[24][2] = randomNumber();
		intCards[25][2] = randomNumber();
		
		intCards[26][2] = randomNumber();
		intCards[27][2] = randomNumber();
		intCards[28][2] = randomNumber();
		intCards[29][2] = randomNumber();
		intCards[30][2] = randomNumber();
		intCards[31][2] = randomNumber();
		intCards[32][2] = randomNumber();
		intCards[33][2] = randomNumber();
		intCards[34][2] = randomNumber();
		intCards[35][2] = randomNumber();
		intCards[36][2] = randomNumber();
		intCards[37][2] = randomNumber();
		intCards[38][2] = randomNumber();
	
		intCards[39][2] = randomNumber();
		intCards[40][2] = randomNumber();
		intCards[41][2] = randomNumber();
		intCards[42][2] = randomNumber();
		intCards[43][2] = randomNumber();
		intCards[44][2] = randomNumber();
		intCards[45][2] = randomNumber();
		intCards[46][2] = randomNumber();
		intCards[47][2] = randomNumber();
		intCards[48][2] = randomNumber();
		intCards[49][2] = randomNumber();
		intCards[50][2] = randomNumber();
		intCards[51][2] = randomNumber();
	
		return intCards;
	}
	
	public static int randomNumber(){
		int intRand;
		
		intRand = (int)(Math.random() * 100 + 1);
		
		return intRand;
	}
	
	public static void shuffle(int[][] intCards) {
		int tempRandom; 
		for (int left = 0; left < intCards.length - 1; left++) {    
			for (int right = 0; right < intCards.length - 1 - left; right++) {
				if (intCards[right][2] > intCards[right + 1][2]) {
					tempRandom = intCards[right][2];
					intCards[right][2] = intCards[right + 1][2];
					intCards[right + 1][2] = tempRandom;
					
					int tempRank = intCards[right][0];
					int tempSuit = intCards[right][1];
					
					intCards[right][0] = intCards[right + 1][0];
					intCards[right][1] = intCards[right + 1][1];
					
					intCards[right + 1][0] = tempRank;
					intCards[right + 1][1] = tempSuit;
				}
			}
		}
	}

	

}
