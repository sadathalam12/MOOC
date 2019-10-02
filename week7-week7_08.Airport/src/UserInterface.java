/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadat
 */
public class UserInterface {
    
    private AirportPanel p; 
    private UserInput s; 
    public UserInterface(){
        p = new AirportPanel(); 
        s = new UserInput(); 
    }
    public void AirportPanel(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("Choose Operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        while(true){
        System.out.print("> ");
        String userInput = s.getString();
        if(userInput.equals("1")){
            p.addAirplane();
        }
        if(userInput.equals("x")){
            break;
        }
        
        }
    }
    
    
}
