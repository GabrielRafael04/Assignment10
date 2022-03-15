/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10;

/**
 *
 * @author fundacion
 */
public class Item {
    
    String name;
    
    public Item(String name){
        this.name = name;
    }
    
    public String getName(){
        //System.out.println("This is his name: " + name);
        return name;
    } 
    
    public void use(){
                System.out.println(" ");

        System.out.println("Using the item");
    }

   
}
