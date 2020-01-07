package moving;
import moving.domain.Item;
import moving.domain.Thing; 
import java.util.ArrayList; 
import java.util.Collections;
import java.util.List; 
import moving.domain.Box;
import moving.logic.Packer;

public class Main {

    public static void main(String[] args) {
        // test your program here
      /* List<Item> items = new ArrayList<Item>();
    items.add(new Item("passport", 2));
    items.add(new Item("toothbrash", 1));
    items.add(new Item("circular saw", 100));

    Collections.sort(items);
    System.out.println(items);
    }*/
 
 /*Box box = new Box(10); 
 Thing shoe = new Item("Nike shoe",2); 
 Thing console = new Item("Playstation 5", 3); 
 
 box.addThing(shoe); 
 box.addThing(console);
 box.addThing(console);
 box.addThing(shoe); 
 box.addThing(shoe); 
        System.out.println(box.getVolume());*/
      
      // the things we want to pack
 /* List<Thing> things = new ArrayList<Thing>();
    things.add(new Item("passport", 2));
    things.add(new Item("toothbrash", 1));
    things.add(new Item("book", 4));
    things.add(new Item("circular saw", 8));

    // we create a packer which uses boxes whose valume is 10
    Packer packer = new Packer(10);

    // we ask our packer to pack things into boxes
    List<Box> boxes = packer.packThings( things );

    System.out.println("number of boxes: "+boxes.size());

    for (Box box : boxes) {
        System.out.println("  things in the box: "+box.getVolume()+" dm^3");
    }*/
       Box box = new Box(1000); 
        Item item = new Item("Stone", 1000); 
        Item shoe = new Item("Shoe" ,999); 
        box.addThing(item); 
        box.addThing(shoe); 
        System.out.println(box.getVolume());
       
}
}

