/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

import Game.Controller;
import Game.Request;

/**
 *
 * @author kduran
 */
public class UseWildCard implements ICommand{
    private Controller controller;
    private Log.Log log;
    private Request request;
    
    public UseWildCard(Controller controller, Log.Log log) {
        this.controller = controller;
        this.log = log;
    }
    
    @Override
    public void setRequest(Request request) {
        this.request = request;
    }
    
    @Override
    public void execute() {
        controller.useWildCard(request);
        log.useWildCard(request);
    }
    
}
