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
import java.util.Scanner;
public class Birdwatcher {
     
    private ArrayList<Bird> birds = new ArrayList<Bird>();
    private Scanner s = new Scanner(System.in);
  
    private ArrayList<String> o = new ArrayList<String>(); 
    
    public void add(){
        String birdName; 
        String latinName; 
        System.out.print("Name: "); 
        birdName = s.nextLine(); 
       
        System.out.print("Latin Name: ");
        latinName = s.nextLine(); 
        birds.add(new Bird(birdName,latinName,0));
        
        
     }
    public String statistics(){
        Bird b; 
        for(int i = birds.size()-1; i>=0; i--){
            b = birds.get(i);
            System.out.println(b.getName() + " " + "(" + b.getLatinName() + "): "+this.numberOfObservations(b) +" observations");
        }
        return "";
        
    }
    public void observation(){
      
       String bird; 
       Bird b; 
       int a = 0; 
       
        System.out.print("What was observed:? ");
      
        bird = s.nextLine();
        
       
           
        if(this.isItThere(bird)){
        for(int i=0; i<birds.size(); i++){
        b = birds.get(i); 
        if(b.getName().equals(bird)){
         o.add(bird); 
        }
        }
        }else{
            System.out.println("It is not a bird!");
        }
            
        }
    
    public boolean isItThere(String a){
        boolean d = false;
        for(int i = 0; i<birds.size(); i++){
            Bird b = birds.get(i);
            if(b.getName().equals(a)){
                d = true; 
           
        }
  
    }
        return d; 
    }
            
        
            
        
    
            
        
    
        
    
   public int numberOfObservations(Bird b){
        
       
       int a = 0; 
       String temp = null;
       for(int i=0; i<o.size(); i++){
           temp = o.get(i);
           if(b.getName().equals(temp)){
               a++;
           }
           
       }
      return a;
   }
            
    
    public void show(){
        String bird; 
        Bird b; 
        System.out.print("What? " );
        bird = s.nextLine(); 
        if(this.isItThere(bird)){
        for(int i =0; i<birds.size(); i++){
            b = birds.get(i); 
            if(b.getName().equals(bird))
                System.out.print(b.getName()+" "+"("+b.getLatinName()+"): "+this.numberOfObservations(b)+" observations");
            }
        }else{
            System.out.println("It is not a bird!");
        }
            
       
    }
    
   
    
}
