public class Do {
	
	int  id;
	String name;
	
	Student(int i, String n){
		id = i;
		name = n;
	}
	void Display() {

	System.out.println(id+""+name);
	}
	
	public static void main(String[] args) {
 Student s1 = new Student (111, " sasi");
 Student s2 = new Student (55, "ram");
 Student s3 = new Student (55,"sai");
 Student s4 = new Student (152,"ram");
 Student s5 = new Student (12,"raam");
		
 
 s1.Display();
 s2.Display();
 s3.Display();
 s4.Display();
 s5.Display();
		
 
		
	}

}

