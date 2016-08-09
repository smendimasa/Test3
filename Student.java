
public class Student {
	
	//instance variables
	private String name;
	private int id;
	private int grade;
	
	public Student(){
		name="unknown";
		id=0;
		grade=0;
	}
	public Student(String name, int id, int grade){
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	
	public String toString(){
		return name+  "  "+id+  "  "+grade;
	}

}
