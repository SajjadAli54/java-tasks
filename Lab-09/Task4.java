class Storage{
	int store=0;
}
class Counter extends Thread {
	Storage s;
	Counter(Storage s){
		this.s=s;
		new Thread(this).start();
	}
	int count=0;
	public void run(){
		while(true){
			s.store+=1;
			count++;
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
	
}
class Printer extends Storage implements Runnable{
	Storage s;

	Printer(Storage s){
		this.s=s;
		new Thread(this).start();
	}
	public void run(){
		while(true){
			System.out.println(s.store);
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}
public class Task4{
	public static void main(String args[]){
		Storage s= new Storage();
		Counter c = new Counter(s);
		Printer p = new Printer(s);
		
	}
}