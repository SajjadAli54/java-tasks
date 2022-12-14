class ArithmeticDemo {
    public static void main (String[] args){
        int result = 1 + 2;
        System.out.println(result);

        int a = result - 1;
	result = a;
        System.out.println(result);

        a = result * 2;
	result = a;
        System.out.println(result);

        a = result / 2;
        result = a;
	System.out.println(result);

        result = result + 8;
        result = result % 7;
        System.out.println(result);
    }
}
