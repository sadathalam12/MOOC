import containers.*; 
import java.util.List; 
import java.util.ArrayList; 
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        // write test code here
        ContainerHistory c = new ContainerHistory(); 
        c.add(3);
        c.add(2);
        c.add(7);
        c.add(2);
        System.out.println(c.average());
        System.out.println(c.greatestFluctuation());
    }

}
