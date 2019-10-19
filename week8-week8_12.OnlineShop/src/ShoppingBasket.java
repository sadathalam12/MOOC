/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadat
 */
import java.util.Map; 
import java.util.HashMap; 
 
public class ShoppingBasket {
    Map<String, Purchase> purchases; 
    
    public ShoppingBasket(){
        this.purchases = new HashMap<String, Purchase>(); 
    }
  
    
    public void add(String product, int price){
        purchases.put(product, new Purchase(product,1,price)); 
        
    }
    
    public int price(){
       int price = 0; 
        for(String a: purchases.keySet()){
            
            Purchase b = purchases.get(a); 
             price += b.price(); 
            
        }
        return price; 
    }
   
    
}
