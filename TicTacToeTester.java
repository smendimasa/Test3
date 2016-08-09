 import java.util.Scanner;
 
public class TicTacToeTester {
	/*
	 * tests TicTacToe class by prompting the user to 
	 * set positions the board and printing out the 
	 * result - plays a game
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		String player = "X";
		boolean done = false;
		TicTacToe game = new TicTacToe();
		while (!done){
			System.out.println(game);
			System.out.print("enter ROW for " + player + " (-1 to exit): ");
			int row = in.nextInt();
			if (row < 0)
				done = true;
			else {
				System.out.print("enter COLUMN for " + player  + ": ");
				int col = in.nextInt();
				game.set(row,col, player);
				if (player.equals("X"))
					player = "O";
				else
					player = "X";
				
			}
		}


	}

}
