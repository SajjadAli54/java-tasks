import java.util.Scanner;
import java.util.Vector;
public class RangePal{

   public static Vector pals(int start, int end){
	Vector<Integer> arr = new Vector<Integer>();
	for(int i=start;i<=end;i++){
	  if(pal(i)){
		arr.add(i);
	  }
	}
	return arr;
   }

   public static boolean pal(int num){
	int check = num;
	int rev=0;
	while(num!=0){
		int rem = num%10;
		num /= 10;
		rev = 10*rev + rem;
	}
	return check == rev;
   }

   public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Input start and end : ");
	int start = sc.nextInt();
	int end = sc.nextInt();

	Vector<Integer> arr = pals(start,end);
	for(int i=0;i<arr.size();i++){
		System.out.print(arr.get(i)+" ");
	}
   }



}