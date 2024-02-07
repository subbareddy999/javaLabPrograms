import com.mycompany.math.Calculator;

public class packageex {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = Calculator.add(num1, num2);
        int difference = Calculator.subtract(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}