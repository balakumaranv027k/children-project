package programs;

import java.util.Scanner;

public class TrianglePattern {
	public  void withstars() {



		Scanner scan = new Scanner(System.in);
		int limit=scan.nextInt();

		int row,column=0;
		for(row =0;row<=limit;row++) {

			for (column=0;column<row;column++) {
				System.out.print("*");

			}
			System.out.println();


		}



	}

	public void withnos() {
		int starts =1;
		int limit=0;
		Scanner scanned = new Scanner(System.in);
		System.out.println("enter no :");
		limit = scanned.nextInt();
		int row,column;


		for(row=0;row<=limit;row++) {
			for(column=0;column<=row;column++) {
				System.out.print(starts+" ");
				starts=starts+1;


			}
			System.out.println();
		}


	}
	
	public static void main(String[] args) {
		TrianglePattern tri =new TrianglePattern();
		tri.withnos();
		
		
		
		
		
	}


}
