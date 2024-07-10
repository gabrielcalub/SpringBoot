public class WhiteSheep implements Sheep {
    private String name;

    public WhiteSheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        try {
            return (WhiteSheep) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
