package Task11;

interface Animal {
    void makeSound();
}
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
abstract class AnimalDecorator implements Animal {
    protected Animal decoratedAnimal;

    public AnimalDecorator(Animal decoratedAnimal) {
        this.decoratedAnimal = decoratedAnimal;
    }

    @Override
    public void makeSound() {
        decoratedAnimal.makeSound();
    }
}
class FlyingAnimalDecorator extends AnimalDecorator {
    public FlyingAnimalDecorator(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }

    @Override
    public void makeSound() {
        decoratedAnimal.makeSound();
        fly();
    }

    public void fly() {
        System.out.println("Flying!");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Animal flyingDog = new FlyingAnimalDecorator(dog);
        Animal flyingCat = new FlyingAnimalDecorator(cat);

        dog.makeSound();        // Output: Woof!
        cat.makeSound();        // Output: Meow!
        flyingDog.makeSound();  // Output: Woof! Flying!
        flyingCat.makeSound();  // Output: Meow! Flying!
    }
}

/*
Паттерны создания:

Фабричный метод (Factory Method)
Абстрактная фабрика (Abstract Factory)
Одиночка (Singleton)
Строитель (Builder)
Прототип (Prototype)
Паттерны структуры:

Адаптер (Adapter)
Декоратор (Decorator)
Фасад (Facade)
Компоновщик (Composite)
Заместитель (Proxy)
Паттерны поведения:

Наблюдатель (Observer)
Стратегия (Strategy)
Итератор (Iterator)
Состояние (State)
Цепочка обязанностей (Chain of Responsibility)
 */