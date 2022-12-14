interface Queue{

	void add(int a);
	int remove();

	boolean check();
}

class QueueClass implements Queue{
   int arr[] = new int[10];
   int i=0;

   public void add(int a){
      if(i < arr.length){
	arr[i++] = a;
      }
      else{
	int temp[] = new int[2 * arr.length];
	for (int j=0;j<i;j++){
	   temp[j] = arr[j];
	}
	temp[i++] = a;
	arr = temp;
      }
   }

   public int remove(){
     if(check()){
	System.out.println("Queue is empty.");
	return -1;
     }
     else{
	int r = arr[0];
	for(int j=0,k=1;k<i;j++,k++){
	    arr[j] = arr[k];
	}
	i--;
	return r;
     }
   }

   public boolean check(){
	return i==0;
   }

   public static void main(String args[]){

	System.out.println("Queue 1");
      QueueClass queue = new QueueClass();

      for(int i=0;i<10;i++){
	queue.add(i*i);
      }

      for(int i=0;i<15;i++){
	System.out.println(queue.remove());
      }

	System.out.println("\n\nQueue 2");

      for(int i=0;i<20;i++){
	queue.add(i*i);
      }

      for(int i=0;i<20;i++){
	System.out.println(queue.remove());
      }

   }
}