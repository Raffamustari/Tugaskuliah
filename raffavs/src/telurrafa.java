import java.util.Scanner;

public class telurrafa {
    public static void main(String[] args) {;
        Scanner input = new Scanner(System.in);
        double kg = 28000;
        System.out.println("jumlah telur(kg):");
        double jt = input.nextDouble();
        double th = jt*kg;
        System.out.println("uang pembayaran");
        double up = input.nextDouble();
        double uk = up-th;
        System.out.println("");

        System.out.println("jumlah telu:" + jt + "kg");
        System.out.println("total pembelian: RP " + th);
        System.out.println("kembalian: Rp " + uk);
        
        input.close();
    }
    
}
