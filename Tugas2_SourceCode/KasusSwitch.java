// Nim 13020210126
// Nama:Nuraziza yunus
// 24 Maret 2023 15.49
import java.util.Scanner;
public class KasusSwitch {
    /**
     * @param args
     */
    public static void main(String[] args) {
        char cc;
        Scanner masukan = new Scanner(System.in);
        /* Program */
        System.out.print("Ketikkan sebuah huruf, akhiri dengan RETURN \n");
        cc = masukan.next().charAt(0);
        switch (cc) {
            case 'a' -> {
                System.out.print(" Yang anda ketik adalah a\n");
            }
            case 'i' -> {
                System.out.print(" Yang anda ketik adalah i\n");
            }
            case 'u' -> {
                System.out.print(" Yang anda ketik adalah u\n");
            }
            case 'e' -> {
                System.out.print(" Yang anda ketik adalah e\n");
            }
            case 'o' -> {
                System.out.print(" Yang anda ketik adalah o\n");
            }
            default -> System.out.print(" Yang anda ketik adalah huruf mati\n");
        }
    }
}