public class WaterType extends PokemonType {

    private final String[] typeAttacks = {"Water Blast", "Water Gun", "Water Punch"};
    private final String[] typeWeaknesses = {"Fire", "Ground", "Rock"};
    private final boolean amphibious;
    private final String habitat;

    public WaterType(boolean amphibious, String habitat) {
        super();
        this.amphibious = amphibious;
        this.habitat = habitat;
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
        String type = "Water";
        System.out.println("Type: " + type);
    }

    public String getTypeName() {
        // returns the name of the type
        return "Water";
    }

    public void printTypeAesthetic() {
        System.out.println("Amphibious: " + this.amphibious);
        System.out.println("Habitat: " + this.habitat);
    }
}
