import java.util.Scanner;

public class Temperature {
	public static void main(String[] args){
		String input;
		double celcius;
		double fahrenheit;
		Scanner terminal = new Scanner(System.in);

		System.out.println("Please enter a temperature in Celcius:");
		
		while (!terminal.hasNextDouble()) {
			input = terminal.next();
			System.out.printf("\"%s\" is not a valid temperature.\n", input);
			System.out.println("Please enter a valid temperature in Celcius:");
        }
        celcius = terminal.nextDouble();		
		fahrenheit = celcius * 9/5  + 32;
		System.out.println(celcius + " C = " + fahrenheit + " F");	
	}
}
