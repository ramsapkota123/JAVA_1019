
public class Feb26a {
	public static float f=10.67f;//Global static variable
	public double d=10.5666d;//Global instance variable

	public static void main(String[] args) {
		Feb26a z=new Feb26a();
		int a =10;//local variable
		short b=67;//local variable
		System.out.println(a+b);
		System.out.println(f);
		System.out.println(z.d);
		
	}
}
