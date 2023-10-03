package semaine1.jour5;

public class Date {
    private Date date;

    public void afficherDate() {
        date = new Date();
        System.out.println("La date actuelle est : " + date);
    }

    public static void main(String[] args) {
        Date dateActuel = new Date();
        dateActuel.afficherDate();
    }
}
