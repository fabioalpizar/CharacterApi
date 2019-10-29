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
public class Weapon extends IWeapon implements IPrototypeWeapon{
    
    private String name;
    private int level;
    private double damage;
    private int reach;
    private int aoe; //area of effect
    private String type;
    private List<Integer> multipliers = new ArrayList<>();
    private List<String> imgPaths = new ArrayList<>();
    
    public Weapon(){
        
    }

    public Weapon(String name, int level, double damage, int reach, int aoe, String type, List<Integer> multipliers, List<String> imgPaths) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.reach = reach;
        this.aoe = aoe;
        this.type = type;
        this.multipliers = multipliers;
        this.imgPaths = imgPaths;
    }

    public Weapon(String name, int level, double damage, int reach, int aoe, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.reach = reach;
        this.aoe = aoe;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    public int getAoe() {
        return aoe;
    }

    public void setAoe(int aoe) {
        this.aoe = aoe;
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

    public List<String> getImgPaths() {
        return imgPaths;
    }

    public void setImgPaths(List<String> imgPaths) {
        this.imgPaths = imgPaths;
    }
    
    @Override
    public Weapon clone() {
        return new Weapon(this.name, this.level, this.damage, this.reach, this.aoe, this.type, this.multipliers, this.imgPaths);
    }

    @Override
    public Weapon deepClone() {
        List<String> newImgPaths = new ArrayList<>();
        for (String imagen : this.imgPaths) {
            newImgPaths.add(new String(imagen));
        }
        return new Weapon(this.name, this.level, this.damage, this.reach, this.aoe, this.type, this.multipliers, this.imgPaths);
    }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", level=" + level + ", damage=" + damage + ", reach=" + reach + ", aoe=" + aoe + ", imgPaths=" + imgPaths + '}';
    }

  

 
    
    
}
