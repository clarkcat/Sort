import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter some numbers separated by a space: ");
        String numbers = in.nextLine();       

        System.out.println("\nYou entered : " + numbers);
        
        String[] items = numbers.split(" ");
        int[] results = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {};
        }
        
        System.out.println("\nUNSORTED RESULTS");
        System.out.print("| ");
        for (int i = 0; i < results.length; i++) {
        	System.out.print(results[i] + " | " );
        }

//      This seems cheaty, but Arrays.sort() is really the best option: http://bit.ly/ZRCXId
        Arrays.sort(results);        
        
        System.out.println("\nSORTED RESULTS:");
        System.out.print("| ");
        for (int i = 0; i < results.length; i++) {
        	System.out.print(results[i] + " | ");
        }
        
	}

}
