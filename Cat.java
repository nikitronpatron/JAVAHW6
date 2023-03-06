public class Cat
{
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name)
    {
        this(name, 10);
        // this.name = name;
        // this.appetite = 10;
        // satiety = false;
    }

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    // new Thread(() ->
    // {
    //     while(true)
    //     {
    //         satiety = false;
    //         try 
    //         {
    //             Thread.sleep(5 * 1000L);
    //         }
    //         catch(InterruptedException ex)
    //         {
    //             Thread.currentThread().interrupt();
    //             //throw new RuntimeException(ex);
    //         }
    //     }
    // }).start();

    public void eat(Plate plate)
    {
        if(!satiety)
        {
            satiety = plate.decreaseFood(appetite);
        }
    }

    public void makeHungry()
    {
        satiety = false;
    }

    @Override
    public String toString()
    {
        return name + " {appetite: " + appetite + ", satiety: " + satiety + "}.";
    }

}
