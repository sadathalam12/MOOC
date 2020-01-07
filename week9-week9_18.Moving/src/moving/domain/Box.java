/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author mdala
 */
import java.util.List; 
import java.util.ArrayList; 
public class Box implements Thing {
    private int maximumCapicity; 
    private List<Thing> box; 
    public Box(int maximumCapicity){
        this.maximumCapicity = maximumCapicity; 
        this.box = new ArrayList<Thing>(); 
    }
    
    public boolean addThing(Thing t){
        if(t instanceof Thing ){
            Item x = (Item) t; 
             if(x.getVolume()<=this.maximumCapicity){
               this.box.add(x);
               this.maximumCapicity -= x.getVolume();
           }     
             return true; 
               }
         
         return false;  
    }
    
    
       
    

    @Override
    public int getVolume() {
        int totalVolumeOfBox = 0; 
        for(Thing i:box ){
           Item x = (Item) i; 
            totalVolumeOfBox += x.getVolume(); 
        }
        return totalVolumeOfBox; 
    }
}
