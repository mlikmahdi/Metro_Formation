package semaine1.jour3.musique;

abstract class Instrument {
    abstract void jouer();
    void accorder() {
        System.out.println("L'instrument est accordé.");
    }
}
