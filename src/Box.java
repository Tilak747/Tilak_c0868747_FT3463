import java.util.ArrayList;
import java.util.List;

public class Box {

    private int boxNumber;
    private int cardBoardNumber;


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

    public Box(int boxName, int itemNumber) {
        this.boxNumber = boxName;
        this.cardBoardNumber = itemNumber;
    }

}
