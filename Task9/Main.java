package Task9;

import java.util.HashMap;
import java.util.Map;

// Абстрактный класс животного
abstract class Animal implements Cloneable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract Animal clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Класс-прототип Кота
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public Animal clone() {
        return new Cat(this.name);
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Animal catPrototype = new Cat("Tom");
        Animal cat1 = catPrototype.clone();
        cat1.setName("Whiskers");
        System.out.println("Cat 1: " + cat1.getName());

        Animal cat2 = catPrototype.clone();
        cat2.setName("Smokey");
        System.out.println("Cat 2: " + cat2.getName());
    }
}