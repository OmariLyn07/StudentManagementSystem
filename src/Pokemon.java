

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

    public void setMoveList(String[] moves){
        int i = 0;
        for(String s : moves){
            this.moveList[i] = s;
            i++;
        }

    }
    private void getMoveList(){
        for (String s : moveList) {
            System.out.println(s);
        }
    }
    public void setNickname(String name){
        this.nickname = name;
    }

    public void printStats(){
        System.out.printf("%s %c%n%s%nLevel:%d%n%s, %s, %s, %s%n", this.name, this.gender, this.type, this.level, this.moveList[0],
                this.moveList[1],this.moveList[2],this.moveList[3]);
    }

}
