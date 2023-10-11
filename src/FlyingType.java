public class FlyingType extends PokemonType {

        private final String[] typeAttacks = {"Wing Attack", "Air Slash", "Aerial Ace"};
        private final String[] typeWeaknesses = {"Electric", "Ice", "Rock"};
        private final boolean canFly;
        private final String habitat;

        public FlyingType(boolean canFly, String habitat) {
            super();
            this.canFly = canFly;
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
            String type = "Flying";
            System.out.println("Type: " + type);
        }

        public String getTypeName() {
            // returns the name of the type
            return "Flying";
        }

        public void printTypeAesthetic() {
            System.out.println("Can Fly: " + this.canFly);
            System.out.println("Habitat: " + this.habitat);
        }
}
