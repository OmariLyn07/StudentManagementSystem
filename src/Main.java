import java.util.HashMap;

public class Main {

    PC nav = new PC();
    String[] Pokedex = new String[649];

    public static void main(String[] args){

        Pokemon newMon = new Pokemon("Arcanine", 'M', 100, "Fire");
        String[] moves = {"Fire Fang","Tackle","Growl","Leer"};
        newMon.setMoveList(moves);

        newMon.printStats();

    }
}
