import java.util.Scanner;
public class exercice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ecrire Votre Mot : ");
        String mot = sc.nextLine();

        char premiereLettre = mot.charAt(0);
        char DerniereLettre = mot.charAt(mot.length() - 1);
        int longueurmot = mot.length();

        System.out.println("Votre premiere lettre est : " + premiereLettre);
        System.out.println("Votre derniere lettre est : " + DerniereLettre);
        System.out.println("La longueur de votre mot est : " + longueurmot);
    }
}