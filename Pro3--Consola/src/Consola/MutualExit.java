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
public class MutualExit implements ICommand{

    private Controller controller;

    public MutualExit(Controller controller) {
        this.controller = controller;
    }
    
    @Override
    public void execute() {
        controller.mutualExit();
    }
    
}
