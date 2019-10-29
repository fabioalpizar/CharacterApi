/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import CharacterApi.ICharacter;
import java.util.HashMap;

/**
 *
 * @author raque
 */
public class PrototypeFactoryCharacter {
    
     public static HashMap<String, IPrototypeCharacter> prototypesCharacter = new HashMap<>();
    
    public static ICharacter getCloneCharacter(String characterName){
        return (ICharacter) prototypesCharacter.get(characterName).deepClone();
    }
    
    public static void addCharacter(String name, IPrototypeCharacter prototype){
        prototypesCharacter.put(name, prototype);
    } 
    
}
