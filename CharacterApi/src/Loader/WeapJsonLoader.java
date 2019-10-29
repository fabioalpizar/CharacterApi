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
public class WeapJsonLoader implements IWeaponLoader{

    public WeapJsonLoader() {
    }

    
    @Override
    public List<IWeapon> load(String fileName) {
                
        List<IWeapon> weaponList = new ArrayList<>();
        
        try {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(fileName));
            
            for (Object obj : jsonArray){
                
                List<String> imgPaths = new ArrayList<>();
                List<Integer> multipliers = new ArrayList<>();
                
                JSONObject weapon = (JSONObject) obj;
                JSONArray imgs = (JSONArray) weapon.get("imgPaths");
                for (Object i : imgs){
                    imgPaths.add((String) i);
                }
                JSONArray multi = (JSONArray) weapon.get("imgPaths");
                for (Object i : imgs){
                    imgPaths.add((String) i);
                }
                Weapon w = new Weapon(
                        (String) weapon.get("name"),
                        ((Long)weapon.get("level")).intValue(),
                        ((Double)weapon.get("damage")),
                        ((Long)weapon.get("reach")).intValue(),
                        ((Long)weapon.get("aoe")).intValue(),
                        (String) weapon.get("type"));
                w.setImgPath(imgPaths);
                w.setMultipliers(multi);
                IWeapon i = (IWeapon) w;        
                weaponList.add(i);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weaponList;
        
    }
    
}
