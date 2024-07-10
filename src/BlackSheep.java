public class BlackSheep implements Sheep {
    private String name;

    public BlackSheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        try {
            return (BlackSheep) super.clone();
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
