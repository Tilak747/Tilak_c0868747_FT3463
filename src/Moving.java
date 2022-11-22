import java.util.ArrayList;
import java.util.List;

public class Moving {

    private final List<Box> boxes;

    public Moving(int size){
        boxes = new ArrayList<>(size);
    }

    public void addBox(Box box){
        boxes.add(box);
    }

    public String find(String name){
        for(Box box:boxes){
            for(SimpleItem item:box.getSimpleItems()){
                if(item.getName().equals(name)){
                    return ""+box.getCardBoardNumber();
                }
            }
        }
        return "";
    }

    public void print(){
        System.out.println("The objects of my move are:");
        for(Box box : boxes){
            for(SimpleItem item:box.getSimpleItems()){
                System.out.println(item);
            }
        }
    }



}
