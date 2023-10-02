package v6_3_polymorphism;

public class Animal_Main {
    public static void main(String[] args) {
        Animal a;

        a = new Animal();
        a.WhoIAm();

        a = new Dog();
        a.WhoIAm();

        a = new Cat();
        a.WhoIAm();

    }
}
