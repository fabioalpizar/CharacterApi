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

/**
 *
 * @author kduran
 */
public class Controller {
    
    public boolean exit;
    
    public void attack() {
        System.out.println("Attack");
    }
    
    public void chat() {
        System.out.println("Chat");
    }

    public void giveUp() {
        System.out.println("GiveUp");
    }
    
    public void mutualExit() {
        System.out.println("ExitM");
    }
    
    public void nextRound() {
        System.out.println("NextRound");
    }
    
    public void rechargeWeapon() {
        System.out.println("RechargeWeapon");
    }
    
    public void selectGamer() {
        System.out.println("SelectGame");
    }
    
    public void selectWeapon() {
        System.out.println("SelectWeapon");
    }
    
    public void useWildCard() {
        System.out.println("UseWildCard");
    }
    
    public void exit() {
        exit = true;
    }
    
    public ICommand registerCommandString (String commandString) {
        ICommand command = null;
        switch (commandString) {
            case "chat":
                command = new Chat(this);
            break;
            case "att":
                command = new Attack(this);
            break;
            case "gu":
                command = new GiveUp(this);
            break;
            case "me":
                command = new MutualExit(this);
            break;
            case "nr":
                command = new NextRound(this);
            break;
            case "rw":
                command = new RechargeWeapon(this);
            break;
            case "sg":
                command = new SelectGamer(this);
            break;
            case "sw":
                command = new SelectWeapon(this);
            break;
            case "uwc":
                command = new UseWildCard(this);
            break;
            case "exit":
                command = new Exit(this);
            break;
            default:
                command = new Consola.Error();
        }
        return command;
    }
}
