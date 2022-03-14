/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10;

/**
 *
 * @author fundacion
 */
public class Tonic extends Consumable{
    int effect;
    
    public Tonic(String use, String name,int recoveryHealth){
        super(use, name);
        effect = recoveryHealth;
    }
    
    @Override
    public void use(){
        System.out.println("Using the item");
        System.out.println("Recovering health .......");
        System.out.println("Health + " + effect);

    } 
    
    public int getEffect(){
        return effect;
    }
}
