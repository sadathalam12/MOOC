/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadat
 */
public class Plane {
    private String planeId; 
    private int planeCap; 
    
    public Plane(String planeId, int planeCap){
        this.planeId = planeId; 
        this.planeCap = planeCap;
        
    }
    public String getPlaneId(){
        return this.planeId; 
    }
    public int getPlaneCap(){
        return this.planeCap;
    }
    
}
