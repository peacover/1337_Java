
import java.util.Scanner;

class Program {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("-> ");
            int myNum = scanner.nextInt();
            if (myNum <= 1) {
                System.err.println("   IllegalArgument");
                System.exit(-1);
            }
            int nb_steps = 1;
            boolean is_prime = true;
            int sqrt = (int) Math.sqrt(myNum);
            for (int i = 2; i <= sqrt; i++) {
                if (myNum % i == 0) {
                    is_prime = false;
                    break;
                }
                nb_steps++;
            }
            System.out.println("   " + is_prime + " " + nb_steps);
        }
    }
}
