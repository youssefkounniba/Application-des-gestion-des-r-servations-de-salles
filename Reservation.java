import java.util.ArrayList;
import java.util.List;

//classe reservation
public class Reservation{
   private Object reserveur; // Peut être Enseignant ou Club
   private String date;
   private boolean valide; 


  // Liste pour stocker les reservations
     private static List<Reservation> reservations = new ArrayList<>();
     
//constructeur
    Reservation(Object reserveur, String date, boolean valide){
        this.reserveur = reserveur;
        this.date = date;
        this.valide = valide;
    }
//getter & setters
  public Object getReserveur() {
        return reserveur;
    }

    public void setReserveur(Object reserveur) {
        this.reserveur = reserveur;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getValide() {
        return valide;
    }

    public void setValide(boolean valide) {
        this.valide = valide;
    }
    
    //methode pour l ajout de reservation
    public static void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
    }
    
    //methode pour l'annulation' des reservations
    public static void supprimerReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

     // Méthode pour consulter les réservations
    public static void consulterReservations() {
        System.out.println("Liste des réservations :");
        for (Reservation r : reservations) {
            System.out.println("Reserveur : " + r.getReserveur() + ", Date : " + r.getDate() + ", Valide : " + r.getValide());
        }
    }
    
    //pour accéder à la liste des reservation
    public static List<Reservation> getReservations() {
    return reservations;
}
}