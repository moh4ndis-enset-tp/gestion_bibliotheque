public class Livre {
    private String titre;
    private String[] auteurs;
    private String ISBN;
    private double prix;

    // Constructeur
    public Livre(String titre, String[] auteurs, String ISBN, double prix) {
        this.titre = titre;
        this.auteurs = new String[5]; // maximum 5 auteurs
        // Copie des auteurs dans le tableau
        for (int i = 0; i < Math.min(auteurs.length, 5); i++) {
            this.auteurs[i] = auteurs[i];
        }
        this.ISBN = ISBN;
        this.prix = prix;
    }

    // Getters et setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String[] getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(String[] auteurs) {
        for (int i = 0; i < Math.min(auteurs.length, 5); i++) {
            this.auteurs[i] = auteurs[i];
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Methode d'affichage
    public void afficher() {
        System.out.println("Titre: " + titre);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Prix: " + prix + " Dirhams");
        System.out.println("Auteurs:");
        for (String auteur : auteurs) {
            if (auteur != null) {
                System.out.println("- " + auteur);
            }
        }
    }
}
