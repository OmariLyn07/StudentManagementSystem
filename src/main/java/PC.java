import java.util.ArrayList;
import java.util.HashMap;

public class PC {
    HashMap<String, ArrayList<Pokemon>> pc = new HashMap<>();

    public void addMon(Pokemon p){
        if(pc.containsKey(p.type)){
            pc.get(p.type).add(p);
        }else{
            pc.put(p.type, new ArrayList<>());
            pc.get(p.type).add(p);
        }
    }

    public void deleteMon(Pokemon p){
        String t = p.type;
        if(pc.containsKey(t)){
            pc.get(t).remove(p);
        }else{
            System.out.println("No Pokemon in PC");
        }
    }

    public Pokemon searchMon(Pokemon poke, String type){
        int i = pc.get(type).indexOf(poke);
        return pc.get(type).get(i);
    }

    public String printPC(){
        StringBuilder s = new StringBuilder();
        for(String k : pc.keySet()){
            for(Pokemon p : pc.get(k)){
                s.append(p.printStats());
                s.append("\n");
            }
        }
        return s.toString();
    }
}
