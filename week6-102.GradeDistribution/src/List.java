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

public class List {
  
    
    public double getAcceptedPercentage(ArrayList<Integer> grades){
        int a = 0; 
        int grade = 0; 
        for(int i=0; i<grades.size(); i++){
            grade = grades.get(i); 
            if(grade>29)
                a++;
        }
        return 100*(a/grades.size()) ;
    }
    
   
    
    
    
}
