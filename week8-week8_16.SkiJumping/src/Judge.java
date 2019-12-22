/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdala
 */
import java.util.Arrays;
public class Judge {
    
    public int[] jumperPoints(Jumper jumper){
        int[] judgeScores = new int[5]; 
        int i = 0; 
        while(i<judgeScores.length){
            int score =10+(int) (Math.random()*((20-10)+1)); 
            judgeScores[i]=score; 
            i++; 
        }
        return judgeScores; 
    }
}
