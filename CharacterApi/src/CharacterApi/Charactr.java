/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterApi;

import Prototype.IPrototypeCharacter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pumkin
 */
public class Charactr extends ICharacter implements IPrototypeCharacter{
    
    private String name;
    private int level;
    private double hp; //health points
    private double dps; //damage per second
    private int cost;
    private int size;
    private String type;
    private int playerLevel;
    private List<IWeapon> weapons = new ArrayList<>();
    private List<String> imgPaths = new ArrayList<>();

    public Charactr(){
        
    }
    
    public Charactr(String name, int level, double hp, double dps, int cost, int size, String type, int playerLevel, List<String> imgPaths) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.dps = dps;
        this.cost = cost;
        this.size = size;
        this.type = type;
        this.playerLevel = playerLevel;
        this.imgPaths = imgPaths;
    }
    
    public Charactr(String name, int level, double hp, double dps, int cost, int size, String type, int playerLevel) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.dps = dps;
        this.cost = cost;
        this.size = size;
        this.type = type;
        this.playerLevel = playerLevel;
        this.imgPaths = imgPaths;
    }
    
    public Charactr(String name, int level, double hp, double dps, String type, List<IWeapon> weapons, List<String> imgPaths) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.dps = dps;
        this.type = type;
        this.weapons = weapons;
        this.imgPaths = imgPaths;
    }

    public Charactr(String name, List<String> imgPaths) {
        this.name = name;
        this.imgPaths = imgPaths;
    }

    public List<String> getImgPath() {
        return imgPaths;
    }

    public void setImgPath(List<String> imgPath) {
        this.imgPaths = imgPath;
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

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDps() {
        return dps;
    }

    public void setDps(double dps) {
        this.dps = dps;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }

    public List<IWeapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<IWeapon> weapons) {
        this.weapons = weapons;
    }

    public List<String> getImgPaths() {
        return imgPaths;
    }

    public void setImgPaths(List<String> imgPaths) {
        this.imgPaths = imgPaths;
    }
    
    
    
    @Override
    public IPrototypeCharacter clone() {
        return new Charactr(this.name,this.level, this.hp, this.dps, this.cost,
        this.size, this.type, this.playerLevel, this.imgPaths);
    }

    @Override
    public IPrototypeCharacter deepClone() {
         List<Weapon> newWeapons = new ArrayList<>();
         List<String> newImgPaths = new ArrayList<>();
         for (IWeapon weapon : this.weapons) {
            newWeapons.add(new Weapon(weapon.getName(), weapon.getLevel(), 
                    weapon.getDamage(), weapon.getReach(), weapon.getAoe(), weapon.getType(), weapon.getMultipliers(), weapon.getImgPath()));
        }
        for (String imagen : this.imgPaths) {
            newImgPaths.add(new String(imagen));
        }
        return new Charactr(this.name,this.level, this.hp, this.dps, this.cost,
        this.size, this.type, this.playerLevel, this.imgPaths);
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", level=" + level + ", hp=" + hp + ", dps=" + dps + ", cost=" + cost + ", size=" + size + ", type=" + type + "playerLevel=" + playerLevel + ", weapons=" + weapons + ", imgPaths=" + imgPaths + '}';
    }

 
}
