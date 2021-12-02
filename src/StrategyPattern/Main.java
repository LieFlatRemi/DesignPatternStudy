package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Duck d1 = new WildDuck();
        Duck d2 = new PekingDuck();
        Duck d3 = new PsyDuck();
        behave(d1);
        behave(d2);
        behave(d3);
    }

    public static void behave(Duck duck){
        duck.display();
        duck.surf();
        duck.roar();
        duck.fly();
    }
}
