import java.util.ArrayList;
import java.util.Collections;

public class Monster implements Comparable<Monster> {
    String name;
    int size;
    int dangerousness;

    public Monster(String monsterName, int monsterSize, int monsterDangerousness) {
        name = monsterName;
        size = monsterSize;
        dangerousness = monsterDangerousness;
    }

    public void Die() {
        System.out.print("Generic death by generic monster.");
        if (dangerousness < 4){
            System.out.println(" You never stood a chance");
        } else if (dangerousness > 5){
            System.out.println(" You almost survived");
        }
    }

    @Override
    public int compareTo(Monster other) {
        return Integer.compare(this.size, other.size); // Compare based on size
    }

    public static void main(String[] args) {
        ArrayList<Monster> al = new ArrayList<Monster>();
        al.add(new Monster("Frank", 4, 25));
        Monster monster1 = new Monster("Boogie Man", 7, 6);
        Monster monster2 = new Lizard("Lizard Man", 9, 3);
        Monster monster3 = new Kaiju("King Kong", 337, 9);

        monster1.Die();
        monster2.Die();
        monster3.Die();
        monster2.dangerousness = 7;
        monster2.Die();

        // Sort monsters based on size
        Collections.sort(al);

        System.out.println(al);
    }
}

class Lizard extends Monster {

    public Lizard(String monsterName, int monsterSize, int monsterDangerousness) {
        super(monsterName, monsterSize, monsterDangerousness);
    }

    @Override
    public void Die() {
        System.out.print("Bitten to death by a Lizard.");
        if (dangerousness > 4){
            System.out.println(" You went quickly");
        } else if (dangerousness < 5){
            System.out.println(" You died slowly");
        }
    }
}

class Kaiju extends Monster {

    public Kaiju(String monsterName, int monsterSize, int monsterDangerousness) {
        super(monsterName, monsterSize, monsterDangerousness);
    }

    @Override
    public void Die() {
        System.out.println("Squashed by a Kaiju, not really another way to die from those.");
    }
}