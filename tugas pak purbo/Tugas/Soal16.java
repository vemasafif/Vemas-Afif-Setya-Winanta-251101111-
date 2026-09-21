public class Soal16 {
    public static void main(String[] args) {
        int angka = 1;

        for (int i = 1; i <= 6; i++) {
            System.out.print(angka + " ");
            angka += 4;
            System.out.print(angka + " ");
            angka -= 2;
        }
    }
}