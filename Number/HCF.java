import java.util.Random;
public class HCF{

  public static int hcf(int a, int b){

	if(a==0 ||(b!=0 && a%b==0)){
		return b;
	}
	
	if(b==0 ||(a!=0 && b%a==0)){
		return a;
	}
  
	int n=(int) Math.min(a,b);
	int hcf = 1;
	for(int i=2;i<=n;i++){
		if(a%i==0 && b%i==0){
			hcf = i;
		}
	}

	return hcf;
  }

   public static void main(String args[]){

	Random rd = new Random();
	int a = rd.nextInt(50);
	int b = rd.nextInt(50);
	
	System.out.println(a+" "+b+" : "+hcf(a,b));
	System.out.println(24+" "+36+" : "+hcf(24,36));
   }



}