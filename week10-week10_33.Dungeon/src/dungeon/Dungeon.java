/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

/**
 *
 * @author mdala
 */
public class Dungeon {
    private List<VampirePiece> vampires; 
    private GameBoard gameBoard; 
    private PlayerPiece player;
    boolean vampiresMove; 
    private int moves; 
    private Scanner s = new Scanner(System.in);
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove, Scanner s){
        this.gameBoard = new GameBoard(length, height); 
        this.vampires = new ArrayList<VampirePiece>(); 
        this.player = new PlayerPiece(); 
        for(int i = 0; i<vampires; i++){
            this.vampires.add(new VampirePiece(length,height));
        }
        vampiresMove = false; 
        this.vampiresMove =vampiresMove; 
        this.moves = moves; 
        this.s = s; 
    }
    
    public void run(){
            System.out.println(moves);
            System.out.println("");
            System.out.println(player);
            for(VampirePiece v: vampires){
                System.out.println(v);
            }
            System.out.println("");
            gameBoard.setPlayer(player);
            for(VampirePiece v: vampires){
            gameBoard.setVampire(v);
            }
            gameBoard.printGameBoard();
            System.out.println("");
            while(true){
                if(moves==0 && vampires.size()!=0){
                    System.out.println("You lose");
                    break;
                }
                if(vampires.size()==0){
                    System.out.println("YOU WIN");
                    break;
                }
            List<VampirePiece> toBeRemoved = new ArrayList<VampirePiece>(); 
            String userInput = s.nextLine(); 
            String[] a = new String[userInput.length()];
            for(int i = 0; i<userInput.length(); i++){
                a[i] = userInput.substring(i, i+1); 
            }
            for(int i = 0; i<a.length; i++){
                if(a[i] == "s"){
                    gameBoard.movePlayerDown(player);
                    toBeRemoved = deadVampires();
                }else if(a[i] == "w"){
                    gameBoard.movePlayerUp(player);
                    toBeRemoved = deadVampires(); 
                }else if(a[i] == "d"){
                    gameBoard.movePlayerRight(player);
                    toBeRemoved = deadVampires(); 
                }else if(a[i] == "a"){
                    gameBoard.movePlayerLeft(player);
                    toBeRemoved = deadVampires(); 
                }
            }
            vampires.removeAll(toBeRemoved); 
            
            if(!userInput.isEmpty()){
               vampiresMove = true; 
            }
            for(VampirePiece v: vampires){
                for(int i= 0; i<userInput.length(); i++){
                    gameBoard.moveVampire(vampiresMove, v);
                    toBeRemoved = deadVampires(); 
                }
            }
                vampires.removeAll(toBeRemoved); 
            moves--; 
            
                System.out.println(moves);
                System.out.println("");
                System.out.println(player);
                for(VampirePiece va: vampires){
                    System.out.println(va);
                }
                System.out.println("");
                gameBoard.printGameBoard();
            
            
            }
        
    }
    
    public List<VampirePiece> deadVampires(){
        List<VampirePiece> deadVampires = new ArrayList<VampirePiece>(); 
        for(VampirePiece v: vampires){
            if(v.getX() == player.getX() && v.getY() == player.getY()){
                deadVampires.add(v);
            }
        }
        return deadVampires; 
    }
    
}
