import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int nextN = 0;
        String result = "";

        StringBuilder sequence = new StringBuilder(result);

        while (nextN != 1) {
            if (num % 2 == 0) {
                nextN = num / 2;
                sequence.append(nextN);
            } else {
                nextN = num * 3 + 1;
                sequence.append(nextN);
            }
        }
        System.out.println(sequence);
    }
}