/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import CharacterApi.ICharacter;
import CharacterApi.IWeapon;

/**
 *
 * @author raque
 */
public class Game {
    public static Gamer turn;
    
    public Gamer gamer1;
    public Gamer gamer2;
    public boolean gamerlist = false; //true = se ataca los jugadores de la lista 2
    public ArrayList<ICharacter> charactersGamer1 = new ArrayList<>(); 
    public ArrayList<ICharacter> charactersGamer2 = new ArrayList<>(); 
    public ArrayList<IWeapon> weaponsGamer1 = new ArrayList<>(); 
    public ArrayList<IWeapon> weaponsGamer2 = new ArrayList<>(); 
    

    
    //metodo para buscar el personaje en la lista
    public ICharacter searchCharacter(String nameCharacter){
        ArrayList<ICharacter> characters = searchCharactersList(turn.getID());
        if(characters!=null){
            for(ICharacter character: characters){
                if(character.getName().equals(nameCharacter)){
                    return character;
                }
            }
        }
        
        return null;  
    }
    
    //metodo para buscar la lista de los guerreros de cada jugador
    public ArrayList searchCharactersList(int idPlayer){
        if(idPlayer==gamer1.getID()){
            this.gamerlist = true;
            return this.charactersGamer1;
        }else{
            this.gamerlist = false;
            return this.charactersGamer2;
        }

    }
   
    //metodo para buscar el arma de cada persona
    public IWeapon searchWeapon(String ch1, String weaponName){
        ArrayList<ICharacter> characters = searchCharactersList(turn.getID());
         if(characters!=null){
            for(ICharacter character: characters){
                if(character.getName().equals(ch1)){
                    for(IWeapon weapon: character.getWeapons()){
                        if(weapon.getName().equals(weaponName)){
                            return weapon;
                        }
                    }

                }
            }
         
         }
        return null;
    }
        //valida que todas las armas hayan sido usadas para poder recargar
    //si una no está en la lista de armas del jugador entonces no se recarga
    public boolean weaponsUsed(ArrayList<IWeapon> weapons, ArrayList<ICharacter> characters){
        for (int i = 0; i < characters.size(); i++) {
            for (int j = 0; j < characters.get(i).getWeapons().size(); j++) {
                IWeapon weapon = characters.get(i).getWeapons().get(j);
                for (int k = 0; k < weapons.size(); k++) {
                    if(!weapons.contains(weapon)){
                        return false;
                    }
                }
            }
            
        }
        return true;  
    }
    //saca los tipos, suma los tipos en el arma y si son mayor a cien es exitoso
    //veo a ver cuanto danno hace el arma por tipo y se lo resto
    //meto en una lista el arma usada y solo dejo que la use si no la ha usado
    //consultar que el arma no este en la lista
    public void attack(String characterName, String weaponName){
        //ICharacter attacker = searchCharacter(characterName);
        IWeapon weapon = searchWeapon(characterName, weaponName);
        double damage = weapon.getDamage();
        if(this.gamerlist){
            for (int i = 0; i < this.charactersGamer2.size(); i++) {
                this.charactersGamer2.get(i).setHp(this.charactersGamer2.get(i).getHp()-damage);
            }
        } 
    }
    public void giveUp(String msj){
        if(turn.equals(gamer1.getID())){
            System.out.println("msj "+msj+" ganó el jugador 2");
            //
        }else{
            System.out.println("msj "+msj+" ganó el jugador 1");
        }
    }
    public void mutualExit(){
        if(turn.getID()==gamer1.getID()){
            //aqui jugador 1 le manda un msj de confirmacion a jugador 2
        }else{
            //aqui jugador 2 le manda un msj de confirmacion a jugador 1
        }
        
    }

    public void rechargeWeapons(){
      if(turn.getID()==gamer1.getID()){
          if(weaponsUsed(this.weaponsGamer1, this.charactersGamer1)){
              this.weaponsGamer1.clear();
          }
       
      }else{
          if(weaponsUsed(this.weaponsGamer2, this.charactersGamer2)){
              this.weaponsGamer2.clear();
          }
      }
    }
    public void useWildCard(String character1, String weapon1,String character2,
            String weapon2){
        
    }
    public void selectCharacter(String characterName){
        //este metodo es solo mostrar por pantalla la seleccion
        ICharacter character = searchCharacter(characterName);
        System.out.println(""+character);
        
    }
    public void skipTurn(){
        if(turn.getID()==gamer1.getID()){
            this.turn = gamer2;
        }else{
            this.turn = gamer1;
        }
        
    }
    public void chat(String msj){
        if(turn.getID()==gamer1.getID()){
            //jugador 1 le manda mensaje a jugador 2
        }else{
            //jugador 2 le manda mensaje a jugador 1
        }
    }
    
}
