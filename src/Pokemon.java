import java.util.ArrayList;

public class Pokemon {

    private String name;
    private final String gender;
    private int level;
    private final boolean shiny;
    private final ArrayList<PokemonType> types;
    public Pokemon(String name, String gender, int level, boolean shiny, ArrayList<PokemonType> types) {
        this.name = name;
        this.gender = gender;
        this.level = level;
        this.shiny = shiny;
        this.types = types;

    }

    public void printAllInfo() {
        System.out.println("------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Level: " + this.level);
        System.out.println("Is Shiny: " + this.shiny);
        System.out.println("Types: " + getTypeNames());
        System.out.println("------------------");
    }

    public void petPokemon() {
        System.out.println(this.name + " lets out content noises upon being pet.");
    }

    public String getTypeNames() {
        // makes a nice string that follows the format of "this pokemon is a water/fire type"
        StringBuilder typeString = new StringBuilder();
        for (int i = 0; i < this.types.size(); i++) {
            typeString.append(this.types.get(i).getTypeName());
            // ads a / in between if this is not the last type
            if (i != this.types.size() - 1) {
                typeString.append("/");
            }
        }
        return typeString.toString();
    }

    public void printTypeNames() {
        System.out.println("This pokemon is a " + getTypeNames() + " type.");
    }

    public void printAllTypeSpecificInfo() {
        for (PokemonType type : this.types) {
            type.printAllInfo();
        }
    }

    public PokemonType getType(String type) {
        for (PokemonType pokemonType : this.types) {
            // returns if the type name matches
            if (pokemonType.getTypeName().equalsIgnoreCase(type)) {
                return pokemonType;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isShiny() {
        return shiny;
    }
}
