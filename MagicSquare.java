/*
 * Sam Mendimasa
 * MagicSquare.java
 * Amberg Pd: 3
 * Feb 6, 2014
 * 
 * This program asks user to enter an array of numbers and checks to see if the numbers enter makes a magic square
 */

import java.util.Scanner;//imports scanner

public class MagicSquare {//starts MagicSquare

	
	public static void main(String[] args) {//starts main
		Scanner scan=new Scanner(System.in);
		
		int [][] square=new int[4][4];
		int num=0;
		
		
		//allows user to input into the array
			for (int j = 0; j < square.length; j++) {//starts first for loop

				for (int k = 0; k < square[j].length; k++) {
					
					System.out.print("Enter a number for row "+(j+1)+" and column "+(k+1)+" :");
					num=scan.nextInt();
					square[j][k]=num;
					
					
				}
			}//ends first for loop
		
		//displays the array
			System.out.println("\n");
		for (int j = 0; j < square.length; j++) {

			for (int k = 0; k < square[j].length; k++) 
				System.out.print(square[j][k] + " ");
				System.out.println();

			}
		System.out.println("\n");
		int row1, row2, row3, row4, col1, col2, col3, col4, diag1, diag2;
		
		//calculations for rows
		row1=square[0][0]+square[0][1]+square[0][2]+square[0][3];
		row2=square[1][0]+square[1][1]+square[1][2]+square[1][3];
		row3=square[2][0]+square[2][1]+square[2][2]+square[2][3];
		row4=square[3][0]+square[3][1]+square[3][2]+square[3][3];
		
		//calculations for columns
		col1=square[0][0]+square[1][0]+square[2][0]+square[3][0];
		col2=square[0][1]+square[1][1]+square[2][1]+square[3][1];
		col3=square[0][2]+square[1][2]+square[2][2]+square[3][2];
		col4=square[0][3]+square[1][3]+square[2][3]+square[3][3];
		
		//calculations for diagonals
		diag1=square[0][0]+square[1][1]+square[2][2]+square[3][3];
		diag2=square[0][3]+square[1][2]+square[2][1]+square[3][0];
		
		//checks for magic square
		if(row1==row2&&row1==row3&&row1==row4)
			if(col1==col2&&col1==col3&&col1==col4)
				if(diag1==diag2&&diag1==col1&&diag2==col1)
					System.out.println("This is a 'MAGIC SQUARE' ");
				else
					System.out.println("This is 'NOT' a Magic Square ");
			else
				System.out.println("This is 'NOT' a Magic Square ");
		else
			System.out.println("This is 'NOT' a Magic Square ");
		
		
		
		
		

		
	}//ends main

}//ends magic Square
