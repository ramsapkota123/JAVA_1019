package control;

public class BreakExample {

	public static void main(String[] args) {
		//for loop
		System.out.println();
		for(int i=1;i<=10;i++) {
			//System.out.println("it prints all the valu of loop "+i);
			if(i==5) {
				break;
				
			}
			//System.out.println("after break "+i);
		}
		
		
		//Do while loop
		int j=0;
		do {
			if(j==5) {
				break;
			}
			//System.out.println(j);
			j++;
		}while(j<=10);
		
		//for each loop
		int[]arr= {1,2,3,4,5,6,7,8,9};
		for(int num:arr) {
			if(num==5) {
				break;
			}
			System.out.println(num);
		}

	}

}
