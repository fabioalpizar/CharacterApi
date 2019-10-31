/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author kduran
 */
public class Request {
    public String command;
    public String character;
    public String weapon;
    public String character2;
    public String weapon2;
    public String message;

    @Override
    public String toString() {
        String data = "";
        if (message != null) {
            data += " Message: " + message;
        }
        if (character != null) {
            data += " Character: " + character;
        }
        if (weapon != null) {
            data += " Weapon: " + weapon;
        }
        if (character2 != null) {
            data += " Character 2: " + character2;
        }
        if (weapon2 != null) {
            data += " Weapon 2: " + weapon2;
        }
        return "Request" + data;
    }
    
    
}
