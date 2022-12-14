import java.util.Random;
public class LCM{

  public static int lcm(int a,int b){

	if(a==0 || b==0){
		return 0;
	}

	if(a%b==0){
		return a;
	}	

	if(b%a==0){
		return b;
	}

	int n =(int) Math.max(a,b);
	int lcm = 1;
	int i=2;
	while(a!=1 || b!=1){
	   if(a%i==0 || b%i==0){
		lcm *= i;
		if(a%i == 0){
		  a /=i;
		}
		if(b%i == 0){
		  b /=i;
		}
	   }
	   else{
		i++;
	   }	
	}
	return lcm;

  }

  public static void main(String args[]){
	Random rd = new Random();
	int a = rd.nextInt(10);
	int b = rd.nextInt(10);

	System.out.println(a+" "+b+" : "+lcm(a,b));
	System.out.println(6+" "+2+" : "+lcm(6,2));
	System.out.println(3+" "+4+" : "+lcm(3,4));
  }

}