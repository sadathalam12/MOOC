/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadat
 */
import java.util.List;

public class Phonebook {
    
    private List<Person> people = new ArrayList<Person>(); 
    
    public void add(String name, String phoneNumber ) {
        Person p = new Person(name, phoneNumber); 
        people.add(p);     
    }
    
    public void printAll() {
        for (int i = 0; i<people.size();i++) {
            System.out.println(people.get(i));
        }
    }
    
    public String searchNumber(String name) {
       int i = 0; 
       String a = null;  
       Person x; 
      
       while (i<people.size()) {
           x = people.get(i); 
          
           if (x.getName().equals(name))  {
               a = x.getNumber(); 
           } else {
              a = "not known number"; 
           }
           
           i++;  
       }
       
       return a; 
    }
}
        
    
    

