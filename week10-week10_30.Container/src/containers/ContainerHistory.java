/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mdala
 */
public class ContainerHistory {
    private List<Double> containerHistory; 
    
    public ContainerHistory(){
        this.containerHistory = new ArrayList<Double>(); 
    }
    
    public void add(double situation){
        this.containerHistory.add(situation);
    }
    
    public void reset(){
        this.containerHistory.clear();
    }
    
    public String toString(){
        return this.containerHistory.toString();
    }
    
    public double maxValue(){
       if(this.containerHistory.isEmpty()){
           return 0; 
       }
        Collections.sort(this.containerHistory);
       return this.containerHistory.get(this.containerHistory.size()-1);
    }
    
    public double minValue(){
       if(this.containerHistory.isEmpty()){
           return 0; 
       }
        Collections.sort(this.containerHistory);
       return this.containerHistory.get(0);
    }
    
    public double average(){
        if(this.containerHistory.isEmpty()){
            return 0; 
        }
        int sum = 0; 
        for(double d: this.containerHistory){
            sum+= d; 
        }
        return (double) sum/this.containerHistory.size();
    }
    
    public double greatestFluctuation(){
        if(this.containerHistory.isEmpty() || this.containerHistory.size()==1){
            return 0; 
        }
        double greatestFluctuation = 0; 
        for(double d: this.containerHistory){
            if(d>=this.maxValue()){
                greatestFluctuation = d; 
               
        }
        }
        return Math.abs(greatestFluctuation); 
        
    }
    
    public double variance(){
       if(this.containerHistory.isEmpty() || this.containerHistory.size()== 1){
           return 0; 
       }
        double average = this.average(); 
       double variance = 0; 
        for(double d: this.containerHistory){
          variance += (d-average);
       }
        return variance/this.containerHistory.size()-1;
    }
    
}
