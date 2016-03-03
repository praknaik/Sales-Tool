package demo.tool;

public class Main {
	
	public static void main (String[] args) {
		
		SalesData data = new SalesData();
		displayGreetings();
		data.display();	
		System.out.println("Test 1 \n");
		System.out.println("Test 123 \n");
	}

	private static void displayGreetings() {
		System.out.println("First GIT project \n");
		System.out.println("This App shows sales data \n");	
	}
	
}