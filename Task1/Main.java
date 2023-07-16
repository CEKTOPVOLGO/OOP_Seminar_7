/*
package Task1;


// Интерфейс для создания продукта
interface Product {
    void use();
}

// Конкретный продукт
class ConcreteProduct implements Task2.Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProduct");
    }
}

// Абстрактный класс-создатель
abstract class Creator {
    // Фабричный метод, который возвращает экземпляр продукта
    abstract Task2.Product createProduct();

    // Метод, который использует продукт
    void useProduct() {
        Task2.Product product = createProduct();
        product.use();
    }
}

// Конкретный класс-создатель
class ConcreteCreator extends Task2.Creator {
    @Override
    Task2.Product createProduct() {
        return new Task2.ConcreteProduct();
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Task2.Creator creator = new ConcreteCreator();
        creator.useProduct();
    }
}*/
