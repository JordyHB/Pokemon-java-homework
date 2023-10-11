public abstract class PokemonType {

    abstract void printAllTypeAttacks();

    abstract void printAllTypeWeaknesses();
    abstract void printTypeAesthetic();

    abstract String getTypeName();


    public void printAllInfo() {
        System.out.println("<-------------------------->");
        printType();
        printTypeAesthetic();
        printAllTypeAttacks();
        printAllTypeWeaknesses();
        System.out.println("<-------------------------->");

    }

    public void printType() {
        System.out.println("This Pokemon has no type.");
    }
}
