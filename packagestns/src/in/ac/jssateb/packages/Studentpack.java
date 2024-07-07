package in.ac.jssateb.packages;

public class Studentpack {
	int usn;
	String name;
	float marks;
	char gender;
	public static void main(String [] args) {
		Studentpack s1 = new Studentpack();
		
		//initialization 
		//using reference variable
		s1.usn=1;
		s1.name ="Rajesh";
		s1.marks=98;
		s1.gender='M';
		System.out.println(s1.usn + " " + s1.name+ " " + s1.marks);
		
	}

}


