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
   private Scanner s; 
    public UserInput(){
        s = new Scanner(System.in);
    }
    public String getString(){
        return s.nextLine();
    }
    public int getInt(){
        return s.nextInt();
    }
    
    
    
}
