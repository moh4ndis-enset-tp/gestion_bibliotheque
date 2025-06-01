public class Bibliotheque {
    private Livre[] livres;
    private int nombreLivres;

    // Constructeur
    public Bibliotheque(int capaciteMax) {
        this.livres = new Livre[capaciteMax];
        this.nombreLivres = 0;
    }

    // Methode retournant la capacite de la bibliotheque
    public int capacite() {
        return livres.length;
    }

    // Methode pour ajouter un livre
    public boolean ajoutelivre(Livre livre) {
        if (nombreLivres < livres.length) {
            livres[nombreLivres] = livre;
            nombreLivres++;
            return true;
        }
        return false;
    }

    // Methode retournant le nombre de livres dans la bibliotheque
    public int size() {
        return nombreLivres;
    }

    // Methode pour afficher tous les livres
    public void afficher() {
        System.out.println("Bibliotheque contenant " + nombreLivres + " livres:");
        for (int i = 0; i < nombreLivres; i++) {
            System.out.println("\nLivre " + (i + 1) + ":");
            livres[i].afficher();
        }
    }

    // Methode pour chercher les livres d'un auteur
    public Livre[] Cherche(String auteur) {
        // Compte le nombre de livres de l'auteur
        int count = 0;
        for (int i = 0; i < nombreLivres; i++) {
            String[] auteurs = livres[i].getAuteurs();
            for (String a : auteurs) {
                if (auteur.equals(a)) {
                    count++;
                    break;
                }
            }
        }

        // Cree un tableau pour stocker les livres trouves
        Livre[] resultat = new Livre[count];
        int index = 0;

        // Remplit le tableau avec les livres de l'auteur
        for (int i = 0; i < nombreLivres; i++) {
            String[] auteurs = livres[i].getAuteurs();
            for (String a : auteurs) {
                if (auteur.equals(a)) {
                    resultat[index] = livres[i];
                    index++;
                    break;
                }
            }
        }

        return resultat;
    }
}
