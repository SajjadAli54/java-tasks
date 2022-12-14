class Counter{     
	int count=0;     
	void inc() { 
	count = count+1;
	}     
	int getCount(){
	return count;    
	} 
}
class CounterDemo extends Thread{
	Counter c ;
	CounterDemo(Counter c){
		this.c=c;
	}
	public void run(){
		c.inc();
	}
} 
public class Unsynchronization{
	public static void main(String args[]){
		Counter c=new Counter();
		Thread t1 = new CounterDemo(c);
		Thread t2 = new CounterDemo(c);
		Thread t3 = new CounterDemo(c);
		Thread t4 = new CounterDemo(c);
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){};
		t2.start();
		try{Thread.sleep(10);}catch(Exception e){};
		t3.start();
		try{Thread.sleep(10);}catch(Exception e){};
		t4.start();
		try{Thread.sleep(10);}catch(Exception e){};
		System.out.println("The value of Count :"+c.getCount());
	}
}	