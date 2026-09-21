import java.util.Scanner;

public class Soal45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 0;

        for (int i = 1; i <= 10; i++) {
            int angka = input.nextInt();

            if (angka % 2 != 0) {
                jumlah++;
            }
        }

        System.out.print(jumlah);

        input.close();
    }
}