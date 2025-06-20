import java.util.*;

public class Dog {
    private String breed;
    private String name;
    private List<Paw> paws = new ArrayList<>(4);

    public Dog(){
        this.breed = "";
        this.name = "";
        this.paws = null;
    }
}
