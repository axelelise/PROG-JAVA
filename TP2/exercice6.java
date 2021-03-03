import java.util.Scanner;
public class exercice6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez Votre Nom : ");
        String nom = sc.next();
        System.out.print("Entrez Votre Prénom : ");
        String prenom = sc.next();

        String NOM = nom.toUpperCase();
        int longueurNOM = NOM.length();

        String [] prenomArray = prenom.split("-");
        int nbprenom = prenomArray.length;

        String Prenom = prenomArray[0].substring(0, 1).toUpperCase() + prenomArray[0].substring(1).toLowerCase();
        int longueurPrenom = prenom.length();

        int i = 1;

        while (i < nbprenom){
            String chaquePrenom = prenomArray[i].substring(0, 1).toUpperCase() + prenomArray[i].substring(1).toLowerCase();
            Prenom = Prenom + "-" + chaquePrenom;
            i++;
        }

        System.out.print(NOM + "(" + longueurNOM + ") " + Prenom + "(" + longueurPrenom + ")");
    }
}