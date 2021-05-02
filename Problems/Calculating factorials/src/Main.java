import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long factorial = 1;
        if (n == 0){
            n = 1;
        }
        else if ( n!= 0) {
            while (n != 0) {
                factorial = factorial * n;
                //System.out.println(factorial);
                n--;
            }
        }

        return factorial;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}