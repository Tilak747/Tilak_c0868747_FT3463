public class SimpleItem extends Box{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleItem(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
