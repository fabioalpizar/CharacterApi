/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

import Game.Request;

/**
 *
 * @author kduran
 */
public interface ICommand {
    public void setRequest(Request request);
    public void execute();
}
