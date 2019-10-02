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
public class AirportPanel {
    private ArrayList<Plane> planes;
    private ArrayList flights; 
   private UserInput s;
  
   
   
    private String departtureCode; 
    private String destinationCode;
    
    public AirportPanel(){
        planes = new ArrayList<Plane>();
        s = new UserInput();
    }
    
    public void addAirplane(){
        System.out.print("Give plane ID: ");
       String planeId = s.getString();
        System.out.print("Give plane capacity: ");
       int planeCap = s.getInt();
      planes.add(new Plane(planeId,planeCap));
         }
    
    public void printPlanes(){
        for(Plane plane: planes){
            System.out.print(plane.getPlaneId() + "("+plane.getPlaneCap()+")");
        }
    }
    
        
}
