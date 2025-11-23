

public class Pokemon {
    String name;
    char gender;
    int level;
    String type;
    String[] moveList = {"-", "-", "-", "-"};
    String nickname;

    public Pokemon(String name, char gender, int level, String type){
        this.name = name;
        this.gender = gender;
        this.level = level;
        this.type = type;
    }

    public void setMoveList(int position, String move){
        this.moveList[position] = move;

    }
    public void getMoveList(){
        for (String s : moveList) {
            System.out.println(s);
        }
    }
    public void setNickname(String name){
        this.nickname = name;
    }

}
