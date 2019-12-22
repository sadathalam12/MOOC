/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdala
 */
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Collections;
public class UserInterface {
    private Scanner s= new Scanner(System.in); 
    private ArrayList<Jumper> jumpers; 
    private Judge judge; 
    public UserInterface(Scanner s){
        this.s = s; 
        jumpers = new ArrayList<Jumper>(); 
        judge = new Judge();
        
    }
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        makeJumpers();
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        jumpRound(); 
        printEndResults(); 
        
        
    }
    
    public void makeJumpers(){
        while(true){
            
        System.out.print("  Participant name: ");
        String jumperName = s.nextLine();
        if(!jumperName.isEmpty()){
        jumpers.add(new Jumper(jumperName)); 
        }else
            break;
       }
    }
    
    public void jumpRound(){
       int round = 1; 
       while(true){
           System.out.print("Write \"jump\" to jump; otherwise you quit: ");
           String userInput = s.nextLine();
            if(!userInput.equals("jump")){
                System.out.println("");
               System.out.println("Thanks!");
               break;
           }else{
           System.out.println("");
           System.out.println("Round "+round);
           System.out.println("");
           System.out.println("Jumping Order:");
           Collections.sort(jumpers);
           int i = 1; 
           for(Jumper j: jumpers){
               System.out.print("  ");    
               System.out.print(i+". "+j);
               i++; 
               System.out.println("");
           }
           System.out.println("Results of round "+ round);
                //System.out.print(" ");
           jumperPoint(); 
           round++; 
        }
    }
    }
    
    public void jumperPoint(){
        int[] judgeScores = new int[5]; 
        for(Jumper j : jumpers){
          judgeScores = judge.jumperPoints(j);
        int  judgePoint = sumOfArray(judgeScores); 
          int jumpLength = j.jump(); 
          j.setPoint(jumpLength+judgePoint+j.getPoint());
            System.out.print(" ");
            System.out.println(j.getName());
            System.out.println("   length: " + jumpLength);
            System.out.println("   judge votes: "+ Arrays.toString(judgeScores));
        }
        System.out.println("");
        
    }
    
    public int sumOfArray(int [] a){
       Arrays.sort(a);
       int sum = 0; 
       for(int i =1; i<4; i++){
           sum+=a[i];
       }
       return sum; 
        }
    
    public void printEndResults(){
        System.out.println("");
        System.out.println("Tournament results: ");
        System.out.println("Position    Name");
        int a = 1; 
        Collections.reverse(jumpers);
        for(Jumper j: this.jumpers){
            System.out.println(a +"           "+ j);
            System.out.print("            jump lengths: ");
            j.printJumpLength();
            System.out.println("");
            a++; 
            
        }
        
    }
    }
    

