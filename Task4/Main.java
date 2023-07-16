package Task4;


// Интерфейс для создания животных
interface Animal {
    void sound();
}

// Конкретные реализации животных
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

// Фабричный метод, который возвращает экземпляр животного
class AnimalFactory {
    static Animal createAnimal(String type) {
        if (type.equals("Dog")) {
            return new Dog();
        } else if (type.equals("Cat")) {
            return new Cat();
        }
        return null;
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("Dog");
        dog.sound(); // Output: "Woof!"

        Animal cat = AnimalFactory.createAnimal("Cat");
        cat.sound(); // Output: "Meow!"
    }
}