import java.util.HashMap;

public class PC {
    HashMap<String, Pokemon> pc = new HashMap<>();

    public void addMon(Pokemon p){
        pc.put(p.type, p);
    }

    public void deleteMon(Pokemon p){

    }

    public Pokemon searchMon(Pokemon p){

        return p;
    }
}
