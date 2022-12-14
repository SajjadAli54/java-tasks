class Rental{

	private Movie rented;
	private int custId = 0;
	private int late = 0;
	
	double calcLateFees(){
		return rented.calcLateFee(late);
	}

	void setMovie(Movie x){
		rented = x;
	}

	void setCustId(int x){
		custId = x;
	}

	void setDelay(int x){
		late = x;
	}

	double lateFeesOwed(Rental[] arr){
		double fee=0;
		for(int i=0;i<arr.length;i++){
			fee += arr[i].calcLateFees();
		}
		return fee;
	}


}

class RentalTest{

  public static void main(String args[]){

	Rental arr[] = new Rental[3];

	Movie m = new Action();
	m.setTitle("Hack");
	m.setId(123);
	arr[0] = new Rental();
	arr[0].setMovie(m);
	arr[0].setCustId(987);
	arr[0].setDelay(4);
  
	Movie m2 = new Drama();
	m2.setTitle("Jack");
	m2.setId(124);
	arr[1] = new Rental();
	arr[1].setMovie(m2);
	arr[1].setCustId(988);
	arr[1].setDelay(4);

	Movie m3 = new Comedy();
	m3.setTitle("Herapheri");
	m3.setId(124);
	arr[2] = new Rental();
	arr[2].setMovie(m3);
	arr[2].setCustId(989);
	arr[2].setDelay(5);

	System.out.println("Total fees owed : "+arr[0].lateFeesOwed(arr));
	
  }
}