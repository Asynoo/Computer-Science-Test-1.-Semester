package assignment2;

public class FlipCoin {

    /**
     * 
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {
        int min = 0;
        int max = 1;
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);
        return random_int;
    }
}
