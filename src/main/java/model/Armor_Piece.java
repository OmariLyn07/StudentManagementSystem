package model;

import jakarta.persistence.*;

@Entity
@Table(name = "armor_piece", schema = "monsters")
public class Armor_Piece {
    @EmbeddedId
    private Armor_PieceId id;

    @Column(name = "defense")
    private Integer defense;

    @Column(name = "materials", length = 100)
    private String materials;

    @Column(name = "deco_slots")
    private Integer deco_slots;

    @Column(name = "skills", length = 200)
    private String skills;

    @MapsId("monsterHost")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "monster_host", referencedColumnName = "monster", nullable = false)
    private Monster monster;

    public Armor_Piece(){}

    public Armor_Piece(Armor_PieceId id) {
        this.id = id;

    }

    public Armor_PieceId getId() { return this.id; }
    public void setId(Armor_PieceId id) { this.id = id; }

    public Integer getDefense() { return this.defense; }
    public void setDefense(Integer defense) { this.defense = defense; }

    public String getMaterials() { return this.materials; }
    public void setMaterials(String materials) { this.materials = materials; }

    public Integer getDeco_slots() { return this.deco_slots; }
    public void setDeco_slots(Integer deco_slots) { this.deco_slots = deco_slots; }

    public String getSkills() { return this.skills; }
    public void setSkills(String skills) { this.skills = skills; }

    public Monster getMonster() { return this.monster; }
    public void setMonster(Monster monster) { this.monster = monster; }

}
