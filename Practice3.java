package Week_3_day4;

interface BasicAnimal {
    void eats();
    void sleeps();
}

abstract class Monkey {
    abstract void jump();
    abstract void bite();
}

class Human extends Monkey implements BasicAnimal {
    @Override
    void jump() {
        System.out.println("Human is jumping");
    }

    @Override
    void bite() {
        System.out.println("Human is biting");
    }

    @Override
    public void eats() {
        System.out.println("Human is eating");
    }

    @Override
    public void sleeps() {
        System.out.println("Human is sleeping");
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Human human = new Human();
        human.jump();
        human.bite();
        human.eats();
        human.sleeps();
    }
}

