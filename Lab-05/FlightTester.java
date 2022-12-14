public class FlightTester{

 public static void main(String args[]){

	Time dep = new Time(8,10);
	Time arr = new Time(9,00);
	Flight f = new Flight("PK-303","Lahore",dep,arr);
	Passenger psg1 = new Passenger("Aariz",30);
	Passenger psg2 = new Passenger("Arsham",44);
	
	f.addPassenger(psg1);

	f.addPassenger(psg2);
	f.printInfo();

 }

}