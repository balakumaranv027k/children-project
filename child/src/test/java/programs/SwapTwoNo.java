package programs;

public class SwapTwoNo {

	public void swapnos () {

		int firstsalary = 1000;
		int secondsalary =2000;
		System.out.println("before swap first salary is "+firstsalary +" and second salary is :"+secondsalary);

		int newsalary=firstsalary;

		firstsalary=secondsalary;
		secondsalary=newsalary;
		System.out.println("after swap first salary is "+firstsalary +" and second salary is :"+secondsalary);


	}


	public void without3rdvariable() {
		int no1=1000;
		int no2=1200;

		System.out.println("after swap first salary is "+no1 +" and second salary is :"+no2);

		no1=no1-no2;
		no2=no1+no2;
		no1=no2-no1;


		System.out.println("after swap first salary is "+no1+" and second salary is :"+no2);

	}





	public static void main(String[] args) {
		SwapTwoNo no =new SwapTwoNo();
		no.swapnos();
		no.without3rdvariable();
	}
}
