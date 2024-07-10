public interface Sheep extends Cloneable {
    Sheep clone(); // This method will create a copy of the sheep.
    String getName(); // This method will return the sheep's name.
    void setName(String name); // This method will set the sheep's name.
}