package Task3;


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

// Неправильная реализация фабричного метода
class Creator {
    static Product createProduct(String type) {
        if (type.equals("ConcreteProduct")) {
            return new ConcreteProduct();
        }
        return null;
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Product product = Creator.createProduct("ConcreteProduct");
        product.use();
    }
}