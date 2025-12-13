package model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "elemental_attk", schema = "monsters")
public class elemental_attk implements Serializable {

    @Id
    @Column(name = "armor", length = 100, nullable = false)
    private String armor;

    @Column(name = "fire")
    private Integer fire;

    @Column(name = "water")
    private Integer water;

    @Column(name = "thunder")
    private Integer thunder;

    @Column(name = "ice")
    private Integer ice;

    @Column(name = "dragon")
    private Integer dragon;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "armor", referencedColumnName = "name", insertable = false, updatable = false)
    private Armor_Piece armorPiece;

    public elemental_attk() {}

    public String getArmor() { return this.armor; }
    public void setArmor(String armor) { this.armor = armor; }

    public Integer getFire() { return this.fire; }
    public void setFire(Integer fire) { this.fire = fire; }

    public Integer getWater() { return this.water; }
    public void setWater(Integer water) { this.water = water; }

    public Integer getThunder() { return this.thunder; }
    public void setThunder(Integer thunder) { this.thunder = thunder; }

    public Integer getIce() { return this.ice; }
    public void setIce(Integer ice) { this.ice = ice; }

    public Integer getDragon() { return this.dragon; }
    public void setDragon(Integer dragon) { this.dragon = dragon; }

    public Armor_Piece getArmorPiece() { return this.armorPiece; }
    public void setArmorPiece(Armor_Piece armorPiece) { this.armorPiece = armorPiece; }

}
