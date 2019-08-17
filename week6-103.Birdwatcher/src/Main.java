import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
      Birdwatcher sadath = new Birdwatcher();  
    Scanner s = new Scanner(System.in);    
   String add = "Add"; 
   String quit = "Quit"; 
   String ob = "Observation"; 
   String show = "Show"; 
   String stat = "Statistics";
    while(true){
               System.out.print("? ");
               String userInput = s.nextLine(); 
               if(userInput.trim().equalsIgnoreCase(quit)){
                   break;
               }else if(userInput.trim().equalsIgnoreCase(add)){
                   sadath.add();
               }else if(userInput.trim().equalsIgnoreCase(ob)){
                   sadath.observation();
           }else if(userInput.trim().equalsIgnoreCase(stat)){
               sadath.statistics();
           }else if(userInput.trim().equalsIgnoreCase(show)){
               sadath.show();
           }
    }
    }
}
    

