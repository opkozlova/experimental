public class Main
 {
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, Olga and Alexey");
	System.out.println("One more line here");
	int z = 1;
	int x = 2;
	System.out.println("Sum of " + z + " and " + x + " equals " + sum(z, x) + ".");
	System.out.println("2 * 2 = " + mult(2, 2));

    }
    
    public static int sum(int a, int b) {
    	return a + b;
    }

    public static int mult(int a, int b){
	return a * b;
    }
 }
