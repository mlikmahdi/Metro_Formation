package semaine1.jour1;

// importation de la class Scanner qui va permettre de lire l'entrée de l'utilisateur
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Calc {

    // définition du point d'entrée du programme en JAVA avec la méthode main()
    public static void main(String[] args) {

        // instanciation de l'objet Scanner
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir une série de nombres.
        System.out.println("Veuillez entrer une série de nombres (entrez 'q' pour terminer) : ");

        // Utiliser une boucle pour lire ces nombres jusqu'à ce que l'utilisateur entre un certain caractère (par exemple 'q') pour indiquer qu'il a terminé.

        // Je déclare un objet de type List nommé numbers
        List<Integer> numbers = new ArrayList<>();

        // je récupère et j'ajoute dans mon objet List numbers les nombres entrée dans l'interface via l'objet Scanner
        while(scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Calcule de la somme, le nombre le plus élevé et le plus bas et enfin la moyenne
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // je parcours l'ensemble de mes nombres dans mon objet List numbers pour déterminer qui est le plus petit et le plus élévé en comparnat la nouvelle entrée avec l'ancienne
        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        // je calcule la moyenne de mes nombres
        double average = (double) sum / numbers.size();

        // enfin j'affiche les résultats
        System.out.println("Somme : " + sum);
        System.out.println("Moyenne : " + average);
        System.out.println("Nombre le plus bas : " + min);
        System.out.println("Nombre le plus élevé : " + max);
    }
}