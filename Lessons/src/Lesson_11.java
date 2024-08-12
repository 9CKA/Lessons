public abstract class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    private static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }
}

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean satiety;

    public Cat(String name) {
        super(name, 200, 0);
        this.satiety = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFoodAmount() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            satiety = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " не хватает еды, чтобы покушать.");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        if (foodAmount < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = foodAmount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catBarsik = new Cat("Барсик");
        Cat catMurzik = new Cat("Мурзик");

        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        dogBobik.run(150);
        dogBobik.swim(5);
        
        catBarsik.run(150);
        catBarsik.swim(5);

        Bowl bowl = new Bowl(20);
        Cat[] cats = {catBarsik, catMurzik};

        for (Cat cat : cats) {
            cat.eat(bowl, 15);
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        bowl.addFood(10);

        for (Cat cat : cats) {
            cat.eat(bowl, 15);
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }
    }
}

