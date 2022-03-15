/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character;

import Assignment10.Inventory;

/**
 *
 * @author fundacion
 */
public class Wizard extends Enemy{
    
    public Wizard(String nombre, String genero, int salud, int fuerza, int magia, Inventory inventario){
        super(nombre,genero,salud,fuerza,magia,inventario);
    }
    
    public void magicAttack(){
        System.out.println("Magic attack");
        System.out.println("[Enemy, "+powerMagic+"]");
        
    }
}
