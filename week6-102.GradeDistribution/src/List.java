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
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    
    public void addIf(int grade){
        if(grade>=0 && grade<=60){
            grades.add(grade);
        }
    }
    
    public double getAcceptedPercentage(){
        int a = 0; 
        int grade = 0; 
        for(int i=0; i<grades.size(); i++){
            grade = grades.get(i); 
            if(grade>29)
                a++;
        }
        return 100*((double)a/grades.size()) ;
    }
    
    public int getGrade(int i){
        return grades.get(i);
    }
    
    public int distribution(int grade){
         
         int d = 0;
            
             if(grade>=0 && grade<=29){
                 d = 0; 
             }else if(grade>=30 && grade<=34){
                 d = 1; 
             }else if(grade>=35 && grade<=39){
                 d = 2; 
             }else if(grade>=40 && grade<=44){
                 d = 3; 
             }else if(grade>=45 && grade<=49){
                 d = 4; 
             }else 
                 d = 5; 
                return d; 
    }
   
   
    
    public void fiveStar(){
       this.printStar(5);
        }
    public void fourStar(){
       this.printStar(4);
    }
    public void threeStar(){
        this.printStar(3);
    }
    public void twoStar(){
         this.printStar(2);
    }
    public void oneStar(){
        this.printStar(1);
    }
    public void zeroStar(){
         this.printStar(0);
        }
    
    public void printStar(int a){
        for(int i= 0; i<grades.size(); i++){
            if(this.distribution(this.getGrade(i))==a)
                System.out.print("*");
        }
    }
   
    
    public String toString(){
        
        System.out.println("Grade distribution:");
        int a = 5; 
        for(int i = 0; i<6; i++){
           System.out.print(a+": ");
            if(a==5)
            this.fiveStar();
            if(a==4)
            this.fourStar();
            if(a==3)
            this.threeStar();
            if(a==2)
            this.twoStar();
            if(a==1)
            this.oneStar();
            if(a==0)
            this.zeroStar();
           
            System.out.println("");
            
            a--;
            
        }
 return "Acceptance percentage: "+this.getAcceptedPercentage();        
}

}


