import java.util.ArrayList;
import java.util.List;

//classe salle
public class Salle{
    private int num;
    private int nbrePlace;
    
     // Liste pour stocker les salles
     private static List<Salle> salles = new ArrayList<>();
    
    //constructeur
     Salle(int num, int nbreplace){
        this.num = num;
        this.nbrePlace = nbreplace;
}

    //getters & setters
     public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
     public int getNbrePlace(){
        return nbrePlace;
    }

    public void setNmbrePlace(int nbrePlace) {
        this.nbrePlace = nbrePlace;
    }
    
    //methode pour l'ajout de salle
    public static void ajouterSalle(Salle salle) {
        salles.add(salle);
    }
    
    //methode pour la supression des salles
    public static void supprimerSalle(Salle salle) {
        salles.remove(salle);
    }
    
    //methode pour afficher la Liste des salles
     public static void afficherSalles() {
        System.out.println("Liste des salles :");
        for (Salle s : salles) {
            System.out.println("Numéro de la salle : " + s.getNum() + ", Nombre de places : " + s.getNbrePlace());
        }
}
    //pour accéder à la liste des salles 
    public static List<Salle> getSalles() {
        return salles;
    }
}
    
    
