package model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Armor_PieceId implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "type", length = 10, nullable = false)
    private String type;

    @Column(name = "rank", length = 5, nullable = false)
    private String rank;

    @Column(name = "monster_host", length = 100, nullable = false)
    private String monsterHost;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    public Armor_PieceId(){}

    public Armor_PieceId(String type, String rank, String monsterHost, String name) {
        this.type = type;
        this.rank = rank;
        this.monsterHost = monsterHost;
        this.name = name;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getRank(){
        return this.rank;
    }
    public void setMonsterHost(String monsterHost) {
        this.monsterHost = monsterHost;
    }
    public String getMonsterHost(){
        return this.monsterHost;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

}
