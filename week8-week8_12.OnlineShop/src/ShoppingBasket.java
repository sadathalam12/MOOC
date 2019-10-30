/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadat
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



 
public class ShoppingBasket {
    private Map<String,Purchase> purchases;  
    
    public ShoppingBasket(){
       this.purchases = new HashMap<String,Purchase>(); 
    }
  
    
    public void add(String product, int price){
         
        if(!purchases.containsKey(product)){
        purchases.put(product, new Purchase(product,1,price)); 
        }else{
            purchases.get(product).increaseAmount();
        }
       }
    
       
            
        
      
        
       
        
      
       
        
    
            
        
        
        
       
        
        
    
        
            
          
       
        
          
        
        
    
    
    
    public int price(){
       int price = 0; 
       
        for(String a: purchases.keySet()){
            Purchase b = purchases.get(a); 
            
             price += b.price();
            
        }
        return price; 
    }
    
    public void print(){
      
       for(String a: purchases.keySet()){
           Purchase b = purchases.get(a); 
           System.out.println(b);
       }

       
    }
   
    
}

