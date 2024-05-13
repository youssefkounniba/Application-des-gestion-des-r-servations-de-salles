import java.util.ArrayList;
import java.util.List;

public class SalleTP extends Salle{
    private String specialite;
    //constructeur
    SalleTP(int num, int nbrePlace, String specialite){
        super(num, nbrePlace);
        this.specialite=specialite;
    }
    
    //getters & setters
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite =specialite;
    }
}