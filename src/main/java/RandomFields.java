import java.util.ArrayList;
import java.util.Random;

public class RandomFields {
    ArrayList<String> moveList = new ArrayList<>();
    String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    StringBuilder sb = new StringBuilder(5);
    Random random = new Random();

    public RandomFields(){
        int i = 0;
        while(i < 100){
            for(int k = 0; k < 5; k++){
                sb.append(alphanumeric.charAt(random.nextInt(alphanumeric.length())));
            }
            moveList.add(sb.toString());
            i++;
            sb = new StringBuilder();
        }
    }
    public String[] generateMoves(){
        String[] s = new String[4];
        for(int i = 0; i < s.length; i++){
            s[i] = moveList.get(i);
        }

        return s;
    }
}
