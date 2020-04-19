import java.util.Scanner;

public class Etudiant {
    private Individuel personne;
    private String CNE;
    private String Promotion;
    private String Class;
    private String Filere;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer votre Nom:");
        String nom= scanner.nextLine();
        System.out.println("Entrer votre Prenom:");
        String prenom= scanner.nextLine();
        System.out.println("Entrer votre Date de naissance");
        int date=scanner.nextInt();
        scanner.close();
        System.out.println("Votre nom est :" +nom);
        System.out.println("Votre prenom est :" +prenom);
        System.out.println("Votre age est :" +(2020-date));
        Individuel ahmed= new Individuel();

    }
}
