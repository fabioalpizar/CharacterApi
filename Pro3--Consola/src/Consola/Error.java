/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

/**
 *
 * @author kduran
 */
public class Error implements ICommand{

    @Override
    public void execute() {
        System.out.println("El comando no existe");
    }
    
}
