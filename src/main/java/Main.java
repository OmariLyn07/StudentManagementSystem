public class Main {

    static PC nav = new PC();
    static String[] Pokedex = new String[649];
    static String[] RandomMon = {"Pikachu", "Charizard", "Venasaur", "Blastoise"};
    static String[] Genders = {"M", "F"};
    static String[] Type = {"Electric", "Fire", "Water", "Grass"};

    public static void main(String[] args){

        RandomFields r = new RandomFields();
        Pokemon newMon;
        //Create a loop that generates 4 random monsters

        //newMon.setMoveList(r.generateMoves());

        //nav.addMon(newMon);

        nav.printPC();

    }
}
