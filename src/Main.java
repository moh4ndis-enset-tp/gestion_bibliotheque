// filepath: /Users/admin/IdeaProjects/n7/Problem2/src/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Test de la classe Livre");

        // Creation d'un livre
        String[] auteurs1 = {"Victor Hugo", "Alexandre Dumas"};
        Livre livre1 = new Livre("Les Misérables", auteurs1, "978-2-07-040089-2", 150.50);

        // Affichage des caracteristiques du livre
        System.out.println("\nCaracteristiques du livre 1:");
        livre1.afficher();

        // Test de la classe Bibliotheque
        System.out.println("\n\nTest de la classe Bibliotheque");

        // Creation d'une bibliotheque avec une capacite de 5 livres
        Bibliotheque biblio = new Bibliotheque(5);
        System.out.println("Capacite de la bibliotheque: " + biblio.capacite());

        // Ajout de plusieurs livres
        String[] auteurs2 = {"J.K. Rowling"};
        Livre livre2 = new Livre("Harry Potter", auteurs2, "978-2-07-057102-9", 200.75);

        String[] auteurs3 = {"Agatha Christie", "Arthur Conan Doyle"};
        Livre livre3 = new Livre("Sherlock Holmes", auteurs3, "978-2-253-09634-9", 120.25);

        String[] auteurs4 = {"Victor Hugo", "Emile Zola"};
        Livre livre4 = new Livre("Notre-Dame de Paris", auteurs4, "978-2-08-703821-2", 175.00);

        // Ajout des livres a la bibliotheque
        biblio.ajoutelivre(livre1);
        biblio.ajoutelivre(livre2);
        biblio.ajoutelivre(livre3);
        biblio.ajoutelivre(livre4);

        // Affichage du nombre de livres et des livres
        System.out.println("\nNombre de livres dans la bibliotheque: " + biblio.size());
        biblio.afficher();

        // Test de la methode Cherche
        System.out.println("\n\nRecherche des livres de Victor Hugo:");
        Livre[] livresHugo = biblio.Cherche("Victor Hugo");
        for (Livre livre : livresHugo) {
            if (livre != null) {
                livre.afficher();
                System.out.println();
            }
        }
    }
}

