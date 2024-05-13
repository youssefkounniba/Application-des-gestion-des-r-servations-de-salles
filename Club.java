import java.util.ArrayList;
import java.util.List;

//classe Club
public class Club{
   private String nom;
   private int nbreAdr;
   private String dirigeant;
   private String mission;
   
    // Liste pour stocker les clubs
     private static List<Club> clubs = new ArrayList<>();
    
   //constructeur
   Club(String nom,int nbreAdr,String dirigeant,String mission){
       this.nom= nom;
       this.nbreAdr= nbreAdr;
       this.dirigeant=dirigeant;
       this.mission=mission;
   }
   
    // Getters et setters 
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public int getNbreAdr() {
        return nbreAdr;
    }

    public void setNbreAdr(int nbreAdr) {
        this.nbreAdr = nbreAdr;
    }

    public String getDirigeant() {
        return dirigeant;
    }

    public void setDirigeant(String dirigeant) {
        this.dirigeant = dirigeant;
    }

    
    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

   
   //methode pour l ajout du club
    public static void ajouterClub(Club club) {
        clubs.add(club);
    }
    
    //methode pour la supression du club
    public static void supprimerClub(Club club) {
        clubs.remove(club);
    }

    // Methode pour obtenir la liste des clubs
    public static List<Club> getClubs() {
        return clubs;
    }
    
   

}
