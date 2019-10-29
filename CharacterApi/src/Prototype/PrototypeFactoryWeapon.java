/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import CharacterApi.IWeapon;
import java.util.HashMap;

/**
 *
 * @author raque
 */
public class PrototypeFactoryWeapon {
    
     public static HashMap<String, IPrototypeWeapon> prototypesWeapons = new HashMap<>();
    
    public static IWeapon getCloneWeapon(String weaponName){
        return (IWeapon) prototypesWeapons.get(weaponName).deepClone();
    }
    
    public static void addWeapon(String name, IPrototypeWeapon prototype){
        prototypesWeapons.put(name, prototype);
    }
    
}
