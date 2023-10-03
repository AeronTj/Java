package Modul2;
import java.util.Scanner;
public class PRAK104_2210817310010_AeronTjitradi {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Tangan Abu: ");
            String[] tanganAbu = scanner.nextLine().split(" ");

            System.out.print("Tangan Bagas: ");
            String[] tanganBagas = scanner.nextLine().split(" ");

            int poinAbu = 0;
            int poinBagas = 0;

            for (int i = 0; i < 3; i++) {
                String tanganRondeAbu = tanganAbu[i];
                String tanganRondeBagas = tanganBagas[i];

                if (tanganRondeAbu.equals(tanganRondeBagas)) {
                    continue;
                } else if ((tanganRondeAbu.equals("B") && tanganRondeBagas.equals("G"))
                        || (tanganRondeAbu.equals("G") && tanganRondeBagas.equals("K"))
                        || (tanganRondeAbu.equals("K") && tanganRondeBagas.equals("B"))) {
                    poinAbu++;
                } else {
                    poinBagas++;
                }
            }

            String hasil;
            if (poinAbu > poinBagas) {
                hasil = "Abu";
            } else if (poinBagas > poinAbu) {
                hasil = "Bagas";
            } else {
                hasil = "Seri";
            }

            System.out.println(hasil);
        }
    }
