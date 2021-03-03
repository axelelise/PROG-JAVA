import java.util.Scanner;
public class exercice5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez Votre Phrase : ");
        String phrase = sc.nextLine();
        String [] PhraseArray = phrase.split("");
        int numeroLettre = 0;

        while (numeroLettre < 10){
            System.out.print(PhraseArray[numeroLettre]);
            if (PhraseArray[numeroLettre] != " "){
                numeroLettre++;
            }
        }
        System.out.print("...");
    }
}