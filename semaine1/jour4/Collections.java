package semaine1.jour4;

import java.util.*;

public class Collections {

    /*
    - Le Java Collections Framework "JCF" est un ensemble d'outils pour aider à manipuler des groupes de données.
    - Une `List` est une collection ordonnée.
    - Un `Set` ne permet pas les doublons.
    - Une `Map` stocke des associations clé/valeur.
     */

    public static void main(String[] args) {
        /*
         Dans Java, une List est exactement cela: une collection ordonnée d'éléments où vous pouvez insérer ou supprimer des éléments.
         */
        List<String> wishlist = new ArrayList<>();
        wishlist.add("Voyage à Paris");
        wishlist.add("Chocolat");
        wishlist.add("Livre sur Java");
        System.out.println(wishlist);


        /*
        Supposons que vous ayez un panier de fruits, et que vous décidiez de n'ajouter que des fruits uniques, évitant ainsi d'avoir des doublons.
        En Java, un Set est conçu exactement pour cela : il ne permet pas les doublons.
         */
        Set<String> fruits = new HashSet<>();
        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Pomme"); // Ce fruit ne sera pas ajouté à nouveau
        System.out.println(fruits);


        /*
        Si vous deviez associer chaque pays à sa capitale, comment le feriez-vous? En Java, nous utilisons Map pour cela.
        Une Map est une collection qui stocke des associations clé/valeur.
         */
        Map<String, String> countries = new HashMap<>();
        countries.put("France", "Paris");
        countries.put("Japon", "Tokyo");
        System.out.println(countries.get("France")); // Affiche "Paris"
    }
}
