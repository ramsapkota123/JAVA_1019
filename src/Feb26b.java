
public class Feb26b {
	public static void main(String[]args) {
		
		
		// Human
				// Property - age , weight height color
				// Methods - talk() , walk()
				
				// Vehicle 
				// Property -color type brand model number 
				// Method - start() , stop()
				
				// Bank type
				// Property - accName , accNumber , balance , IFSC code 
				// Method - Deposit() , withdrawl()
				
		int a=54;
		int b=6;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("----------------------------");
		
		
		
		int x=100;
		int y=10;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		System.out.println("-----------------------------------------");
		
		Feb26b.display(44,11 );
		
		System.out.println("--------------------------------");
		int c=Feb26b.calculatoDisplay(4, 5);
		System.out.println(c);
	}
	public static void display(int x,int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	public static int calculatoDisplay(int m,int n) {
		return m+n;
	}
		
	}


