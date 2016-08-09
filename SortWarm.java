import java.util.Scanner;



public class SortWarm{
	
	public static void main(String[] args){//begins main
		 
		  Scanner scan = new Scanner(System.in);//creates scanner
		  int LIMIT;
		 
		  
		  System.out.println("Enter the limit/ Amount of Strings: ");
		  LIMIT=scan.nextInt();
		  scan.nextLine();
		  
		  String[] numbers= new String [LIMIT];

		// Initialize the array values
		  int num=1;
		  for (int index = 0; index < LIMIT; index++){
			  
			  String val;
			  System.out.print("Enter  string "+num+" :");
			  val=scan.nextLine();
		  
			  numbers[index]=val;
			  num++;
			  System.out.println();
		  }	 
		  
		  // Sorts.selectionSort (numbers);
		  System.out.println("The String in an unsorted list is: ");
		  for (int index = 0; index < numbers.length; index++){
			  System.out.print(numbers[index] + " ");
			  }
		  
		  Sorts.insertionSort(numbers);
		   
		  System.out.println("\n\nThe String in a sorted list is: ");
		  for (int index = 0; index < numbers.length; index++){
			  System.out.print(numbers[index] + " ");
			  }
		  
		  String Search;
		  System.out.println("\nEnter what you want to search for: ");
		  Search=scan.nextLine();
		  
		  
		  
		  int index = 0; 
		  int locat=-1;
		 // while(index<LIMIT){
		  for(index=0; index<LIMIT;index++){
		   
			  if(numbers[index].equalsIgnoreCase(Search)){
				  locat=index;
			  
			  }
			 
			  }
		  
		  
		  System.out.println("\nThe thing you Search is at Location "+locat);
		  	  
		  
}}
