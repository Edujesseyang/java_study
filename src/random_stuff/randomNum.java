

import java.util.Random;
public class randomNum {

    
    public static void main(String[] args) {
        int randNumMax100 = getRandNum(100);
        System.out.println(randNumMax100);
    }

    /**
     * @param int max: upper bond  
      @return int randNum: random int }
     */ 
    public static int getRandNum(int max) {
        int randNum = new Random().nextInt(max);
        return randNum;
    }
 
    public static int getRandNum2(int max) {
        return (int) (Math.random() * max);
}

}
