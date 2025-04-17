
import java.util.Random;

public class pickRandPerson {

    public static void main(String[] args) {
        String[] testCase1 = {"Jesse", "Tom", "Maxx", "Lee", "Jack"};
        String[] testCase2 = {"Lucky", "Sushi", "Cooky", "Noodle", "Klee"};

        String person1 = randPick(testCase1);
        String person2 = randPick(testCase2);

        System.out.println(person1);
        System.out.println(person2);

    }

    /**
     * @param names: String array, name list
     * @return string, a random name element of input array
     */
    public static String randPick(String[] names){
        int max = names.length;
        int randIndex = new Random().nextInt(max);
        return names[randIndex];
    }
}
