package ExamMarch8;

public class ReverseOfDigit {
	public static void main (String args[]) {
		String num="12345";
		String reverse="  ";
		for(int i=num.length()-1;i>=0;i--) {
			reverse=reverse+num.charAt(i);
		}
		System.out.println(reverse);
		
	}

}
