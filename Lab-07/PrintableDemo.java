interface Printable{
	void print();
}

public class PrintableDemo
{
   public static void main(String args[])
   {
    Printable vec[] ={
      new Rectangle(110,80), new SportCar("Toyota", 989621),
      new Rectangle(34,32), new Manager("John", 40),
      new Rectangle(54,10), new SportCar("Audi", 2365644),
      new SportCar("Mazda", 4322343), new Manager("Joji", 22)};

    for(int index=0; index<vec.length; index++)
    {
      vec[index].print();
    }
  }
}

class Rectangle implements Printable{
   int length, width;

   Rectangle(int length,int width){
	this.length = length;
        this.width = width;
   }

   public void print(){
	System.out.println("Length of Rectangle : "+length);	
	System.out.println("Width of Rectangle : "+width);
   }
}

class SportCar implements Printable{
	String name;
	int num;

	SportCar(String name,int num){
	   this.name = name;
	   this.num = num;
	}

	public void print(){
	   System.out.println("Name of Sport Car : "+name);
	   System.out.println("Number of Sport Car : "+num);
	}
}

class Manager implements Printable{
	String name;
	int age;

	Manager(String name,int age){
	  this.name = name;
	  this.age = age;
	}
	
	public void print(){
	  System.out.println("Name of Manager : "+name);
	  System.out.println("Age of Manager  : "+age);
	}
}