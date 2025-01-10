import arc.*;

public class cptJeremy{
	public static void main(String[] args){
		Console con = new Console();
		
		con.println("Blackjack");
		
	}
	
	public static int deck(){
		
		double dblCards[][];
		dblCards = new double[52][3];
		dblCards[0][0] = 1;
		dblCards[1][0] = 2;
		dblCards[2][0] = 3;
		dblCards[3][0] = 4;
		dblCards[4][0] = 5;
		dblCards[5][0] = 6;
		dblCards[6][0] = 7;
		dblCards[7][0] = 8;
		dblCards[8][0] = 9;
		dblCards[9][0] = 10;
		dblCards[10][0] = 11;
		dblCards[11][0] = 12;
		dblCards[12][0] = 13;
		
		dblCards[13][0] = 1;
		dblCards[14][0] = 2;
		dblCards[15][0] = 3;
		dblCards[16][0] = 4;
		dblCards[17][0] = 5;
		dblCards[18][0] = 6;
		dblCards[19][0] = 7;
		dblCards[20][0] = 8;
		dblCards[21][0] = 9;
		dblCards[22][0] = 10;
		dblCards[23][0] = 11;
		dblCards[24][0] = 12;
		dblCards[25][0] = 13;
		
		dblCards[26][0] = 1;
		dblCards[27][0] = 2;
		dblCards[28][0] = 3;
		dblCards[29][0] = 4;
		dblCards[30][0] = 5;
		dblCards[31][0] = 6;
		dblCards[32][0] = 7;
		dblCards[33][0] = 8;
		dblCards[34][0] = 9;
		dblCards[35][0] = 10;
		dblCards[36][0] = 11;
		dblCards[37][0] = 12;
		dblCards[38][0] = 13;
		
		dblCards[39][0] = 1;
		dblCards[40][0] = 2;
		dblCards[41][0] = 3;
		dblCards[42][0] = 4;
		dblCards[43][0] = 5;
		dblCards[44][0] = 6;
		dblCards[45][0] = 7;
		dblCards[46][0] = 8;
		dblCards[47][0] = 9;
		dblCards[48][0] = 10;
		dblCards[49][0] = 11;
		dblCards[50][0] = 12;
		dblCards[51][0] = 13;
		
		dblCards[0][1] = 1;
		dblCards[1][1] = 1;
		dblCards[2][1] = 1;
		dblCards[3][1] = 1;
		dblCards[4][1] = 1;
		dblCards[5][1] = 1;
		dblCards[6][1] = 1;
		dblCards[7][1] = 1;
		dblCards[8][1] = 1;
		dblCards[9][1] = 1;
		dblCards[10][1] = 1;
		dblCards[11][1] = 1;
		dblCards[12][1] = 1;
		
		dblCards[13][1] = 2;
		dblCards[14][1] = 2;
		dblCards[15][1] = 2;
		dblCards[16][1] = 2;
		dblCards[17][1] = 2;
		dblCards[18][1] = 2;
		dblCards[19][1] = 2;
		dblCards[20][1] = 2;
		dblCards[21][1] = 2;
		dblCards[22][1] = 2;
		dblCards[23][1] = 2;
		dblCards[24][1] = 2;
		dblCards[25][1] = 2;
		
		dblCards[26][1] = 3;
		dblCards[27][1] = 3;
		dblCards[28][1] = 3;
		dblCards[29][1] = 3;
		dblCards[30][1] = 3;
		dblCards[31][1] = 3;
		dblCards[32][1] = 3;
		dblCards[33][1] = 3;
		dblCards[34][1] = 3;
		dblCards[35][1] = 3;
		dblCards[36][1] = 3;
		dblCards[37][1] = 3;
		dblCards[38][1] = 3;
	
		dblCards[39][1] = 4;
		dblCards[40][1] = 4;
		dblCards[41][1] = 4;
		dblCards[42][1] = 4;
		dblCards[43][1] = 4;
		dblCards[44][1] = 4;
		dblCards[45][1] = 4;
		dblCards[46][1] = 4;
		dblCards[47][1] = 4;
		dblCards[48][1] = 4;
		dblCards[49][1] = 4;
		dblCards[50][1] = 4;
		dblCards[51][1] = 4;
		
		
	}
	
	public static int random(){
		int intRand;
		
		intRand = (int)(Math.random() * 100 + 1);
		
		return intRand;
	}
	
	//public static double shuffle(double dblCards){
		
	//}
	

}
