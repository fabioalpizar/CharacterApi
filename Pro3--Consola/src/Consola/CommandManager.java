/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

import Game.Controller;

/**
 *
 * @author kduran
 */
public class CommandManager {
    private ICommand command;

    public CommandManager() {
    }
    
    public ICommand getCommand(){
        return command;
    }
    
    public void registerCommand (ICommand command) {
        this.command = command;
    }
    
}
