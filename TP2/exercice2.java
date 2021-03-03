import java.util.Scanner;
public class exercice2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ecrire Votre Phrase : ");
        String phrase = sc.nextLine();
        int longueurPhrase = phrase.replaceAll(" ", "").length();

        if (longueurPhrase < 20){
            System.out.print("Phrase Courte (" + longueurPhrase + ")");
        }
        else if (longueurPhrase > 50){
            System.out.print("Phrase Longue (" + longueurPhrase + ")");
        }
        else {
            System.out.print("Phrase De Longueur Moyenne (" + longueurPhrase + ")");
        }
    }
}