import java.util.Random;

public class JamesBondApp {
    public static void main(String[] args) throws InterruptedException{
        Random random = new Random();
        TimeBomb bomb = new TimeBomb(10);
        bomb.activate();
        Thread.sleep(random.nextInt(5000));
        bomb.disarm();



    }
}
