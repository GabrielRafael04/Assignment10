/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10;

/**
 *
 * @author fundacion
 */
public class Poison extends Consumable{
    
    int effect;
    
    public Poison(String use, String name,int lossHealth){
        super(use, name);
        effect = lossHealth;
    }
    
    @Override
    public void use(){
        System.out.println("Using the item");
        System.out.println("loss health .......");
        System.out.println("Health " + effect);

    } 
    
    public int getEffect(){
        return effect;
    }
    
}
