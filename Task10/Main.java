package Task10;

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
class WildAnimal {
    public void roar() {
        System.out.println("Roar!");
    }
}

class WildAnimalAdapter implements Animal {
    private WildAnimal wildAnimal;

    public WildAnimalAdapter(WildAnimal wildAnimal) {
        this.wildAnimal = wildAnimal;
    }

    @Override
    public void makeSound() {
        wildAnimal.roar();
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        WildAnimal wildAnimal = new WildAnimal();
        Animal wildAnimalAdapter = new WildAnimalAdapter(wildAnimal);

        dog.makeSound();  // Output: Woof!
        cat.makeSound();  // Output: Meow!
        wildAnimalAdapter.makeSound();  // Output: Roar!
    }
}