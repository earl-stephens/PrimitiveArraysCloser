package application;

public class App {

	public static void main(String[] args) {
		
		//Java holds memory for the int on declaration
		int value;
		value = 123;
		System.out.println(value);
		
		//this is a variable that refers to an array of ints
		int[] values = null;
		System.out.println(values);
		
		//this step actually creates the array (Java allocates
		//memory and stores the address)
		//Java initializes the elements to 0
		values = new int[3];

		for(int n: values) {
			System.out.println(n);
		}
	}

}
