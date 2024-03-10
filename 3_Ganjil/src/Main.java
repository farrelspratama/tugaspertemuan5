import java.util.Scanner;

public class Main {
    static int Faktorial (int n) {
        if (n < 0) {
            System.out.println("Masukkan nilai n harus lebih dari atau sama dengan 0.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.print(n + "! = ");
            for (int i = n; i >= 1; i--) {
                System.out.print(i);
                if (i != 1) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" = " + factorial);
        }
        return n;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        
        Faktorial(n);
    }
}
