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
    private int unitPrice; // shouldn't this be a double, since it's a price???
    private final int DEFAULT_AMOUNT = 1;
    private final int DEFAULT_PRICE = 1;
    
    public Purchase(String product, int amount, int unitPrice){
        this.product = product; 
        this.amount = (amount < 0) ? DEFAULT_AMOUNT : amount; // WHAT HAPPENS IF AMOUNT ENTERED IS NEGATIVE??? 
        this.unitPrice = unitPrice; // WHAT HAPPENS IF PRICE ENTERED IS NEGATIVE???
        
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
    
    
}
