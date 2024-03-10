import java.util.Scanner;

public class Main {
    static int JumlahBilanganGanjil (int Min, int Max) {
        int count = 0;
        
        for (int i = Min; i <= Max; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan batas awal");
        int Min = scanner.nextInt();
        
        System.out.println("Masukan batas akhir");
        int Max = scanner.nextInt();
        
        int count = JumlahBilanganGanjil(Min, Max);
        
        System.out.println("\nJumlah bilangan ganjil dari " + Min + " hingga " + Max + " adalah: " + count);
    }
}
