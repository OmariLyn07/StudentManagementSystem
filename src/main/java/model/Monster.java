package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "monster", schema = "monsters")
public class Monster {

    @Id
    @Column(name = "monster", length = 100)
    private String monster;

    public Monster(){}

    public Monster(String monster){
        this.monster = monster;
    }

    public String getMonster(){
        return this.monster;
    }
    public void setMonster(String monster){
        this.monster = monster;
    }
}
