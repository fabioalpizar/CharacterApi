/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Consola.Attack;
import Consola.Chat;
import Consola.Exit;
import Consola.GiveUp;
import Consola.ICommand;
import Consola.MutualExit;
import Consola.NextRound;
import Consola.RechargeWeapon;
import Consola.SelectGamer;
import Consola.SelectWeapon;
import Consola.UseWildCard;
import Log.Log;
import java.util.ArrayList;

/**
 *
 * @author kduran
 */
public class Controller implements IController{
    
    public boolean exit;
    private Log log;

    public Controller() {
        this.log = new Log();
    }
    
    @Override
    public void attack(Request request) {
        System.out.println("Attack");
    }
    
    @Override
    public void chat(Request request) {
        System.out.println("Chat");
    }

    @Override
    public void giveUp(Request request) {
        System.out.println("GiveUp");
    }
    
    @Override
    public void mutualExit(Request request) {
        System.out.println("ExitM");
    }
    
    @Override
    public void nextRound(Request request) {
        System.out.println("NextRound");
    }
    
    @Override        
    public void rechargeWeapon(Request request) {
        System.out.println("RechargeWeapon");
    }
    
    @Override
    public void selectGamer(Request request) {
        System.out.println("SelectGame");
    }
    
    @Override
    public void selectWeapon(Request request) {
        System.out.println("SelectWeapon");
    }
    
    @Override
    public void useWildCard(Request request) {
        System.out.println("UseWildCard");
    }
    
    @Override
    public void exit(Request request) {
        exit = true;
    }
    
    public ICommand registerCommandString (String commandString) {
        ICommand command = null;
        switch (commandString) {
            case "chat":
                command = new Chat(this, log);
            break;
            case "att":
                command = new Attack(this, log);
            break;
            case "gu":
                command = new GiveUp(this, log);
            break;
            case "me":
                command = new MutualExit(this, log);
            break;
            case "nr":
                command = new NextRound(this, log);
            break;
            case "rw":
                command = new RechargeWeapon(this, log);
            break;
            case "sg":
                command = new SelectGamer(this, log);
            break;
            case "sw":
                command = new SelectWeapon(this, log);
            break;
            case "uwc":
                command = new UseWildCard(this, log);
            break;
            case "exit":
                command = new Exit(this, log);
            break;
            default:
                command = new Consola.Error(log);
        }
        return command;
    }
    
    public ArrayList<String> defineString(String data){
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int n = 0; n < data.length(); n++) { 
            char c = data.charAt (n);
            if(c == ' ') {
                if (n == data.length()-1) {
                    word+=c;
                }
                words.add(word);
                word="";
            }else{
                word+=c;
                if (n == data.length()-1) {
                    words.add(word);
                }
                if (c == '"') {
                    word="";
                    n++;
                    for (int i = n; i < data.length(); i++) {
                        n = i;
                        if (data.charAt (i) == '"') {
                            break;
                        }
                        word += data.charAt (i);
                    }
                    words.add(word);
                }
            }
        }
        return words;
    }
    
    public Request defineData(ArrayList<String> words) {
        Request request = new Request();
        request.command = words.get(0);
        switch (request.command) {
            case "chat":
                request.message = words.get(1);
            break;
            case "att":
                if (words.size() == 3){
                    request.character = words.get(1);
                    request.weapon = words.get(2);   
                }else{
                    request.command = "error";
                }
            break;
            case "uwc":
                if (words.size() == 5){
                    request.character = words.get(1);
                    request.weapon = words.get(2);
                    request.character2 = words.get(3);
                    request.weapon2 = words.get(4);
                }else{
                    request.command = "error";
                }
            break;
        }
        return request;
    }
}
