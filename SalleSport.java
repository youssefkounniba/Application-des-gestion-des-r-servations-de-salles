import java.util.ArrayList;
import java.util.List;

public class SalleSport extends Salle{
    private String nom;
    //constructeur
    SalleSport(int num, int nbrePlace, String nom){
        super(num,nbrePlace);
        this.nom=nom;
    }
    
    //getters & setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}