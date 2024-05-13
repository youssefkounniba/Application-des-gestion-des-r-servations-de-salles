import java.util.ArrayList;
import java.util.List;

//classe Enseignant
public class Enseignant{
   private String nom;
   private String prenom;
   private String specialite;
   
    // Liste pour stocker les enseignants
    private static List<Enseignant> enseignants = new ArrayList<>();
    
   //constructeur
   Enseignant(String nom,String prenom, String specialite){
       this.nom=nom;
       this.prenom=prenom;
       this.specialite=specialite;
   }
   //getters/setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    //methode pour l ajout des enseignants
    public static void ajouterEnseignant(Enseignant enseignant) {
        enseignants.add(enseignant);
    }
    
    //methode pour la supression des Enseignants
    public static void supprimerEnseignant(Enseignant enseignant) {
        enseignants.remove(enseignant);
    }
    
    //pour accéder à la liste d'enseignants
    public static List<Enseignant> getEnseignants() {
    return enseignants;
}
}
