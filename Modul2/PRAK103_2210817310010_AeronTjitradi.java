package Modul2;
import java.util.Scanner;
public class PRAK103_2210817310010_AeronTjitradi {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int N = input.nextInt();
            int bilanganAwal = input.nextInt();
            int i = 0;
            int bilanganSaatIni = bilanganAwal;

            do {
                if (bilanganSaatIni % 2 != 0) {
                    System.out.print(bilanganSaatIni);
                    if (i < N - 1) {
                        System.out.print(", ");
                    }
                    i++;
                }
                bilanganSaatIni++;
            } while (i < N);
            System.out.println();
        }
    }