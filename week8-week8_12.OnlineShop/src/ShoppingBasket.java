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
import java.util.List;

 
public class ShoppingBasket {
    List<Purchase> purchases;  
    
    public ShoppingBasket(){
       this.purchases = new ArrayList<Purchase>(); 
    }
  
    
    public void add(String product, int price){
        purchases.add(new Purchase(product,1,price));
        
    }
    
    public int price(){
       int price = 0; 
       
        for(Purchase a: purchases){
            
            
             price += a.price();
            
        }
        return price; 
    }
   
    
}
