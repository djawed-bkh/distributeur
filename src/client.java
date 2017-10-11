import java.util.ArrayList;

public class client {
    private int nom;
    private int prenom;
    private int code;
     static int numcompte;
    ArrayList<compte> comptes=new ArrayList<compte>();

    public client(int nom, int code,int numcompte) {
        this.nom = nom;
        this.code = code;
        this.numcompte=numcompte;
    }


   /* public String toString() {
        return "nom: "+nom+" prenom: "+prenom+"comptes"+
    }*/
}
