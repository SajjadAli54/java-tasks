import java.util.*;
public class Date{

    public static void main(String args[]) {

	Scanner key = new Scanner(System.in);
	boolean done = false;
	String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	
	while(!done){
		try{
			System.out.print("Input date in the form mm/dd/yyyy : ");
			String date = key.nextLine();

			int m = Integer.parseInt(date.substring(0,2));
			int d = Integer.parseInt(date.substring(3,5));
			int y = Integer.parseInt(date.substring(6));
			
			if((d<=0 || d>31) || (d == 29 && m == 2 && y%4 != 0)){
				System.out.println("It's not leap year. There can't be 29 days in the second month");
				throw new DayException();
			}

			if(m<=0 || m>12){
				throw new MonthException();
			}

			if(y<1000 || y>3000)
				throw new YearException();
			m--;
			for(int x=0;x<months.length;x++){
				if(m == x){
					date = months[x] +" "+d+", "+y;
				}
			}

			System.out.println(date);

			done = true;
		}
		catch(Exception e){
			System.out.println(e);
		}		
	}
   }

}


class DayException extends Exception{
	public String toString(){
		return ("Invalid Date");
	}
}

class MonthException extends Exception{
	public String toString(){
		return ("Invalid Month");
	}
}

class YearException extends Exception{
	public String toString(){
		return ("Invalid Year");
	}
}