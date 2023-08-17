package semaine1.jour3.heros;

public class SuperHeros {
    String nom;
    String puissance;
    String faiblesse;

    SuperHeros(String nom, String puissance, String faiblesse) {
        this.nom = nom;
        this.puissance = puissance;
        this.faiblesse = faiblesse;
    }

    void afficherDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Puissance: " + puissance);
        System.out.println("Faiblesse: " + faiblesse);
    }

    public static void main(String[] args) {
        SuperHeros ironMan = new SuperHeros("Iron Man", "Armure", "Cœur");
        SuperHeros hulk = new SuperHeros("Hulk", "Force", "Colère");

        ironMan.afficherDetails();
        hulk.afficherDetails();
    }
}
