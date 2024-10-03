
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Dog> dogList = new ArrayList<>();
        Map<String, Dog> dogMap = new HashMap<>();

        // Create a Dog object
        Dog myDog = new Dog("Maggie", "Golden Doodle", 12);
        Dog myDog2 = new Dog("Pumpkin", "Black Lab", 3);

        // Add myDog to the list
        dogList.add(myDog);
        dogList.add(myDog2);

        // Add myDog to a map
        dogMap.put(myDog.name, myDog);
        dogMap.put(myDog2.name, myDog2);

        //System.out.println(dogList);

        //System.out.println(dogMap);

        int ageDifference = calculateAgeDifference(myDog, myDog2);
        System.out.println("The age difference between " + myDog.name + " and " + myDog2.name + " is: " + ageDifference);
    }

    public static int calculateAgeDifference(Dog myDog, Dog myDog2) {
        return myDog.getAge() - myDog2.getAge();
    }

}
