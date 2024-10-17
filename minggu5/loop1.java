package minggu5;

public class loop1 {
    public static void main(String[] args) {
        int start = 1;
        for (int z = 1; z <= 4; z++) {
            int jumlahAngka;
            if (z == 3) {
                jumlahAngka = 4;
            } else{
                jumlahAngka = 5;
            }
            for (int b = 1; b <= jumlahAngka; b++) {
                if (start == 6 || start == 12 || start == 17) {
                    start++;
                }
                System.out.print(start + " ");
                start++;
            }
            System.out.println(); 
        }
    }
}
    

