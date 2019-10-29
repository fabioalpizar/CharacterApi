/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;



/**
 *
 * @author raque
 */
public interface IPrototypeCharacter<T extends IPrototypeCharacter> extends Cloneable {
    
    public T clone();
    public T deepClone();
    
}
