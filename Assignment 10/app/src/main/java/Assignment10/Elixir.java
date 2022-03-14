/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10;

/**
 *
 * @author fundacion
 */
public class Elixir extends Consumable{
    int effect;
    
    public Elixir(String use, String name,int recoveryMana){
        super(use, name);
        effect = recoveryMana;
    }
    
    @Override
    public void use(){
        System.out.println("Using the item");
        System.out.println("Recovering mana .......");
        System.out.println("Mana + " + effect);

    } 
    
    public int getEffect(){
        return effect;
    }
}
