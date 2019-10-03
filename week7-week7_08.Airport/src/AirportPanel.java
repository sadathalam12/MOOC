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
import java.util.HashMap; 
import java.util.Map; 
public class AirportPanel {
    private ArrayList<Plane> planes;
    private ArrayList<String> flights;
   private UserInput s;
 

   
   
    private String departtureCode; 
    private String destinationCode;
    
    public AirportPanel(){
        planes = new ArrayList<Plane>();
        flights = new ArrayList<String>();
        s = new UserInput();
       
    }
    
    public void addAirplane(){
        System.out.print("Give plane ID: ");
       String planeId = s.getString();
        System.out.print("Give plane capacity: ");
       int planeCap = s.getInt();
      planes.add(new Plane(planeId,planeCap));
         }
    
    public void addFlight(){
        System.out.print("Give plane ID: ");
        String planeId = s.getString();
        for(Plane plane: planes){
            
        if(plane.getPlaneId().equals(planeId)){
            System.out.print("Give departure airport code: ");
            String departureAirport = s.getString();
            System.out.print("Give destination airport code: ");
            String destinationAirport = s.getString();
            Flight f = new Flight(departureAirport,destinationAirport);
            flights.add(plane.getPlaneId() +" "+ "("+ plane.getPlaneCap() +")"+" "+"("+f.getDeparture()+"-"+f.getDestination()+")" );
         
          }
        }
           
             
        }
        
        
        
    
    public void printFlights(){
       for(String flight:flights){
           System.out.println(flight);
       }
           
      }
    
    public void printPlanes(){
        for(Plane plane: planes){
            System.out.println(plane.getPlaneId() +" "+ "("+plane.getPlaneCap()+")");
        }
        
    }
    
    public void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String planeId = s.getString();
        
        for(Plane plane:planes){
            if(plane.getPlaneId().equals(planeId)){
                System.out.println(plane.getPlaneId() + " " + "(" + plane.getPlaneCap()+")");
            }
        }
    }
    
        
}
