package control;

public class Continue {

	public static void main(String[] args) {
		//for loop
				System.out.println();
				for(int i=1;i<=10;i++) {
					//System.out.println("it prints all the valu of loop "+i);
					if(i==5) {
						continue;
						
					}
					//System.out.println("after break "+i);
				}
				
				
				//Do while loop
				int j=0;
				do {
					j++;
					if(j==5) {
						continue;
					
					}
					//System.out.println(j);
					
				}while(j<=10);
				
				//for each loop
				int[]arr= {1,2,3,4,5,6,7,8,9};
				for(int num:arr) {
					if(num==5) {
						continue;
					}
					System.out.println(num);
				}

			


	}

}
