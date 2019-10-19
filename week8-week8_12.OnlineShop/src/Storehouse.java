/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadat
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Storehouse {
    
    private Map<String,Integer> itemsPrice; 
    private Map<String,Integer> itemsStock; 
    
    public Storehouse(){
        itemsPrice = new HashMap<String,Integer>(); 
        itemsStock = new HashMap<String,Integer>(); 
    }
    
    public void addProduct(String product, int price, int stock){
        itemsPrice.put(product, price); 
        itemsStock.put(product, stock);
    }        
    
    public int price(String product){
       if(!itemsPrice.containsKey(product)){
           return -99; 
       }
       return itemsPrice.get(product); 
    }
    
    public int stock(String product){
        
    
        if(itemsStock.containsKey(product)){
        return itemsStock.get(product);
        }
        
        
       return 0;  
    }
    
    
    public boolean take(String product){
       if(itemsStock.containsKey(product)){
           int stock = stock(product); 
           if(stock > 0 ){
               stock--; 
               itemsStock.put(product, stock); 
               return true; 
           }
          
       }
       return false; 
    }
    
    public Set<String> products(){
       Set<String> set = new HashSet<String>(); 
        for(String a: itemsStock.keySet()){
            set.add(a); 
        }
        return set;
    }
}
