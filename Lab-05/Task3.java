class Person{

	String firstName = null;
	String lastName = null;

	void setFirstName(String firstName){
		this.firstName = firstName;
	}

	void setLastName(String lastName){
		this.lastName = lastName;
	}

	String getName(){
		String name = firstName + " " + lastName;
		return name;
	}

	void displayDetails(){
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
	}
}

class Student extends Person{

	String id = null;
	String course = null;
	String teacher = null;

	Student(String firstName,String lastName,String id,String course,String teacher){
		setFirstName(firstName);
		setLastName(lastName);
		this.id = id;
		this.course = course;
		this.teacher= teacher;
	}

	Student (){
		this("","","","","");
	}

	void displayDetails(){
		super.displayDetails();
		System.out.println("Course id : "+id);
		System.out.println("Course name : "+course);
		System.out.println("Teacher name : " + teacher);
	}
}

class Teacher extends Person{

	private String name = null;
	private double salary = 0;

	Teacher (String name , double salary){
		this.name = name;
		this.salary = salary;
	}

	Teacher(){
		this("",-1);
	}

	void displayDetails(){
		System.out.println("Teacher : "+name);
		System.out.println("Salary of Teacher : "+salary);
	}
}

class Task3{

 public static void main(String args[]){

	Student std = new Student ("Sajjad","Ali","023","Java","Dr. Sher");
	std.displayDetails();

	System.out.println();
	
	Student std2 = new Student ("Sajan","Ali","022","C++","Dr. Gilal");
	std2.displayDetails();
	
	System.out.println();

	Teacher tutor = new Teacher ("Dr. Sher",205000);
	tutor.displayDetails();

	System.out.println();
	
	Teacher tutor2 = new Teacher ("Dr. Gilal",205400);
	tutor2.displayDetails();		
 }	

}