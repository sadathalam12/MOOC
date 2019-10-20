/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadat
 */
public class Purchase {
    private String product; 
    private int amount; 
    private int unitPrice; 
    
    public Purchase(String product, int amount, int unitPrice){
        this.product = product; 
        this.amount = amount; 
        this.unitPrice = unitPrice; 
        
    }
    public String getProduct(){
        return product; 
    }
    public int getAmount(){
        return amount; 
    }
    public int getUnitPrice(){
        return unitPrice; 
    }
    
    
    public int price(){
        return this.unitPrice*this.amount; 
    }
    
    public void increaseAmount(){
        this.amount++; 
    }
    
    public String toString(){
        return this.product +": "+ this.amount; 
    }
    
    public boolean equals(Object o){
        if(this.getClass() != o.getClass()){
            return false; 
        }
        Purchase difference = (Purchase) o; 
        if(difference.getProduct() == this.getProduct() && difference.getAmount() == this.getAmount() && difference.getUnitPrice() == this.getUnitPrice()){
            return true; 
        }else
            return false;
            
        
    }
    
    
}
