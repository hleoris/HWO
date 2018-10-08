import java.util.Scanner;

/**
 * Java. Level 1. Lesson 7. HomeWork
 *
 * @author Sergey Khrenov
 * @version dated 04.10.2018
 */
class HW7 {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Bozon", 10, true),
                new Cat("Kleo", 25, true),
                new Cat("Garfild", 20, true)};
        Plate plate = new Plate(50);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
        plate.addEat(30);
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite, boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
    }

    void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            hungry = false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name: '" + name + '\'' +
                ", hungry: " + hungry +
                '}';
    }
}

class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood() {
        this.food = food;
    }

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int food) {
        this.food -= food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }

     void addEat(int x) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Add food to the plate? Yes - 1 / No - 2");
         int a = scanner.nextInt();
         if (a == 1) {
             food = food + x;
         } else {
             scanner.close();
         }
     }
}