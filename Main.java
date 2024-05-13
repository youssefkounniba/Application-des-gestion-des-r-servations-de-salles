import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter une salle");
            System.out.println("2. Supprimer une salle");
            System.out.println("3. Ajouter un enseignant");
            System.out.println("4. Supprimer un enseignant");
            System.out.println("5. Ajouter un club");
            System.out.println("6. Supprimer un club");
            System.out.println("7. Consulter les salles");
            System.out.println("8. Enregistrer une nouvelle réservation");
            System.out.println("9. Annuler une réservation");
            System.out.println("10. Consulter les réservations");
            System.out.println("0. Quitter");

            System.out.print("\nChoisissez une option : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                     // Demander les détails de la nouvelle salle à ajouter
                    System.out.print("Numéro de la salle : ");
                    int numero = scanner.nextInt();
                    
                    System.out.print("Nombre de places : ");
                    int nbPlaces = scanner.nextInt();
                    
                    // Créer une nouvelle instance de Salle avec les détails fournis
                    Salle nouvelleSalle = new Salle(numero, nbPlaces);
                    
                    // Ajouter la nouvelle salle en appelant la méthode ajouterSalle()
                    Salle.ajouterSalle(nouvelleSalle);
                    System.out.println("La salle a été ajoutée avec succès !");
                    break;
                case 2:
                     // Demander le numéro de la salle à supprimer
                    System.out.print("Numéro de la salle à supprimer : ");
                    int numeroSalle = scanner.nextInt();
                    
                    // Parcourir la liste des salles pour trouver la salle avec le numéro spécifié
                    for (Salle s : Salle.getSalles()) {
                        if (s.getNum() == numeroSalle) {
                            // Supprimer la salle en appelant la méthode statique supprimerSalle()
                            Salle.supprimerSalle(s);
                            System.out.println("La salle a été supprimée avec succès !");
                            return; // Sortir de la boucle une fois la salle supprimée
                        }
                    }
                    
                    // Si aucune salle correspondante n'est trouvée
                    System.out.println("Aucune salle trouvée avec le numéro spécifié !");
                    break;
                case 3:
                    // Demander les détails du nouveau enseignant à ajouter
                     // Demander les détails du nouveau enseignant à ajouter
                    System.out.print("Nom de l'enseignant : ");
                    String nomEnseignant = scanner.nextLine();
                    
                    System.out.print("Prénom de l'enseignant : ");
                    String prenomEnseignant = scanner.nextLine();
                    
                    System.out.print("Spécialité de l'enseignant : ");
                    String specialiteEnseignant = scanner.nextLine();
                    
                    // Créer une nouvelle instance de Enseignant avec les détails fournis
                    Enseignant nouveauEnseignant = new Enseignant(nomEnseignant, prenomEnseignant, specialiteEnseignant);
                    
                    // Ajouter le nouveau enseignant en appelant la méthode ajouterEnseignant()
                    Enseignant.ajouterEnseignant(nouveauEnseignant);
                    System.out.println("L'enseignant a été ajouté avec succès !");
                    break;
                case 4:
                    // Demander le nom, prenom et specialite de l'enseignant à supprimer
                    System.out.print("Nom de l'enseignant : ");
                    String nomEnseignantSupp = scanner.nextLine();
                    
                    System.out.print("Prénom de l'enseignant : ");
                    String prenomEnseignantSupp = scanner.nextLine();
                    
                    System.out.print("Spécialité de l'enseignant : ");
                    String specialiteEnseignantSupp = scanner.nextLine();
                    
                    // Parcourir la liste des enseignants pour trouver l'enseignant avec les détails spécifiés
                    for (Enseignant e : Enseignant.getEnseignants()) {
                        if (e.getNom().equals(nomEnseignantSupp) && e.getPrenom().equals(prenomEnseignantSupp) && e.getSpecialite().equals(specialiteEnseignantSupp)) {
                            // Supprimer l'enseignant en appelant la méthode statique supprimerEnseignant()
                            Enseignant.supprimerEnseignant(e);
                            System.out.println("L'enseignant a été supprimé avec succès !");
                            return; // Sortir de la boucle une fois l'enseignant supprimé
                        }
                    }
                    
                    // Si aucun enseignant correspondant n'est trouvé
                    System.out.println("Aucun enseignant trouvé avec les détails spécifiés !");
                    break;
                case 5:
                    // Demander les détails du nouveau club à ajouter
                    System.out.print("Nom du club : ");
                    String nomc = scanner.nextLine();
                    
                    System.out.print("Nombre d'adherents : ");
                    int nbAdr = scanner.nextInt();
                    
                     System.out.print("Dirigeant : ");
                     String dirigeantc = scanner.nextLine();
                     
                     System.out.print("Mission du club : ");
                     String missionc = scanner.nextLine();
                    
                    // Créer une nouvelle instance de Club avec les détails fournis
                    Club nouveauClub = new Club(nomc, nbAdr, dirigeantc, missionc);
                    
                    // Ajouter le nouveau club en appelant la méthode ajouterClub()
                    Club.ajouterClub(nouveauClub);
                    System.out.println("Le club a été ajouté avec succès !");
                    break;
                case 6:
                    // Demander les détails du nouveau club à supprimer
                    System.out.print("Nom du club : ");
                    String nomClub = scanner.nextLine();
                    
                    System.out.print("Nombre d'adherents : ");
                    int nbreAdrClub = scanner.nextInt();
                    
                     System.out.print("Dirigeant : ");
                     String dirigeantClub = scanner.nextLine();
                     
                     System.out.print("Mission du club : ");
                     String missionClub = scanner.nextLine();
                     
                     // Parcourir la liste des clubs pour trouver le club avec les details spécifiés
                    for (Club c : Club.getClubs()) {
                        if (c.getNom().equals(nomClub) && c.getNbreAdr() == nbreAdrClub && c.getDirigeant().equals(dirigeantClub) && c.getMission().equals(missionClub) ) {
                            // Supprimer le club appelant la méthode statique supprimerClub()
                            Club.supprimerClub(c);
                            System.out.println("Le club a été supprimé avec succès !");
                            return; // Sortir de la boucle une fois le club supprimé
                        }
                    }
                    
                    // Si aucun club correspondant n'est trouvé
                    System.out.println("Aucune club trouvé avec les details spécifiés !");
                    
                    break;
                case 7:
                    // Fonctionnalité pour consulter les salles
                     Salle.afficherSalles();
                    break;
                case 8:
                     // Demander les détails du nouvelle reservation à ajouter
                    System.out.print("le reserveur : ");
                     Object reserv = scanner.nextLine();
                    
                    System.out.print("date : ");
                    String dte = scanner.nextLine();
                    
                     System.out.print("La réservation est-elle valide ? (1 pour oui, 0 pour non) : ");
                     int valideInput = scanner.nextInt();

                    // Interpréter l'entrée de l'utilisateur et définir la valeur de valide en conséquence
                    boolean valid;
                    if (valideInput == 1) {
                        valid = true;
                    } else if (valideInput == 0) {
                        valid = false;
                    } else {
                        System.out.println("Entrée invalide. Utilisez 1 pour oui ou 0 pour non.");
                        return;
                    }
                    
                    // Créer une nouvelle instance de reservation avec les détails fournis
                    Reservation nouveauReservation= new Reservation(reserv, dte, valid);
                    
                    // Ajouter la nouvelle reservation en appelant la méthode ajouterReservation()
                    Reservation.ajouterReservation(nouveauReservation);
                    System.out.println("La reservation a été ajoutée avec succès !");
                    break;
                case 9:
                    // Fonctionnalité pour annuler une réservation
                     System.out.print("le reserveur : ");
                     Object reserveurReservation = scanner.nextLine();
                    
                    System.out.print("date : ");
                    String dateReservation = scanner.nextLine();
                    
                     System.out.print("La réservation est-elle valide ? (1 pour oui, 0 pour non) : ");
                     int valideReservation = scanner.nextInt();

                    // Interpréter l'entrée de l'utilisateur et définir la valeur de valide en conséquence
                    boolean validee;
                    if (valideReservation == 1) {
                        validee = true;
                    } else if (valideReservation == 0) {
                        validee = false;
                    } else {
                        System.out.println("Entrée invalide. Utilisez 1 pour oui ou 0 pour non.");
                        return;
                    }
                     // Parcourir la liste des reservation pour trouver la reservation avec les details spécifiés
                    for (Reservation r : Reservation.getReservations()) {
                        if (r.getReserveur().equals(reserveurReservation) && r.getDate().equals(dateReservation) && r.getValide() == validee  ) {
                            // Supprimer la Reservation appelant la méthode statique supprimerReservation()
                            Reservation.supprimerReservation(r);
                            System.out.println("La reservation a été annulée avec succès !");
                            return; // Sortir de la boucle une fois la reservation supprimé
                        }
                    }
                    
                    // Si aucune reservation correspondante n'est trouvée
                    System.out.println("Aucune reservation trouvée avec les details spécifiés !");
                    
                    break;
                case 10:
                     // Appeler la méthode statique pour consulter les réservations
                    Reservation.consulterReservations();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 0);
        
        scanner.close();
    }
}
