ssimport java.util.Scanner;
class control {
	public static void main(String[] args){
		Scanner obj= new Scanner(System.in);
		boolean A=true,B=true,C=true;
		if ((A && B) && !C)
		{	
			System.out.println("Both A and B, but not C");
		}
		if (A || B || C)
		{
			System.out.println("Either A, B, or C");	
		}
		if ((A && B && C) || (!A && !B && !C))
		{
			System.out.println("All or none of A, B, and C");
		}
		if (A && B)
		{
			System.out.println("A and B");
		}
		System.out.println("Input any number : ");
		int num = obj.nextInt();
		int i=1, j=1;
		while (i<=num)
		{
			j=j*i;
			i=i+1;	
		}
		System.out.println("Result : " + j);
		i=1;
		j=1;
		for (i=1;i<num;i++)
		{
			j=j*i;
		}
		System.out.println("Result : " + j);
}
}