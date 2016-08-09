
public class CourseTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course cs101A=new Course("Programming 1", "Amberg");
		
		Student s;
		s=new Student ("Santa", 25, 11);
		cs101A.addStudent(s);
		
		s=new Student ("Jack R", 39, 12);
		cs101A.addStudent(s);
		
		s=new Student ("Sun God", 14, 10);
		cs101A.addStudent(s);
		
		System.out.println(cs101A);



	}

}
