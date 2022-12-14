interface Tossable{
	void toss();
}

class Rock implements Tossable{
  public void toss(){
	System.out.println("Rock toss is rolled");
  }

}

abstract class Ball implements Tossable{
   private String brandName;

   Ball(String brandName){
	this.brandName = brandName;
   }

   String getBrandName(){
	return brandName;
   }

   abstract void bounce(); 
}

class Baseball extends Ball{
   Baseball(String brandName){
	super(brandName);
   }

   public void toss(){
	System.out.println("Baseball toss is roled.");
   }

   public void bounce(){
	System.out.println("Baseball toss is bounced.");
   }
}

class Football extends Ball{
   Football(String brandName){
	super(brandName);
   }

   public void toss(){
	System.out.println("Football toss is roled.");
   }

   public void bounce(){
	System.out.println("Football toss is bounced.");
   }
}