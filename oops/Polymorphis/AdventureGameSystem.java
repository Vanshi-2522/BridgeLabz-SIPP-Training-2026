package oops.Polymorphis;

class GameCharacter {

    String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println("Basic Attack");
    }
}

class Warrior extends GameCharacter {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " attacks with Sword");
    }
}

class Mage extends GameCharacter {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " casts Fireball");
    }
}

class Archer extends GameCharacter {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " shoots Arrow");
    }
}

public class AdventureGameSystem {

    static void startBattle(
            GameCharacter[] characters) {

        int warriors = 0;
        int mages = 0;
        int archers = 0;

        for (GameCharacter g : characters) {

            g.performAttack();

            if (g instanceof Warrior)
                warriors++;

            else if (g instanceof Mage)
                mages++;

            else if (g instanceof Archer)
                archers++;
        }

        System.out.println(
                "\nWarriors = " + warriors);

        System.out.println(
                "Mages = " + mages);

        System.out.println(
                "Archers = " + archers);
    }

    public static void main(String[] args) {

        GameCharacter[] arr = {
                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Leon")
        };

        startBattle(arr);
    }
}
