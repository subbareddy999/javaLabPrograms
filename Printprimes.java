import java.util.Scanner;
class Printprimes {
    public static void main(String args[])  {
        Scanner sc  = new Scanner(System.in);
        int n, i, j, count = 0;
        n = sc.nextInt();

        for(i = 2; i <= n; i++) {
            count = 0;
            for(j = 2; j <=i/2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}