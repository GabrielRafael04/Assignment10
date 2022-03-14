/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10;

/**
 *
 * @author fundacion
 */
public class Sword extends Arms{

    public Sword(int i, int j, String name) {
        super(i, j, name);
        scope = "melee attack";
        
    }

    
    @Override
    public void attack(String target){
        int balas = ammoAvailable ;
        ammoAvailable = balas ;
        use();
        System.out.println("Attacking to: " + target );
    }
}