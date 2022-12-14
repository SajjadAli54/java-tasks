import java.util.Random;
public class Median{

  public static int median(int arr[]){
	for(int i=0;i<arr.length-1;i++){
	  for(int j=i+1;j<arr.length;j++){
		if(arr[j]>arr[i]){
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	  }
	}
	return arr[2];
  }

  public static void main(String args[]){

	Random rand = new Random();
	int arr[] = new int[5];
	for(int i=0;i<5;i++){
		arr[i] = rand.nextInt(1000);
		System.out.print(arr[i]+" ");
	}

	System.out.println("\n Median is : "+median(arr));



  }





}