public class Cat
{
    private String name;
    private int appetite;
    private int satiety;
    private int decrease;
    private int increase;
    // public Cat(String name)
    // {
    //     this(name);
    //     // this.name = name;
    //     // this.appetite = 10;
    //     // satiety = false;
    // }

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        satiety = 4;
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
        if(satiety < 5)
        {
            decrease = plate.decreaseFood(appetite);
            increase = plate.increaseFood(appetite, 45);
            satiety += appetite;
        }
    }

    public void makeHungry()
    {
        satiety -= 1;
    }

    @Override
    public String toString()
    {
        return name + " {appetite: " + appetite + ", satiety: " + satiety + "}.";
    }
    // public String toString()
    // {
    //     return cats;
    // }

}
