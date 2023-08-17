package semaine1.jour3.musee;

import java.util.*;

public class Musee {

    public static void main(String[] args) {
        List<PierrePrecieuse> pierres = new ArrayList<>();
        pierres.add(new PierrePrecieuse("Rubis", "Rouge"));
        pierres.add(new PierrePrecieuse("Saphir", "Bleu"));
        pierres.add(new PierrePrecieuse("Emeraude", "Vert"));

        Set<PierrePrecieuse> pierresUniques = new HashSet<>(pierres);

        Map<String, String> mapPierres = new HashMap<>();
        for(PierrePrecieuse pierre : pierres) {
            mapPierres.put(pierre.nom, pierre.couleur);
        }

        System.out.println("Pierres du musée : " + pierres);
        System.out.println("Pierres uniques du musée : " + pierresUniques);
        System.out.println("Map des pierres : " + mapPierres);
    }
}
