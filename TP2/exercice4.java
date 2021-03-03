import java.util.Locale;
import java.util.Scanner;
public class exercice4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez Votre Nom : ");
        String nom = sc.next();
        System.out.print("Entrez Votre Prénom : ");
        String prenom = sc.next();

        String NOM = nom.toUpperCase();
        int longueurNOM = NOM.length();
        String Prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();
        int longueurPrenom = Prenom.length();

        System.out.print(NOM + "(" + longueurNOM + ") " + Prenom + "(" + longueurPrenom + ")");
    }
}