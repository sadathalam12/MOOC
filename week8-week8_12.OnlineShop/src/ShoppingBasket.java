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
    private List<Purchase> purchases;  
    
    public ShoppingBasket(){
       this.purchases = new ArrayList<Purchase>(); 
    }
  
    
    public void add(String product, int price){
        
        Purchase a = new Purchase(product, 1, price); 
        if(!purchases.contains(a)){
            purchases.add(a); 
        }else{
            a.increaseAmount();
          }
       }
        
          
        
        
    
    
    
    public int price(){
       int price = 0; 
       
        for(Purchase a: purchases){
            
            
             price += a.price();
            
        }
        return price; 
    }
    
    public void print(){
        for(Purchase a: purchases){
            System.out.println(a);
        }
    }
   
    
}

