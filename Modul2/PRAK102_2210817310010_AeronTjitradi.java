package Modul2;
import java.util.Scanner;
public class PRAK102_2210817310010_AeronTjitradi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_angka = input.nextInt();
        int baris = 11;
        int counter = 0;

        while (counter < baris) {
            if (input_angka % 5 == 0) {
                System.out.print((input_angka / 5) - 1);
            } else {
                System.out.print(input_angka);
            }
            if (counter < baris - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
            input_angka++;
            counter++;
        }
    }
}