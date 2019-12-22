/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdala
 */
import java.util.ArrayList; 
public class Jumper implements Comparable<Jumper> {
    private String name; 
    private int point; 
    private ArrayList<Integer> jumpLength; 
   
    public Jumper(String name){
        this.name = name; 
        this.point = 0; 
        jumpLength = new ArrayList<Integer>(); 
    }
    
    public int getPoint(){
        return this.point; 
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setPoint(int value){
        this.point = value; 
    }
    
    public String toString(){
        return this.name + " (" + this.point + " points" + ") "; 
    }
    
    public int compareTo(Jumper j){
        return this.point - j.point; 
    }
    
    public int jump(){
        int jumpLength = 60 + (int)(Math.random()*((120-60)+1));
        this.jumpLength.add(jumpLength); 
        return jumpLength; 
        
        
    }
    
    public void printJumpLength(){
       int x = 1; 
        for(int i: this.jumpLength){
            
            if(x!= this.jumpLength.size()){
                System.out.print(i+" m, ");
            }else{
                System.out.print(i+" m");
            }
            x++; 
        }
    }
}
