import java.util.ArrayList;
import java.util.List;

public class Box extends Item{

    private int boxNumber;
    private int cardBoardNumber;

    private final List<SimpleItem> simpleItems;
    private final List<Box> boxes;

    public List<SimpleItem> getSimpleItems() {
        return simpleItems;
    }


    public int getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(int boxNumber) {
        this.boxNumber = boxNumber;
    }

    public int getCardBoardNumber() {
        return cardBoardNumber;
    }

    public void setCardBoardNumber(int cardBoardNumber) {
        this.cardBoardNumber = cardBoardNumber;
    }

    public Box(int boxNumber, int cardBoardNumber) {
        this.name = "Box";
        this.setBoxNumber(boxNumber);
        this.setCardBoardNumber(cardBoardNumber);
        simpleItems = new ArrayList<>();
        boxes = new ArrayList<>();
    }

    public void addItem(Box box){
        this.boxes.add(box);
        this.simpleItems.addAll(box.getSimpleItems());
    }
    public void addItem(SimpleItem item){
        this.simpleItems.add(item);
    }

    @Override
    public String find(String name){
        for(SimpleItem item:this.getSimpleItems()){
            if(item.getName().equals(name)){
                return ""+this.getCardBoardNumber();
            }
        }
        return "-1";
    }


    @Override
    public String toString() {
        String msg = "";
        int size = getSimpleItems().size();
        for(int i = 0;i <getSimpleItems().size() ; i++){
            if(i == (size - 1)){
                msg = msg + getSimpleItems().get(i) + "";
            }
            else{
                msg = msg + getSimpleItems().get(i) +"\n";
            }
        }
        return msg;
    }
}
