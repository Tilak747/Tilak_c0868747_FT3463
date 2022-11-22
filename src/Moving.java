import java.util.ArrayList;
import java.util.List;

public class Moving {

    private final List<Item> items;

    public Moving(int size){
        items = new ArrayList<>(size);
    }

    public void addBox(Item item){
        items.add(item);
    }

    public String find(String name){

        for(Item item:items){
            return item.find(name);
        }
        return "-1";
    }

    public void print(){
        System.out.println("The objects of my move are:");
        for(Item box : items){
            System.out.println(box);
        }
    }



}
