/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro3.consola;

import Consola.ICommand;
import Consola.Invoker;
import Game.Controller;
import Game.Request;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kduran
 */
public class Pro3Consola {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controller= new Controller();
        Invoker invoker = new Invoker();
        while(!controller.exit) {
            System.out.println ("--");
            String entradaTeclado = "";
            Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
            entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
            ArrayList words = controller.defineString(entradaTeclado);
            Request request = controller.defineData(words);
            ICommand command = controller.registerCommandString(request.command);
            command.setRequest(request);
            invoker.setCommand(command);
            invoker.comunicateConsole();
        }
    }
}
