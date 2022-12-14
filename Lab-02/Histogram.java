import java.util.Random;
public class Histogram{

   public static void histogram(int[] arr){
	int j = 0;
	System.out.println("Element\t\tValue\t Histogram");
	for(int x:arr){
	   System.out.print(j++ + " \t\t"+x+"\t");
	   for(int i=0;i<x;i++){
		System.out.print("*");
	   }
	   System.out.println();

	}
   }

   public static void main(String rsh[]){

	Random rd = new Random();

	int arr[] = new int[rd.nextInt(10)+6];

	for(int i=0;i<arr.length;i++){
		arr[i] = rd.nextInt(20);
	}

	histogram(arr);
   }

   




}