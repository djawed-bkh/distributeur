import java.util.ArrayList;
import java.util.Scanner;

public class Banque {
    Scanner sc=new Scanner(System.in);
    private ArrayList<client> c = new ArrayList<client>();


public void menu(){
    System.out.println("bienvenu quel operation voulez vous effectuer ?");
    System.out.println("1) créer un compte ");
    System.out.println(" 2) verser de l'argent ");
    System.out.println("  3) retirer de l'argent ");
    System.out.println("   4) virer de l'argent ");
    System.out.println("    5) afficher vos comptes ");


}
/*public void authentifier(){

    System.out.println("tappez votre prenom");
    String prenom=sc.next();
    System.out.println("tappez votre code");
    int code=sc.nextInt();
    if (code==c.get(client.numcompte).code);
}*/
    public void creer(){
        String nom,prenom,;
        int code;
        System.out.println("tappez votre nom");
        nom=sc.next();
        System.out.println("tappez votre prenom");
        prenom=sc.next();
        System.out.println("quel type de compte voulez vous créer ?");
        System.out.println(" compte dollar $ tappez 1 ");
        System.out.println(" compte euro € tappez 2 ");
        int choix=sc.nextInt();
        if (choix==1){
            c.add()
        }


    }

}
