public class GroundType extends PokemonType {

        private final String[] typeAttacks = {"Earthquake", "Mud Bomb", "Mud Slap"};
        private final String[] typeWeaknesses = {"Water", "Grass", "Ice"};
        private final boolean canDig;
        private final String habitat;

        public GroundType(boolean canDig, String habitat) {
            super();
            this.canDig = canDig;
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
            String type = "Ground";
            System.out.println("Type: " + type);
        }

        public String getTypeName() {
            // returns the name of the type
            return "Ground";
        }

        public void printTypeAesthetic() {
            System.out.println("Can Dig: " + this.canDig);
            System.out.println("Habitat: " + this.habitat);
        }
}
