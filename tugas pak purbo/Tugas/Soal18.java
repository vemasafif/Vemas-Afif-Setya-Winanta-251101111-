public class Soal18 {
    public static void main(String[] args) {
        int angka = 5;

        for (int i = 1; i <= 6; i++) {
            System.out.print(angka + " ");
            angka -= 3;
            System.out.print(angka + " ");
            angka += 5;
        }
    }
}