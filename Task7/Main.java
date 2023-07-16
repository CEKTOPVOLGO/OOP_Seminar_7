package Task7;

public class Main {
    public static void main(String[] args) {
        Animal cat = Animal.getInstance("Cat");
        cat.speak(); // Output: Cat is speaking.

        Animal dog = Animal.getInstance("Dog");
        dog.speak(); // Output: Cat is speaking. (один и тот же экземпляр)
    }
}
