/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character;

import Assignment10.Arms;
import Assignment10.Consumable;
import Assignment10.Inventory;

/**
 *
 * @author fundacion
 */
public class Character {
    
    String name;
    String gender;
    int health;
    int force;
    int powerMagic;
    Inventory invent;
   
    public Character(String nombre, String genero, int salud, int fuerza, int magia, Inventory inventario){
        this.name = nombre;
        this.gender = genero;
        this.health = salud ;
        this.force = fuerza ;
        this.powerMagic = magia ;
        this.invent = inventario;
               
    }
    
    public String getName(){
        System.out.println("My name is " + name);
        return name;
    }
    
    public int getForce(){
        System.out.println(force);
        return force;
    }

    public int getHealth(){
        System.out.println(health);
        return health;
    }


    
    public void walk(String direccion){
        if("w".equalsIgnoreCase(direccion)){
            System.out.println("walking forward");
        }
        if("s".equalsIgnoreCase(direccion)){
            System.out.println("walking backwards");
        }
        if("a".equalsIgnoreCase(direccion)){
            System.out.println("walking to the left");
        }
        if("d".equalsIgnoreCase(direccion)){
            System.out.println("walking to the right");
        }
    }
    
    public void run(String direccion){
        if("w".equalsIgnoreCase(direccion)){
            System.out.println("running forward");
        }
        if("s".equalsIgnoreCase(direccion)){
            System.out.println("running backwards");
        }
        if("a".equalsIgnoreCase(direccion)){
            System.out.println("running to the left");
        }
        if("d".equalsIgnoreCase(direccion)){
            System.out.println("running to the right");
        }
        
    }   
    
    public void bendOver(){
        System.out.println("ducking");
        
    }
    
    public void useItem(Consumable use){
        invent.useItem(use);
        
    }
    public void attack(Arms use){
        invent.useItem(use);
        
    }
    
   
    void jump() {
        System.out.println("jumping");
    }    
    
}
