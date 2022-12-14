import java.util.Scanner;
import static java.lang.Math.*;
public class Temperature{

  public static double temp(double v,double outTemp){

	double temp = 35.74 + 0.6215 * outTemp - 35.75 * pow(v,0.16) + 0.4275 * outTemp * pow(v,0.16);
	return temp;

  }

  public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Input outside temp : ");
	double outTemp = sc.nextDouble();
	System.out.print("Input speed : ");
	double v = sc.nextDouble();

	System.out.print("Wind chill temp  : "+temp(v,outTemp));
  }








}