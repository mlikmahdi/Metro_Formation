package semaine1.jour3.musique;

public class Orchestre {
    public static void main(String[] args) {
        Instrument[] instruments = {new Violon(), new Trompette(), new Tambour()};

        for(Instrument instr : instruments) {
            instr.jouer();
            instr.accorder();
        }
    }
}
