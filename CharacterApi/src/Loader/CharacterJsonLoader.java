/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loader;

import CharacterApi.*;
import java.util.List;
import org.json.simple.*;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Pumkin
 */
public class CharacterJsonLoader implements ICharacterLoader{

    private List<IWeapon> weapons = new ArrayList<>(); 
    
    public CharacterJsonLoader(List<IWeapon> weapons) {
        this.weapons = weapons;
    }
    
    public CharacterJsonLoader() {
        this.weapons = null;
    }
    
    @Override
    public List<ICharacter> load(String fileName) {
        
        List<ICharacter> characterList = new ArrayList<>();
        
        try {
            JSONParser parser = new JSONParser();
            JSONArray a = (JSONArray) parser.parse(new FileReader(fileName));
            
            for (Object o : a){
                
                List<String> imgPaths = new ArrayList<>();
                List<IWeapon> weaponsList = new ArrayList<>();
                
                JSONObject character = (JSONObject) o;
                JSONArray imgs = (JSONArray) character.get("imgPaths");
                JSONArray weaps = (JSONArray) character.get("weapons");
                for (Object i : imgs){
                    imgPaths.add((String) i);
                }
                
                if(this.weapons != null){
                    for (Object w : weaps){
                        for (IWeapon weapon : weapons){
                            Weapon x = (Weapon) weapon;
                            if(x.getName().equals((String)w)){
                                weaponsList.add(x);
                            }

                        }
                    } 
                }                
                ICharacter c = new Charactr(
                        (String) character.get("name"), 
                        ((Long)character.get("level")).intValue(), 
                        (((Long)character.get("hp")).doubleValue()),
                        (((Long)character.get("dps")).doubleValue()), 
                        ((Long)character.get("cost")).intValue(),
                        ((Long)character.get("size")).intValue(),
                        ((String)character.get("type")),
                        ((Long)character.get("playerLevel")).intValue(),
                        imgPaths);
                
                c.setImgPaths(imgPaths);
                c.setWeapons(weaponsList);
                characterList.add(c);
             
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return characterList;
    }


    
}
