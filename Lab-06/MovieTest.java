class Movie{

	String rating = null;
	int id = 0;
	String title = null;

	void setRating(String rate){
		rating = rate;
	}
	String getRating(){
		return rating;
	}

	void setId(int id){
		this.id= id;
	}
	int getId(){
		return id;
	}

	void setTitle(String title){
		this.title= title;
	}
	String getTitle(){
		return title;
	}

	boolean equals(Movie m){
		if(m.id == id)
			return true;
		return false;
	}

	double calcLateFee(int noOfDay){
		return (noOfDay * 2.0);
	}

}

class Action extends Movie{

	double calcLateFee(int noOfDay){
		return (noOfDay * 3.0);
	}	

}

class Drama extends Movie{

	double calcLateFee(int noOfDay){
		return (noOfDay * 2.0);
	}

}

class Comedy extends Movie{

	double calcLateFee(int noOfDay){
		return (noOfDay * 2.5);
	}

}

class MovieTest{

  public static void main(String ags[]){

	Movie mov1 = new Action();
	mov1.setId(231);
	mov1.setTitle("Matrix");

	Movie mov2 = new Drama();
	mov2.setId(234);
	mov2.setTitle("Hamesha");

	Movie mov3 = new Comedy();
	mov3.setId(235);
	mov3.setTitle("Herapheri");

	System.out.println(mov1.getTitle()+" is  late 3 days. It's late fee : "+mov1.calcLateFee(3));
	System.out.println(mov2.getTitle()+" is  late 2 days. It's late fee : "+mov2.calcLateFee(2));
	System.out.println(mov3.getTitle()+" is  late 3 days. It's late fee : "+mov3.calcLateFee(4));

	Movie mov4 = new Action();
	mov4.setId(131);
	mov4.setTitle("Infinity");

	System.out.println(mov1.getTitle()+" and "+mov4.getTitle()+" are same ..."+mov1.equals(mov4));
	
  }

}