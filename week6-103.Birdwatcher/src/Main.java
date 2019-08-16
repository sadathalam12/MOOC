import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
      Birdwatcher sadath = new Birdwatcher();  
    Scanner s = new Scanner(System.in);    
    while(true){
               System.out.print("? ");
               String userInput = s.nextLine(); 
               if(userInput.equals("Quit")){
                   break;
               }else if(userInput.equals("Add")){
                   sadath.add();
               }else if(userInput.equals("Observation")){
                   sadath.observation();
           }else if(userInput.equals("Statistics")){
               sadath.statistics();
           }else if(userInput.equals("Show")){
               sadath.show();
           }
    }
    }
}
    

