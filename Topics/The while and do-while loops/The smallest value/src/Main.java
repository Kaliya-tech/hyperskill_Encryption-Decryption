import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

        long fact = 1;
        int i = 0;

        while(i <= num) {
            fact = fact / i;
            i++;
        }
        System.out.println(fact);
    }
}