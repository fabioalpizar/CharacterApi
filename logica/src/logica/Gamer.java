/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import CharacterApi.ICharacter;



/**
 *
 * @author raque
 */
public class Gamer {
    private int ID;
    private String username;
    private int winnerGame;
    private int loseGame;
    private int giveUps;
    private int loseAttacks;
    private int winnerAttacks;
    private ArrayList<ICharacter> characters;

    public Gamer(int ID, String username, int winnerGame, int loseGame, int giveUps, int loseAttacks, int winnerAttacks) {
        this.ID = ID;
        this.username = username;
        this.winnerGame = winnerGame;
        this.loseGame = loseGame;
        this.giveUps = giveUps;
        this.loseAttacks = loseAttacks;
        this.winnerAttacks = winnerAttacks;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getWinnerGame() {
        return winnerGame;
    }

    public void setWinnerGame(int winnerGame) {
        this.winnerGame = winnerGame;
    }

    public int getLoseGame() {
        return loseGame;
    }

    public void setLoseGame(int loseGame) {
        this.loseGame = loseGame;
    }

    public int getGiveUps() {
        return giveUps;
    }

    public void setGiveUps(int giveUps) {
        this.giveUps = giveUps;
    }

    public int getLoseAttacks() {
        return loseAttacks;
    }

    public void setLoseAttacks(int loseAttacks) {
        this.loseAttacks = loseAttacks;
    }

    public int getWinnerAttacks() {
        return winnerAttacks;
    }

    public void setWinnerAttacks(int winnerAttacks) {
        this.winnerAttacks = winnerAttacks;
    }

    public ArrayList<ICharacter> getCharacters() {
        return characters;
    }

    public void AddCharacters(ICharacter character) {
        this.characters.add(character);
    }
    
    
}
