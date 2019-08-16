
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        List grades = new List();
        Scanner s = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        while(true){
        int grade = s.nextInt(); 
        grades.addIf(grade);
        if(grade == -1)
            break;
        }
        System.out.println("");
        System.out.println(grades);
         
       
        
        
        // implement your program here
        // do not put all to one method/c505lass but rather design a proper structure to your program
        
        // Your program should use only one Scan550ner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
