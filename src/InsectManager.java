import java.util.LinkedList;

public class InsectManager {


    public static void main(String[] args) {

        LinkedList<Insect> insects = new LinkedList<Insect>();
        for(Insect i : insects){
            i.printSpeciesData();
        }

        Butterfly monarch = new Butterfly("Monarch", 4, "Orange and Black", "Milkweed");
        Butterfly yellowSwallowtail = new Butterfly("Yellow Swallowtail", 4, "Yellow and Black", "Milk Parsley");

        Bee honeyBee = new Bee("Honey Bee", 4, "Yellow and Black", true, "Jasmine");
        Bee bumbleBee = new Bee("Bumble Bee", 4, "Yellow, Black and White", false, "Clover");

    }
}
