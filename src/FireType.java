public class FireType extends PokemonType {

    private final String[] typeAttacks = {"Fire Blast", "Flamethrower", "Fire Punch"};
    private final String[] typeWeaknesses = {"Water", "Ground", "Rock"};
    private String FireColour;
    private String FireSize;

    public FireType(String fireColour, String fireSize) {
        super();
        this.FireColour = fireColour;
        this.FireSize = fireSize;
    }

    public void printAllTypeAttacks() {
        System.out.println("------------------");
        System.out.println("Type Attacks:");
        for (String attack : this.typeAttacks) {
            System.out.println(attack);
        }
        System.out.println("------------------");

    }

    public void printAllTypeWeaknesses() {
        System.out.println("------------------");
        System.out.println("Type Weaknesses:");
        for (String weakness : this.typeWeaknesses) {
            System.out.println(weakness);
        }
        System.out.println("------------------");
    }

    @Override
    public void printType() {
        String type = "Fire";
        System.out.println("Type: " + type);
    }

    public String getTypeName() {
        // returns the name of the type
        return "Fire";
    }

    public void printTypeAesthetic() {
        System.out.println("Fire Colour: " + this.FireColour);
        System.out.println("Fire Size: " + this.FireSize);
    }
}
