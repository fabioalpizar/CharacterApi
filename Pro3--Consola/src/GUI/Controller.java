/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CharacterApi.ICharacter;
import CharacterApi.IWeapon;
import Loader.CharacterJsonLoader;
import Loader.WeapJsonLoader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Controller {
    
    private List<ICharacter> charList;
    
    private List<ICharacter> playerCharacters;

    public Controller() {
        WeapJsonLoader weaponLoader = new WeapJsonLoader();
        List<IWeapon> weaponList = weaponLoader.load("src\\Resources\\json\\weapons.json");
        CharacterJsonLoader charLoader = new CharacterJsonLoader(weaponList);
        charList = charLoader.load("src\\Resources\\json\\characters.json");
        playerCharacters = new ArrayList();
    }

    void setPlayerCharacters(ArrayList<String> characters) {
        //contiene los characters que eligio el jugador
        for (int i = 0; i < characters.size(); i++) {
            for (int e = 0; e < charList.size(); e++) {
                if (charList.get(e).getType().equals(characters.get(i)) ) {
                    playerCharacters.add( charList.get(e) );
                }
            }
        }
    }
    
    void setUserName(String userName) {
        // contiene el username
    }
    
    
    public List<String> getImgList() {
        List<String> imgList = new ArrayList<>();
        for(ICharacter c: playerCharacters) {
            imgList.add(c.getImgPaths().get(0));
        }
        return imgList;
    }
    
    public List<String> getCharactersImgList(){
        List<String> imgList = new ArrayList<>();
        for(ICharacter c: playerCharacters) {
            imgList.add(c.getImgPaths().get(0));
        }
        return imgList;
    }
    
    public String weaponsToString(List<Integer> list) {
        String text = "| ";
        for(Integer i: list) {
            text = text + i + " |";
        }
        return text;
    }
    
    public String getImagePath(String name) {
        String path = "";
        for (int i = 0; i < charList.size(); i++) {
            if (charList.get(i).getType().equals(name) ) {
                path = charList.get(i).getImgPaths().get(0);
            }
        }
        return path;
    }

    public ICharacter getCharacter1() {
        return playerCharacters.get(0);
    }

    public ICharacter getCharacter2() {
        return playerCharacters.get(1);
    }

    public ICharacter getCharacter3() {
        return playerCharacters.get(2);
    }

    public ICharacter getCharacter4() {
        return playerCharacters.get(3);
    }

}