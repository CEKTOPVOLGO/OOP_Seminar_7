package Task2;


// Интерфейс для создания продукта
interface Product {
    void use();
}

// Конкретный продукт
class ConcreteProduct implements Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProduct");
    }
}

// Фабричный метод, который возвращает экземпляр продукта
class Creator {
    static Product createProduct() {
        return new ConcreteProduct();
    }
}

// Пример использования
public class Main2 {
    public static void main(String[] args) {
        Product product = Creator.createProduct();
        product.use();
    }
}