package src;

import model.Bus;
import model.Conducteur;
import model.Ligne;
import model.Station;
import model.Trajet;
import services.BusService;
import services.BusServiceImpl;
import services.ConducteurService;
import services.ConducteurServiceImpl;
import services.LigneService;
import services.LigneServiceImpl;
import services.TrajetService;
import services.TrajetServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BusService busService = new BusServiceImpl();
        ConducteurService conducteurService = new ConducteurServiceImpl();
        LigneService ligneService = new LigneServiceImpl();
        TrajetService trajetService = new TrajetServiceImpl();

        // Création de quelques lignes de bus
        Ligne ligne1 = new Ligne(1, "Ligne 1", 10, 100);
        Ligne ligne2 = new Ligne(2, "Ligne 2", 15, 150);
        ligneService.addLigne(ligne1);
        ligneService.addLigne(ligne2);

        // Ajout de quelques bus
        Bus bus1 = new Bus(1, "AA-123-BB", "Tata", 50000, 50, ligne1, true);
        Bus bus2 = new Bus(2, "CC-456-DD", "Car Rapide", 60000, 40, ligne1, true);
        Bus bus3 = new Bus(3, "EE-789-FF", "DDK", 70000, 60, ligne2, true);
        Bus bus4 = new Bus(4, "GG-012-HH", "Tata", 80000, 50, ligne2, false);
        busService.addBus(bus1);
        busService.addBus(bus2);
        busService.addBus(bus3);
        busService.addBus(bus4);
        // Ajout de quelques conducteurs
        Conducteur conducteur1 = new Conducteur(1, "C-001", "John Doe", "123456789", "Permis Lourd");
        Conducteur conducteur2 = new Conducteur(2, "C-002", "Jane Smith", "987654321", "Permis Leger");
        conducteurService.addConducteur(conducteur1);
        conducteurService.addConducteur(conducteur2);
        // Planification de trajets
        Trajet trajet1 = new Trajet(1, "Aller", "2023-10-01", 100, bus1, ligne1, conducteur1);
        Trajet trajet2 = new Trajet(2, "Retour", "2023-10-01", 80, bus2, ligne1, conducteur2);
        trajetService.planifierTrajet(trajet1);
        trajetService.planifierTrajet(trajet2);

        // Liste des bus
        System.out.println("Liste des bus:");
        List<Bus> allBuses = busService.listBuses();
        allBuses.forEach(bus -> System.out.println(bus.getImmatriculation()));

        // Décommissionner un bus
        busService.decommissionBus(2);
        System.out.println("\nBus 2 décommissionné.");

        // Liste des bus par ligne
        System.out.println("\nBus de la ligne 1:");
        List<Bus> busesByLine1 = busService.getBusesByLine(1);
        busesByLine1.forEach(bus -> System.out.println(bus.getImmatriculation()));

        // Liste des bus hors service
        System.out.println("\nBus hors service:");
        List<Bus> busesOutOfService = busService.getBusesOutOfService();
        busesOutOfService.forEach(bus -> System.out.println(bus.getImmatriculation()));

        // Liste des trajets planifiés
        System.out.println("\nTrajets planifiés:");
        List<Trajet> allTrajets = trajetService.listTrajets();
        allTrajets.forEach(trajet -> System.out.println(trajet.getId() + " - " + trajet.getType()));

        // Statistiques
        System.out.println("\nStatistiques:");
        System.out.println("Lignes disponibles à une date:");
        List<Ligne> lignesDispo = ligneService.getLignesDisponibles("2023-10-01");
        lignesDispo.forEach(ligne -> System.out.println(ligne.getNom()));

        System.out.println("\nBus disponibles par ligne:");
        List<Bus> busesDispo = busService.getBusesByLine(1);
        busesDispo.forEach(bus -> System.out.println(bus.getImmatriculation()));

        System.out.println("\nBus en panne:");
        List<Bus> busesPanne = busService.getBusesOutOfService();
        busesPanne.forEach(bus -> System.out.println(bus.getImmatriculation()));

        System.out.println("\nNombre de tickets vendus par trajet:");
        allTrajets.forEach(trajet -> System.out.println(trajet.getId() + " - " + trajet.getTicketsVendus()));

        System.out.println("\nMontant total des tickets vendus par bus et par ligne:");
        // Calculer et afficher le montant total des tickets vendus par bus et par ligne
        allBuses.forEach(bus -> {
            int totalTickets = allTrajets.stream()
                .filter(trajet -> trajet.getBus().getId() == bus.getId())
                .mapToInt(Trajet::getTicketsVendus)
                .sum();
            System.out.println("Bus " + bus.getImmatriculation() + ": " + totalTickets + " tickets vendus");
        });
    }
}