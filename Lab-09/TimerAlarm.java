import java.util.Scanner;
interface Timer{

	default public void actionAlarm(){
		System.out.println("Action Alarm");
	}

}
class TimerAlarm extends Thread implements Timer{
   int t = 0;
   boolean pause = true;

   TimerAlarm(){
	Scanner key = new Scanner(System.in);
	System.out.print("Input time sleep : ");
	this.t = key.nextInt();
   }

   public void run(){
	for(int i=0;i<10;i++)
	   try{
		if(!pause){
			actionAlarm();
			Thread.sleep(t);
			pause();
		}
		else{	
			play();
		}
	   }catch(Exception e){}

  }

  public void pause(){
	pause = true;
  }

  public void play(){
	pause = false;
  }

   public static void main(String args[]){
	TimerAlarm timer = new TimerAlarm();

	timer.start();

   }
  
}