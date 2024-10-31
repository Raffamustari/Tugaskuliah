package minggu5;



import java.util.ArrayList;
import java.util.Scanner;

public class casemethod6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah data untuk nama dan nilai
        System.out.print("Masukkan jumlah data: ");
        int numData = scanner.nextInt();

        // Membuat ArrayList untuk menyimpan nama dan nilai
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Integer> nilai = new ArrayList<>();

        // Input data nama dan nilai
        for (int i = 1; i <= numData; i++) {
            System.out.println("\nData ke-" + i + ":");
            System.out.print("Nama: ");
            nama.add(scanner.next());
            System.out.print("Nilai: ");
            nilai.add(scanner.nextInt());
        }

        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("=====================");
        System.out.println("No\tNama\tNilai\tStatus");

        // Menghitung total nilai dan jumlah yang lulus
        int totalNilai = 0;
        int jumlahLulus = 0;

        for (int i = 0; i < nama.size(); i++) {
            System.out.print((i + 1) + "\t" + nama.get(i) + "\t" + nilai.get(i) + "\t");
            if (nilai.get(i) >= 60) {
                System.out.println("Lulus");
                jumlahLulus++;
            } else {
                System.out.println("Tidak Lulus");
            }
            totalNilai += nilai.get(i);
        }

        // Menghitung rata-rata nilai
        double rataRata = (double) totalNilai / nilai.size();

        // Menampilkan hasil
        System.out.println("\nJumlah nilai: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);
        System.out.println("Jumlah Lulus: " + jumlahLulus);
    }
}