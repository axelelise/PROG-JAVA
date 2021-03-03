import java.util.Scanner;
public class exercice1 {
    public static void main(String[] args) {
        Scanner myObjectScanner = new Scanner(System.in);
        System.out.print("Entrez votre Verbe : ");
        String vb = myObjectScanner.next();

        if (vb.substring(vb.length() - 2).equals("er")) {
            System.out.print("1er Groupe");
        } else if (vb.substring(vb.length() - 2).equals("ir")) {
            System.out.print("2eme Groupe");
        } else {
            System.out.print("3eme Groupe");
        }
    }
}