package Task6;

// Интерфейс для создания животных
interface Animal {
    void sound();
}

// Конкретная реализация животного - собака
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Конкретная реализация животного - кошка
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Интерфейс для создания фабрики животных
interface AnimalFactory {
    Animal createAnimal();
}

// Фабрика животных для создания собаки
class DogFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Dog();
    }
}

// Фабрика животных для создания кошки
class CatFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Cat();
    }
}

// Класс, использующий фабрику для создания животных
class AnimalShelter {
    private AnimalFactory animalFactory;

    public AnimalShelter(AnimalFactory animalFactory) {
        this.animalFactory = animalFactory;
    }

    public void introduceAnimal() {
        Animal animal = animalFactory.createAnimal();
        animal.sound();
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        AnimalShelter dogShelter = new AnimalShelter(dogFactory);
        dogShelter.introduceAnimal();

        AnimalFactory catFactory = new CatFactory();
        AnimalShelter catShelter = new AnimalShelter(catFactory);
        catShelter.introduceAnimal();
    }
}