package programs;

import java.util.Scanner;

public class ReverseNo {
	
	
	public void reverseno() {
		
		long given =0;
		long reversed=0;
		System.out.println("enter :");
		Scanner scan =new Scanner(System.in);
		given=scan.nextLong
				();
		
		while(given!=0) {
			reversed=reversed*10;
			reversed=reversed+given%10;
			given=given/10;
			
			
			
		}
		
		System.out.println(reversed);
		
	}
	
	public static void main(String[] args) {
		ReverseNo rev =new ReverseNo();
		rev.reverseno();
	}
	

}
