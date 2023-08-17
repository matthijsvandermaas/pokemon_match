public class Main {

    public static void main(String[] args) {
        Fire charmander = new Fire("Charmander", "Fire",230 , "Ember", 10, "Scratch", 8);
        System.out.println("Name: " + charmander.name +
                ", Type: " + charmander.type +
                ", xp: " + charmander.xp +
                ", Attack 1: " + charmander.attack1 +
                ", Attack Strength 1: " + charmander.attackHp1 +
                ", Attack 2: " + charmander.attack2 +
                ", Attack Strength 2: " + charmander.attackHp2);

        Thunder pikachu = new Thunder("jean-pete", "Thunder", 50, "thunder", 30, "Tackel", 8);
        System.out.println("Name: " + pikachu.name +
                ", Type: " + pikachu.type +
                ", xp: " + pikachu.xp +
                ", Attack 1: " + pikachu.attack1 +
                ", Attack Strength 1: " + pikachu.attackHp1 +
                ", Attack 2: " + pikachu.attack2 +
                ", Attack Strength 2: " + pikachu.attackHp2);

        Ghost haunter = new Ghost("haunter", "Ghost",200 , "psycobeam", 50, "Scratch", 8);
        System.out.println(
                "Name: " + haunter.name +
                ", Type: " + haunter.type +
                ", xp: " + haunter.xp +
                ", Attack 1: " + haunter.attack1 +
                ", Attack Strength 1: " + haunter.attackHp1 +
                ", Attack 2: " + haunter.attack2 +
                ", Attack Strength 2: " + haunter.attackHp2);

        Water horsea = new Water("horsea", "Water", 30, "surf", 30, "horn Attack", 15);

        System.out.println("Name: " + horsea.name +
                ", Type: " + horsea.type +
                ", xp : " + horsea.xp +
                ", Attack 1: " + horsea.attack1 +
                ", Attack Strength 1: " + horsea.attackHp1 +
                ", Attack 2: " + horsea.attack2 +
                ", Attack Strength 2: " + horsea.attackHp2);
    }
    public static void printPokemonInfo(Pokemon pokemon) {
        System.out.println("Name: " + pokemon.name +
                ", Type: " + pokemon.type +
                ", Attack 1: " + pokemon.attack1 +
                ", Attack Strength 1: " + pokemon.attackHp1 +
                ", Attack 2: " + pokemon.attack2 +
                ", Attack Strength 2: " + pokemon.attackHp2 +
                ", XP: " + getPokemonXp(pokemon));
    }
    

    public static int getPokemonXp(Pokemon pokemon) {
        if (pokemon instanceof Fire) {
            return ((Fire) pokemon).xp;
        } else if (pokemon instanceof Thunder) {
            return ((Thunder) pokemon).xp;
        } else if (pokemon instanceof Ghost) {
            return ((Ghost) pokemon).xp;
        } else if (pokemon instanceof Water) {
            return ((Water) pokemon).xp;
        } else {
            return 0;
        }
    }
}
