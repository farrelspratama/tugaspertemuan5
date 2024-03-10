import java.util.Scanner;

public class Main {

    static int PenjumlahanDeret (int n){
        int total = 0;
        
        if (n <= 0) {
            System.out.println("Nilai n harus lebih dari 0");
        } else {
            for(int i = 1; i <= n; i++){
                total += i;
            }
        }
        
        return total;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan nilai N: ");
        int n = scanner.nextInt();
        
        int hasil = PenjumlahanDeret(n);
        System.out.println("Hasil penjumlahan deret 1+2+3+...+" + n + " = " + hasil);
    }
    
}
