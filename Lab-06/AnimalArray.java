class Animal{

	private String name = null;
	private double age = 0;
	private String gender = null;

	Animal(String name, double age,String gender){
		this.name = name;
		this.age =  age;
		this.gender = gender;
	}

	String getName(){
		return name;
	}

	String getGender(){
		return gender;
	}

	double getAge(){
		return age;
	}

	void produceSound(){}

}

class Dog extends Animal{
	
	Dog(String name, double age,String gender){
		super(name,age,gender);
	}

	void produceSound(){
		
		System.out.println("Boww wow..");
	}

}

class Frog extends Animal{
	
	Frog(String name, double age,String gender){
		super(name,age,gender);
	}
	
	

	void produceSound(){
		
		System.out.println("tar tar taa ta..");

	}

}


class Kitten extends Animal{

	Kitten(String name, double age,String gender){
		super(name,age,gender);
	}

	void produceSound(){
		
		System.out.println("Meaoon meaonn ..");

	}	

}

class Tomcat extends Animal{

	Tomcat(String name, double age,String gender){
		super(name,age,gender);
	}

	void produceSound(){
		
		System.out.println("Meaoon meaonn ..");

	}

}


class AnimalArray{

  public static void main(String args[]){

	Animal arr[] = new Animal[12];

	arr[0] = new Dog("Tommy",4,"Male");
	arr[1] = new Dog("Bunty",5,"Female");
	arr[2] = new Frog("Juciana",6,"Male");
	arr[3] = new Frog("Luciana",3,"Female");
	arr[4] = new Tomcat("Tom",6,"Male");
	arr[5] = new Kitten("Kitten",7,"Female");
	arr[6] = new Dog("Tommy",4,"Male");
	arr[7] = new Dog("Bunty",5,"Female");
	arr[8] = new Frog("Juciana",6,"Male");
	arr[9] = new Frog("Luciana",3,"Female");
	arr[10] = new Tomcat("Tom",6,"Male");
	arr[11] = new Kitten("Kitten",7,"Female");

	double dog=0 , tcat=0 , kit=0 , frog=0;	
	int d =0 , t = 0 , k =0 , f = 0;
	for(int i=0;i<arr.length;i++){
		if(arr[i] instanceof Dog){
			dog+=arr[i].getAge();
			d++;
		}
		else if(arr[i] instanceof Frog){
			frog+=arr[i].getAge();
			f++;
		}
		else if(arr[i] instanceof Tomcat){
			tcat+=arr[i].getAge();
			t++;
		}
		else if(arr[i] instanceof Kitten){
			kit+=arr[i].getAge();
			k++;
		}
	}

	System.out.println("Average age of dogs : "+(dog/d));
	System.out.println("Average age of Frogs : "+(frog/f));
	System.out.println("Average age of Tomcats : "+(tcat/t));
	System.out.println("Average age of Kitten : "+(kit/k));
  }

}