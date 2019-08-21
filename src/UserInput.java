/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadat
 */
import java.util.Scanner;
public class UserInput {
    
    Scanner s = new Scanner(System.in); 
    
    public int getNextInt(){
        return s.nextInt();
    }
    public String getNextLine(){
        return s.nextLine();
    }
   
    
}
