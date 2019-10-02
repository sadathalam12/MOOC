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
        while(true){
        System.out.println("Choose Operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
      
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
    
    public void flightService(){
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        while(true){
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        
        String userInput = s.getString();
        if(userInput.equals("1")){
            p.printPlanes();
        }
        if(userInput.equals("x")){
            break;
        }
        
    }
    }
    
}
