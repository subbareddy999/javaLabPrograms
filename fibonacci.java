import java.util.*;
class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, a = 1, b = 1, c, count = 3;
        n = sc.nextInt();
        c = a + b;

        if(n == 1) {
            System.out.println("Fibonacci of 1 term: 1");
        }
        else if (n == 2) {
            System.out.println("Fibonacci of 2 term: 1");
        }
        else {
            while(count < n) {
                a = b;
                b = c;
                c = a + b;
                count++;
            }
            System.out.println("Fibonacci of " + n + " term: " + c);
        }
        sc.close();
    }
}