/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loader;


import CharacterApi.ICharacter;
import java.util.List;


/**
 *
 * @author Pumkin
 */
public interface ICharacterLoader {
    
    public List<ICharacter> load(String fileName);
    
}
