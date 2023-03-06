import java.time.Duration;
// import java.sql.Array;
import java.util.concurrent.*;

public class Main
{
    public static void main(String[] args)
    {
        Cat murzic = new Cat("Murzik", 15);
        Cat barsic = new Cat("Barsic");
        Plate plate = new Plate(200);
        
        while (true)
        {
            murzic.makeHungry();
            barsic.makeHungry();

            murzic.eat(plate);
            barsic.eat(plate);

            System.out.println(plate);
            System.out.println(murzic);
            System.out.println(barsic);
        
            try 
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}