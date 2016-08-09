/*
 * Sam Mendimasa
 * TicTacToe.java
 * Amberg Pd: 3
 * February 11, 2014
 * 
 * Creates a program that simulates playing a tictactoe game
 */



public class TicTacToe {//begins TicTacToe

	//instance variables (fields)
	private String [][] board;
	private static final int ROWS=3;
	private static final int COLS=3;
	
	
	//constructor
	//constructs an empty board- filled with blank space Strings
	//as place holders
	public TicTacToe(){//begins constructor
	 board=new String [ROWS][COLS];
		
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[r].length; c++) {
				board[r][c] = " ";
		}
	}
		
	}//ends constructor
	
	/*
	 * Sets a field in the board. This field must be unoccupied to be set
	 * precondition: r is the row value value and 0<=r<3
	 * c is the column value and 0<=r<3
	 * p is the string "x" or "o"
	 * postcondition: if the field is unoccupied, it sets it to p otherwise it remains unchange
	 * 
	 */
	public void set(int r, int c, String p){//starts set
		if(board[r][c].equals(" ")){
		board[r][c]=p;
		}
		
	}//ends set
	
	/*
	 * Creates a String representation of the board
	 * for example
	 * [x o]
	 * [ x ]
	 * [  o]
	 * precondition : none
	 * postconditions : returns String representation of the board
	 * 
	 */

	public String toString(){//begins toString
		 String b="";
		for (int r = 0; r < board.length; r++) {
			 b+="[ ";
			for (int c = 0; c < board[r].length; c++) {
				b+=(board[r][c]+" ");
				
				}
			b+="]\n";
			
			}
		 
		 return b;
	}//ends toString

	
}//ends TicTacToe
