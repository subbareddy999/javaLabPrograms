import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of integers separated by spaces: ");
        String inputLine = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        int sum = 0;
        int count = 0;
        
        System.out.println("Integers entered:");
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int num = Integer.parseInt(token);
            System.out.println(num + " ");
            sum += num; 
            count++;    
        }
        System.out.println("Sum of all integers: " + sum);
        System.out.println("Total integers entered: " + count);
        scanner.close();
    }
}