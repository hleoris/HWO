import java.util.Random;

/**
 * Java. Level 1. Lesson 6. HomeWork
 *
 * @author Sergey Khrenov
 * @version dated 1.10.2018
 */

class HW6 {
    public static void main(String[] args) {
        IAnimal[] animals = {new Cat("Bars"),
                new Dog("Pes")};
        for (IAnimal animal : animals) {
            System.out.println(animal + "  Run(150m): " + animal.run() + ", Jump(1.0m): " + animal.jump() +
                    ", Swimg(5m): " + animal.swimg());
        }

    }
}

interface IAnimal {
    boolean run();
    boolean jump();
    boolean swimg();
}
abstract class Animal implements IAnimal {
    protected  String name;
    protected int run = 150;
    protected double jump = 1.0;
    protected int swimg = 5;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Cat extends Animal {

    Cat(String name) {
        super (name);
    }
    public boolean run() {
        if (run <= 200) {
            return true;
        }
        return false;
    }
    public boolean jump() {
        if (jump <= 2.0) {
            return true;
        }
        return false;
    }
    public boolean swimg() {
        return false;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super (name);
    }
    public boolean run() {
        if (run <= 500) {
            return true;
        }
        return false;
    }
    public boolean jump() {
        if (jump <= 0.5) {
            return true;
        }
        return false;
    }
    public boolean swimg() {
        if (swimg <= 10) {
            return true;
        }
        return false;
    }
}