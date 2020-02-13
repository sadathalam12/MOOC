/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random; 

/**
 *
 * @author mdala
 */
public class GameBoard {
    
    private List<char[]> gameBoard; 
    private int length; 
    private int height; 
    public GameBoard(int length, int height){
        if(length<=0 || height <= 0 ){
            throw new IllegalArgumentException("length and height must be greater than 0"); 
        }
        this.length = length; 
        this.height = height; 
        this.gameBoard = new ArrayList<char[]>();
        char s = '.'; 
        for(int i=0; i<height; i++){
            char [] x = new char[length]; 
            for(int j = 0 ; j<length; j++){
                x[j] = s; 
            }
            gameBoard.add(x);
        }
        
    }
    
    public void printGameBoard(){
        for(char[]x: gameBoard){
            for(char s: x){
                System.out.print(s);
            }
            System.out.println("");
        }
   }
    public void setPlayer(PlayerPiece player){
        char [] a = gameBoard.get(0); 
        a[0] = player.getPlayer();
    }
   
   public void setVampire(VampirePiece vampire){
       
       char[] a = gameBoard.get(vampire.getY()); 
       if(a[vampire.getX()] != 'v' && a[vampire.getX()] != '@'){
           a[vampire.getX()] = vampire.getVampire();
       }else {
           vampire.setX(0+new Random().nextInt(length));
           vampire.setY(0+new Random().nextInt(height));
           this.setVampire(vampire);
       }
    }
   
   public void movePlayerUp(PlayerPiece player){
       int oldY = player.getY(); 
       if(player.getY()>0){
           player.setY(player.getY()-1);
           char[] a = gameBoard.get(player.getY());
           a[player.getX()] = player.getPlayer();
           char[] b = gameBoard.get(oldY);
           b[player.getX()] = '.'; 
           
       }else{
           System.out.println("You cant go that way anymore");
       }
   }
   
   public void movePlayerDown(PlayerPiece player){
       int oldY = player.getY(); 
       if(player.getY()<height-1){
           player.setY(player.getY()+1);
           char[] a = gameBoard.get(player.getY()); 
           a[player.getX()] = player.getPlayer();
           char[] b = gameBoard.get(oldY); 
           b[player.getX()] = '.'; 
       }else{
           System.out.println("You cant go that way anymore");
       }
   }
   
   public void movePlayerRight(PlayerPiece player){
       int oldX = player.getX(); 
       if(player.getX()<length-1){
           player.setX(player.getX()+1);
           char[] a = gameBoard.get(player.getY()); 
           a[player.getX()] = player.getPlayer();
           a[oldX] = '.'; 
       }else{
           System.out.println("You cant go that way anymore");
       }
   }
   
   public void movePlayerLeft(PlayerPiece player){
       int oldX = player.getX(); 
       if(player.getX()>0){
           player.setX(player.getX()-1);
           char[] a = gameBoard.get(player.getY()); 
           a[player.getX()] = player.getPlayer();
           a[oldX] = '.'; 
       }else{
           System.out.println("You cant got that way");
       }
    }
    
   public void moveVampire(boolean vampireMoves,VampirePiece vampire){
       if(vampireMoves){
           int vampireX = vampire.getX(); 
           int vampireY = vampire.getY(); 
           int num = new Random().nextInt(4);
           while(true){
           if(num==0){
               if(vampireX<length-1){
                char[] a = gameBoard.get(vampireY);
                if(a[vampireX+1] == '.'){
               vampire.setX(vampireX+1);
               a[vampire.getX()] = vampire.getVampire();
               a[vampireX] = '.';
               break;
                }else if(a[vampireX+1] == '@'){
                   a[vampire.getX()]= '.'; 
                    break;
                }

              }else{
                   num = new Random().nextInt(4);
               }
           } 
           if(num==1){
               if(vampireX>0){
                   char[] a = gameBoard.get(vampireY); 
               if(a[vampireX-1] =='.'){
               vampire.setX(vampireX-1);
               a[vampire.getX()] = vampire.getVampire();
               a[vampireX] = '.'; 
               break;
               }else if(a[vampireX-1] == '@'){
                   a[vampire.getX()] = '.'; 
                   break;
               }
              
               }else{
                   num = new Random().nextInt(4); 
               }
           } 
           if(num==2){
               if(vampireY>0){
                char[] a = gameBoard.get(vampireY-1);
                if(a[vampire.getX()] == '.'){
                   vampire.setY(vampireY-1);
                   a[vampire.getX()] = vampire.getVampire();
                   char[] b = gameBoard.get(vampireY); 
                   b[vampire.getX()] = '.';
                   break;
               }else if(a[vampire.getX()]=='@'){
                   char[] b = gameBoard.get(vampireY); 
                   b[vampire.getX()] = '.'; 
                   break;
               }
               }else{
                   num = new Random().nextInt(4); 
               }
           } 
           if(num==3){
               if(vampireY<height-1){
                   char[]a = gameBoard.get(vampireY+1); 
                   if(a[vampire.getX()]=='.'){
                   vampire.setY(vampireY+1);
                   a[vampire.getX()] = vampire.getVampire();
                   char[] b = gameBoard.get(vampireY); 
                   b[vampire.getX()] = '.';
                   break;
               }else if(a[vampire.getX()]=='@'){
                   char[] b = gameBoard.get(vampireY); 
                   b[vampire.getX()] = '.'; 
                   break;
               }
           }else{
                   num = new Random().nextInt(4); 
               }
           }
           
           
   }
       }
   }
   
}
   


