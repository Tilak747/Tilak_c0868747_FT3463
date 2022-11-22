public class SimpleItem extends Item{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleItem(String name){
        this.setName(name);
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    String find(String name) {
        return getName().equals(name) ? getName() : "-1";
    }
}
