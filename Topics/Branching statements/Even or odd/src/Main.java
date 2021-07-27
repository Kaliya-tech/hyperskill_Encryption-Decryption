import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        for (int i = 1; i > 0; i++) {
            int n = scanner.nextInt();
            if (n == 0) {
                break; 
            } else if (n % 2 != 0) {
                System.out.println("odd"); 
            } else {
                System.out.println("even");
            }
        }
    }
}
