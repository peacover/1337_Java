
import java.util.Scanner;

class Program {

    public static boolean isPrime(int nb) {
        int sqrt = (int) Math.sqrt(nb);
        for (int i = 2; i <= sqrt; i++) {
            if (nb % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumDigit(int nb) {
        int ret = nb % 10;
        while (nb > 0) {
            nb /= 10;
            ret += nb % 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        int nb_coffee_req = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("-> ");
            int num = scanner.nextInt();
            if (num == 0 || num == 1) {
                System.out.println("IllegalArgument");
                scanner.close();
                System.exit(1);
            }
            if (num == 42) {
                System.out.println("   Count of coffee-request : " + nb_coffee_req);
                scanner.close();
                System.exit(1);
            } else if (isPrime(sumDigit(num))) {
                nb_coffee_req++;
            }
        }
    }
}
