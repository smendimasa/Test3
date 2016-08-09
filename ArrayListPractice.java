import java.util.ArrayList;
public class ArrayListPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList <String> names= new ArrayList<String>();
		
		/*names.add("Santa");
		names.add("Easter Bunny");
		names.add(0, "Jack Frost");
		System.out.println(names);
		System.out.println(names.get(2));
		names.add("Cupid");
		System.out.println(names);
		names.remove(0);
		System.out.println(names);

*/
		String [] xax= new String[3];
		xax[0]="sam";
		System.out.println(xax);
		//int [] sm=new int[10];
		//System.out.println(sm[9]);
		
		int [] sw= {5,3};
		int [] sm={25, 35, 45, 55, 50, 33};
		
		for(int x=5; x>0; x--)
			System.out.print(sm[x]+ " ");
			
	}

}
