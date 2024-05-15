import java.util.ArrayList;
import java.util.Collections;

public class Monster implements Comparable<Monster> { //The main class which accounts for generic monsters and base information for monster types.
    String name; //Creates a String that can hold a name.
    int size; //Creates an int that can hold a value for size.
    int dangerousness; //Creates an int that can hold a value for dangerousness.

    public Monster(String monsterName, int monsterSize, int monsterDangerousness) { //This is the constructor for the Monster class. It defines monster qualities.
        name = monsterName; //Sets monsterName to name.
        size = monsterSize; //Sets monsterSize to size.
        dangerousness = monsterDangerousness; //Sets monsterDangerousness to dangerousness.
    }

    public void Die() { //This method describes what happens when the monster kills you, which varies depending on how dangerous the monster is.
        System.out.print("Generic death by generic monster."); //Cause of death.
        if (dangerousness < 4){ //Severity of death.
            System.out.println(" You never stood a chance"); //Severe death
        } else if (dangerousness > 5){
            System.out.println(" You almost survived"); //Non-severe death
        }
    }

    @Override
    public int compareTo(Monster other) {
        return Integer.compare(this.size, other.size); // Compare monsters based on their size.
    }

    public static void main(String[] args) {
        ArrayList<Monster> al = new ArrayList<Monster>();
        al.add(new Monster("Frank", 4, 25));
        Monster monster1 = new Monster("Boogie Man", 7, 6); //Creates an object from the constructor in the Monster class named Boogie Man, 7 feet tall, and with a dangerousness of 6.
        Monster monster2 = new Lizard("Lizard Man", 9, 3); //Creates an object from the constructor in the Lizard class named Lizard Man, 9 feet tall, and with a dangerousness of 3 (Which should change later).
        Monster monster3 = new Kaiju("King Kong", 337, 9); //Creates an object from the constructor in the Kaiju class named King Kong, 337 feet tall, and with a dangerousness of 9.

        monster1.Die(); //Calls the version of the Die method that applies to monster1.
        monster2.Die(); //Calls the version of the Die method that applies to monster2.
        monster3.Die(); //Calls the version of the Die method that applies to monster3.
        monster2.dangerousness = 7; //Changes the dangerousness of monster2 from 3 to 7.
        monster2.Die(); //Calls the version of the Die method that applies to monster2.
        
        Collections.sort(al); // Sort monsters based on size
        System.out.println(al);// Print the sorted and compared arraylist
    }
}

class Lizard extends Monster { //Subclass that extends the Monster class.

    public Lizard(String monsterName, int monsterSize, int monsterDangerousness) { //This is the constructor for the Lizard class. It defines monster qualities.
        super(monsterName, monsterSize, monsterDangerousness);
    }

    @Override
    public void Die() { //This method describes what happens when the monster kills you, which varies depending on how dangerous the monster is.
        System.out.print("Bitten to death by a Lizard."); //Cause of death.
        if (dangerousness > 4){ //Severity of death.
            System.out.println(" You went quickly"); //Severe death
        } else if (dangerousness < 5){
            System.out.println(" You died slowly"); //Non-severe death
        }
    }
}
 //Severe death
class Kaiju extends Monster {

    public Kaiju(String monsterName, int monsterSize, int monsterDangerousness) { //This is the constructor for the Kaiju class. It defines monster qualities.
        super(monsterName, monsterSize, monsterDangerousness);
    }

    @Override
    public void Die() { //This method describes what happens when the monster kills you, which stays the same because Kaijus are just massive.
        System.out.println("Squashed by a Kaiju, not really another way to die from those."); //Cause of death.
    }
}
