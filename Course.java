import java.util.ArrayList;

public class Course {
	private String subject, instructor;
	private ArrayList<Student> classList;
	
	public Course(String sub, String inst){
		subject=sub;
		instructor=inst;
		
		classList=new ArrayList<Student>();
	}
	
	public void addStudent(Student s){
		classList.add(s);
	}

	public String toString(){
		return subject+   "  "+instructor+classList;
	}
}
