package in.ac.jssateb.exceptionsexample;

public class Main {
	public static void main(String args[]) {
		//int a1 = 10;
		//int a = 10;
		//int b =0;
		//System.out.println("Welcome to exception handling");
		//int  c = a/b;
		//System.out.println(c);
		/* below code to get ArrayOutOfBoundEXception*/
		int[] myArray=new int[] {1,2,3};
		print(myArray);
		System.out.println("yes");// this won't be printed as exception starts from 12 to 17
	}
		
		public static void print(int[] arr) {
			System.out.println(arr[3]);
		
	}

}


//above code run time exception