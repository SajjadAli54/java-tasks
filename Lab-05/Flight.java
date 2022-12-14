import java.util.*;
class Flight{
 private String id = null;
 private String destination = null;
 private Time depart = null;
 private Time arrival = null;
 private Vector<Passenger> passengerList = new Vector<Passenger>();

 Flight(String id,String destination, Time dep,Time arriv){
	this.id = id;
	this.destination = destination;
	depart = new Time(dep.getHour(),dep.getMinute());
	arrival = new Time(arriv.getHour(),arriv.getMinute());
 }

 void addPassenger(Passenger passenger){
	passengerList.add(passenger);
 }

 void printInfo(){
	System.out.println("Flight no            : "+id);
	System.out.println("Destination          : "+destination);

	String time = Integer.toString(depart.getMinute());
	if(time.length() <2)
		time = '0' + time;
	time = Integer.toString(depart.getHour()) + ":"+ time;
	System.out.println("Departure            : " + time);

	time = Integer.toString(arrival.getMinute());
	if(time.length() <2)
		time = '0' + time;
	time = Integer.toString(arrival.getHour()) + ":"+ time;
	System.out.println("Arrival              : " + time);

	System.out.println("Number of passengers : "+passengerList.size());
 }

}