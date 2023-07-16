package Task7;


public class Animal {
    private static Animal instance;
    private String name;

    private Animal(String name) {
        this.name = name;
    }

    public static Animal getInstance(String name) {
        if (instance == null) {
            instance = new Animal(name);
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " is speaking.");
    }
}