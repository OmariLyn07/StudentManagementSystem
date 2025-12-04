import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.BufferedWriter;

public class Main {

    static BufferedWriter writer;
    static PC nav = new PC();
    static Pokemon[] Pokedex = new Pokemon[649];
    static String[] RandomMon = {"Pikachu", "Charizard", "Venasaur", "Blastoise"};
    static char[] Genders = {'M', 'F'};
    static String[] Type = {"Electric", "Fire", "Water", "Grass"};

    public static void main(String[] args){
        Random rand = new Random();
        RandomFields r = new RandomFields();
        Pokemon newMon;

        for(int i = 0; i < 4; i++){
            newMon = new Pokemon(RandomMon[rand.nextInt(RandomMon.length)],Genders[rand.nextInt(Genders.length)],100,Type[rand.nextInt(Type.length)]);
            newMon.setMoveList(r.generateMoves());
            nav.addMon(newMon);
            Pokedex[i] = newMon;
        }
        /*
        try {
            writer = new BufferedWriter(new FileWriter());
            writer.write(nav.printPC());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        */

    }


}
