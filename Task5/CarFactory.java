package Task5;

interface CarFactory {
    Engine createEngine();
    Color createColor();
    Interior createInterior();
}
interface Engine {
    void start();
}

interface Color {
    void paint();
}

interface Interior {
    void furnish();
}

class FamilyEngine implements Engine {
    public void start() {
        System.out.println("Starting family engine");
    }
}

class FamilyColor implements Color {
    public void paint() {
        System.out.println("Painting family color");
    }
}

class FamilyInterior implements Interior {
    public void furnish() {
        System.out.println("Furnishing family interior");
    }
}

class SportsEngine implements Engine {
    public void start() {
        System.out.println("Starting sports engine");
    }
}

class SportsColor implements Color {
    public void paint() {
        System.out.println("Painting sports color");
    }
}

class SportsInterior implements Interior {
    public void furnish() {
        System.out.println("Furnishing sports interior");
    }
}
