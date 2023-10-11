import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon(
                "Charizard",
                "Female",
                10,
                false,
                new ArrayList<>(List.of(
                        new FireType("Yellow", "Small"),
                        new FlyingType(true, "Large")
                )));
        Pokemon p2 = new Pokemon(
                "Blastoise",
                "Male",
                99,
                true,
                new ArrayList<>(List.of(
                        new WaterType(true, "Large"),
                        new GroundType(true, "Small")
                )));
        p1.printAllInfo();
        p1.petPokemon();
        p1.printTypeNames();
        p1.printAllTypeSpecificInfo();
        p1.getType("Fire").printTypeAesthetic();
        p2.printAllInfo();
        p2.petPokemon();
        p2.printTypeNames();
        p2.printAllTypeSpecificInfo();
        p2.getType("Water").printTypeAesthetic();
    }
}
