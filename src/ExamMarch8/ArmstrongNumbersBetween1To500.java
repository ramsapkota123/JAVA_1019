package ExamMarch8;

public class ArmstrongNumbersBetween1To500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

        for (int num = 1; num <= 500; num++) {
            int sum = 0;
            String numberStr = Integer.toString(num);

            for (int i = 0; i < numberStr.length(); i++) {
                int digit = numberStr.charAt(i) - '0'; 
                sum += Math.pow(digit, 3); 
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}