/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package Assignment10;


import java.util.Arrays;
/**
 *
 * @author fundacion
 */
public class Inventory {
    
    Item[] armsInventory;
    Item[] consumableInventory;
    Item[][] capacityItems;
    
    public Inventory(int armsCapacity, int consumableCapacity){
        Item[] arms = new Item[armsCapacity];
        armsInventory = arms;
        Item[] consumables = new Item[consumableCapacity];
        consumableInventory = consumables;
        Item[][] total = {armsInventory, consumableInventory};
        capacityItems = total;
    } 
    
    
    public void ver(int fila, int columna){
        if(capacityItems[fila][columna]!= null){
        //System.out.println(capacityItems[fila][columna]);
        System.out.println(capacityItems[fila][columna].getName() );
        }
        else{
            System.out.println("vacio");

        }

    }
    
    public void addItem(Item add){
        int fila = 0 ;
        
        if(add instanceof Arms){
            fila = 0 ;
            int position = 0;
            while(capacityItems[fila][position] != null){
                position++;
            }
            capacityItems[fila][position] = add;
        }
        
        if(add instanceof Consumable){
            fila = 1 ;
            int position = 0;
            while(capacityItems[fila][position] != null){
                position++;
            }
            capacityItems[fila][position] = add;

        }

        System.out.println("Was added: " + add.getName() );
    }
    
    
    public void deleteItem(Item delete){
        int fila = 0;
        if(delete instanceof Arms){
            fila = 0;
            int position = 0;
            int found = 0;
            for(Item item : armsInventory){
                
                if(item == delete){
                    capacityItems[fila][position] = null;
                    found = 1;
                }
                else{
                    if(position == (armsInventory.length)-1 && found == 0){
                        System.out.println("The item was not found");
                    } 
                }
                position++;
            }
        }
        if(delete instanceof Consumable){
            fila = 1;
            int position = 0;
            for(Item item : consumableInventory){
                if(item == delete){
                    capacityItems[fila][position] = null;
                }
                else{
                    if(position == consumableInventory.length-1){
                        System.out.println("The item was not found");
                    } 
                }
                position++;
            }
        }
    }
    
    public int[] searchItem(Item search){
        int fila = 0;
        int columna = 0;
        
        if(search instanceof Arms){
            fila = 0;
            int position = 0;
            int found = 0;
            for(Item item : armsInventory){
                
                if(item == search){
                    columna = position;
                    found = 1;
                }
                else{
                    if(position == (armsInventory.length)-1 && found == 0){
                        System.out.println("The item was not found");
                    } 
                }
                position++;
            }
        }
        if(search instanceof Consumable){
            fila = 1;
            int position = 0;
            for(Item item : consumableInventory){
                if(item == search){
                    columna = position;
                }
                else{
                    if(position == consumableInventory.length-1){
                        System.out.println("The item was not found");
                    } 
                }
                position++;
            }
        }
        int[] result = {fila, columna};
                System.out.println(" ");

        System.out.println(Arrays.toString(result));
        return result;
        
    }
    
    public int[] search(Item search){
        int fila = 0;
        int columna = 0;
        
        if(search instanceof Arms){
            fila = 0;
            int position = 0;
            int found = 0;
            for(Item item : armsInventory){
                
                if(item == search){
                    columna = position;
                    found = 1;
                }
                else{
                    if(position == (armsInventory.length)-1 && found == 0){
                        //System.out.println("The item was not found");
                    } 
                }
                position++;
            }
        }
        if(search instanceof Consumable){
            fila = 1;
            int position = 0;
            for(Item item : consumableInventory){
                if(item == search){
                    columna = position;
                }
                else{
                    if(position == consumableInventory.length-1){
                       // System.out.println("The item was not found");
                    } 
                    
                }
                position++;
            }
        }
        int[] result = {fila, columna};
        //System.out.println(Arrays.toString(result));
        return result;
        
    }
    
    
    public void moveItem(Item move, int newPosition ){
        int[] position= search(move);
        int fila = position[0] , columna = position[1]; 
        Item one = capacityItems[fila][columna];
        Item two = capacityItems[fila][newPosition];
        Item aux = one;
        
        capacityItems[fila][columna] = two;
        capacityItems[fila][newPosition]= aux;
    }
    
    public String[] useItem(Item aUse){
        aUse.use();
        int effect = 0;
        String affected = "";
        if(aUse instanceof Consumable){
            affected = "Player";
            if(aUse instanceof Tonic){
                Tonic item = (Tonic)aUse;
                //item.use();
                effect = item.getEffect();
            }
            if(aUse instanceof Poison){
                Poison item = (Poison)aUse;
                //item.use();
                effect = item.getEffect();
            }
            if(aUse instanceof Elixir){
                Elixir item = (Elixir)aUse;
                //item.use();
                effect = item.getEffect();
            }
            
            delete(aUse);
            
            
        }
        if(aUse instanceof Arms){
            affected ="Enemy";
            Arms item= (Arms)aUse;
            item.attack("enemy");
            effect = item.getDamage();
            
        }
        String[] result = { affected ,(effect + "")};
                System.out.println(" ");

        System.out.println(Arrays.toString(result));
        return result;
    }
    
    public void delete(Item delete){
        int fila = 0;
        if(delete instanceof Arms){
            fila = 0;
            int position = 0;
            int found = 0;
            for(Item item : armsInventory){
                
                if(item == delete){
                    capacityItems[fila][position] = null;
                    found = 1;
                }
                else{
                    if(position == (armsInventory.length)-1 && found == 0){
                       // System.out.println("The item was not found");
                    } 
                }
                position++;
            }
        }
        if(delete instanceof Consumable){
            fila = 1;
            int position = 0;
            for(Item item : consumableInventory){
                if(item == delete){
                    capacityItems[fila][position] = null;
                }
                else{
                    if(position == consumableInventory.length-1){
                        //System.out.println("The item was not found");
                    } 
                }
                position++;
            }
        }
    }
    
    
}
