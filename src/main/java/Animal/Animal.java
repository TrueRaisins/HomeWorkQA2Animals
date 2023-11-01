package Animal;
public abstract class Animal {
    abstract void move();
}
class Cat extends Animal {
    void move() {

        System.out.println("Я побежал");
    }
}
class Fish extends Animal {
    void move() {

        System.out.println("я поплыла");
    }
}
class Duck extends Animal {
    void move() {

        System.out.println("Я полетела");
    }
}

