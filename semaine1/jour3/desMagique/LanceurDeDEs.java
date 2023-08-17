package semaine1.jour3.desMagique;

import java.util.Random;

public class LanceurDeDEs {
    static Random rand = new Random();

    static int lancerDe(int faces) throws TropDeFacesException {
        if(faces > 100) {
            throw new TropDeFacesException("Trop de faces!");
        }
        return 1 + rand.nextInt(faces);
    }

    public static void main(String[] args) {
        try {
            System.out.println(lancerDe(6)); // Lancer un dé normal
            System.out.println(lancerDe(120)); // Cela provoquera une exception
        } catch(TropDeFacesException e) {
            e.printStackTrace();
        }
    }
}
