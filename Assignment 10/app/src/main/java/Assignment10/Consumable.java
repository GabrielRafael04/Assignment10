/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10;

/**
 *
 * @author fundacion
 */
public class Consumable extends Item{
    String effect;
    
    public Consumable(String use, String name){
        super(name);
        this.effect = use ;
    }
    
    
}
