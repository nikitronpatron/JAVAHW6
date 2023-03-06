public class Plate
{
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public int decreaseFood(int foodToDecrease)
    {
        if(food >= foodToDecrease)
        {
            food = food - foodToDecrease;
        }
        return food;
    }

    public int increaseFood(int foodToDecrease,int foodToIncrease)
    {
        if(food <= foodToDecrease)
        {
            food = food + foodToIncrease;
        }
        return food;
    }

    @Override
    public String toString()
    {
        return "plate [" + food + "].";
    }
}
