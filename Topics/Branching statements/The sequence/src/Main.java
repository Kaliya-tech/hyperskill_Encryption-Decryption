import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int idx = 1;
        int count = 0;
        
        while (count < num) {
            for (int i = 0; i < idx; i++) {
                if (count >= num) {
                    break;
                }
                System.out.print(idx + " ");
                count++;
            }     
            idx++;
        }
    }
    
}
