// ДЗ:
// while (true) -> while (!plate.isEmpty())
// 1. Создать массив котов. Пусть все коты из массива по очереди едят из одной тарелки.
// В конце каждого цикла мы досыпаем в тарелку еду.
// Для досыпания еды сделать метод increaseFood в классе Plate.
// 2. Поменять поле satiety у кота с boolean на int.
// Допустим у кота апптит 10, сытность 3. Значит кот захочет поесть 7 единиц.
// 3. * Доработать поток thread в классе Cat, чтобы он каждую секунду уменьшал сытость кота на 1.

public class Main
{
    public static void main(String[] args)
    {
        // Cat[] cats = new Cat[3];
        // cats[0] = new Cat("Murzic", 3);
        // cats[1] = new Cat("Barsic", 2);
        // cats[2] = new Cat("Tuzic", 4);
        Cat murzic = new Cat("Murzik", 3);
        Cat barsic = new Cat("Barsic", 2);
        Cat tuzic = new Cat("Tuzic", 4);
        Plate plate = new Plate(50);

        while (true)
        {
            murzic.makeHungry();
            barsic.makeHungry();
            tuzic.makeHungry();
            // cats.makeHungry();
            // cats.eat(plate);
            murzic.eat(plate);
            barsic.eat(plate);
            tuzic.eat(plate);

            System.out.println(plate);
            System.out.println(murzic);
            System.out.println(barsic);
            System.out.println(tuzic);
            // System.out.println(cats);
        
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