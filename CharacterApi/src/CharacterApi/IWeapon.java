/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterApi;

import Prototype.IPrototypeWeapon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pumkin
 */
public abstract class IWeapon{
    
    private String name;
    private int level;
    private double damage;
    private int reach;
    private int aoe; //area of effect
    private String type;
    private List<Integer> multipliers = new ArrayList<>();
    private List<String> imgPaths = new ArrayList<>();
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAoe() {
        return aoe;
    }

    public void setAoe(int aoe) {
        this.aoe = aoe;
    }

    public List<String> getImgPath() {
        return imgPaths;
    }

    public void setImgPath(List<String> imgPath) {
        this.imgPaths = imgPath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getMultipliers() {
        return multipliers;
    }

    public void setMultipliers(List<Integer> multipliers) {
        this.multipliers = multipliers;
    }
    
    
    
}
