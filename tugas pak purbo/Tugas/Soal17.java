public class Soal17 {
    public static void main(String[] args) {
        int angka = 2;

        for (int i = 1; i <= 5; i++) {
            System.out.print(angka + " ");
            angka += 10;
            System.out.print(angka + " ");
            angka -= 5;
        }
    }
}