/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10;

/**
 *
 * @author fundacion
 */
public class Arms extends Item{
        
    int damage;
    String scope;
    int gunCharger;
    int ammoAvailable;
    
    Arms(int daño, int cargador, String name){
        super(name);
        damage = daño;
        gunCharger = cargador;
        ammoAvailable = cargador;
    }
    
    public void attack(String target){
        int balas = ammoAvailable - 1;
        ammoAvailable = balas ;
        use();
        System.out.println("Attacking to: " + target );
    }
    
    public void getAmmoNumber(){
        System.out.println("The available ammunition is: " + ammoAvailable + "/" + gunCharger);
    }
    
    public void reloadWeapon(){
        ammoAvailable = gunCharger;
        getAmmoNumber();
    }
    public int getDamage(){
        return damage;
    }
}
