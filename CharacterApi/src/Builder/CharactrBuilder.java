/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import CharacterApi.Charactr;
import CharacterApi.ICharacter;
import CharacterApi.IWeapon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kduran
 */
public class CharactrBuilder implements IBuilder<ICharacter>{
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

    public String getName() {
        return name;
    }
    
    public CharactrBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CharactrBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public CharactrBuilder setHp(double hp) {
        this.hp = hp;
        return this;
    }

    public CharactrBuilder setDps(double dps) {
        this.dps = dps;
        return this;
    }

    public CharactrBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public CharactrBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public CharactrBuilder setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
        return this;
    }
    
    public CharactrBuilder addImg(String imgPath) {
        this.imgPaths.add(imgPath);
        return this;
    }
    
    public CharactrBuilder addWeapon(IWeapon weapon) {
        this.weapons.add(weapon);
        return this;
    }

    public CharactrBuilder setType(String type) {
        this.type = type;
        return this;
    }
    
    
    
    public CharactrBuilder repairCharacter(ICharacter character){
        this.name = character.getName();
        this.level = character.getLevel();
        this.hp = character.getHp(); //health points
        this.dps = character.getDps(); //damage per second
        this.cost = character.getCost();
        this.size = character.getSize();
        this.type = character.getType();
        this.playerLevel = character.getPlayerLevel();
        this.imgPaths = character.getImgPaths();
        this.weapons = character.getWeapons();
        return this;
    }
    
    @Override
    public ICharacter buildCharactr() {
        return new Charactr(name, level, hp, dps, cost, size, type, playerLevel, imgPaths);
    }

    
}
