package dungeon;
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
       
    Scanner s = new Scanner(System.in); 
       Dungeon dungeon = new Dungeon(10,10,5,14,true,s);
       dungeon.run();
}
}