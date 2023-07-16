package Task8;

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

// Класс-прототип Собаки
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public Animal clone() {
        return new Dog(this.name);
    }
}

// Класс, управляющий прототипами
class AnimalPrototypes {
    private static Map<String, Animal> prototypes = new HashMap<>();

    static {
        prototypes.put("Cat", new Cat("Tom"));
        prototypes.put("Dog", new Dog("Rex"));
    }

    public static Animal getPrototype(String type) {
        Animal prototype = prototypes.get(type);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Animal catPrototype = AnimalPrototypes.getPrototype("Cat");
        if (catPrototype != null) {
            Animal cat1 = catPrototype.clone();
            cat1.setName("Whiskers");
            System.out.println("Cat 1: " + cat1.getName());

            Animal cat2 = catPrototype.clone();
            cat2.setName("Smokey");
            System.out.println("Cat 2: " + cat2.getName());
        }

        Animal dogPrototype = AnimalPrototypes.getPrototype("Dog");
        if (dogPrototype != null) {
            Animal dog1 = dogPrototype.clone();
            dog1.setName("Buddy");
            System.out.println("Dog 1: " + dog1.getName());

            Animal dog2 = dogPrototype.clone();
            dog2.setName("Max");
            System.out.println("Dog 2: " + dog2.getName());
        }
    }
}