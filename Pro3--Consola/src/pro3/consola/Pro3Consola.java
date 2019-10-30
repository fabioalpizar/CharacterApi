/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro3.consola;

import Consola.Attack;
import Consola.Chat;
import Consola.GiveUp;
import Consola.ICommand;
import Consola.Invoker;
import Consola.MutualExit;
import Consola.NextRound;
import Consola.RechargeWeapon;
import Consola.SelectGamer;
import Consola.SelectWeapon;
import Consola.UseWildCard;
import Game.Controller;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        Attack attack = new Attack(controller);
        Chat chat = new Chat(controller);
        GiveUp giveUp = new GiveUp(controller);
        MutualExit mutualExit = new MutualExit(controller);
        NextRound nextRound = new NextRound(controller);
        RechargeWeapon recharge = new RechargeWeapon(controller);
        SelectGamer selectGamer = new SelectGamer(controller);
        SelectWeapon selectWeapon = new SelectWeapon(controller);
        UseWildCard wildCard = new UseWildCard(controller);
        
        Invoker invoker = new Invoker();
        
        invoker.setCommand(attack);
        invoker.comunicateConsole();
        
        
        while(!controller.exit) {
            System.out.println ("--");
            String entradaTeclado = "";
            Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
            entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
            ICommand command = controller.registerCommandString(entradaTeclado);
            invoker.setCommand(command);
            invoker.comunicateConsole();
        }
        
        
        
    }
    
}
