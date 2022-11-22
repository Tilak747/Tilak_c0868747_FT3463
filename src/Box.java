import java.util.ArrayList;
import java.util.List;

public class Box {

    private int boxNumber;
    private int cardBoardNumber;

    private final List<SimpleItem> simpleItems;

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
        this.setBoxNumber(boxNumber);
        this.setCardBoardNumber(cardBoardNumber);
        simpleItems = new ArrayList<>();
    }

    public void addItem(Box box){
        this.simpleItems.addAll(box.getSimpleItems());
    }
    public void addItem(SimpleItem item){
        this.simpleItems.add(item);
    }

}
