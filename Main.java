public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.getDogCount());
        Dog myDog = new Dog();
        myDog.bark();
        myDog.name = "shadow";
        myDog.age = 2;
        myDog.type = "Pitbull";
        myDog.howmanyiown = "two";

        Dog myDog2 = new Dog();
        myDog2.bark();
        myDog2.name = "puffy";
        myDog2.age = 4;
        myDog2.type = "Poodle";
        myDog2.howmanyiown = "three";

        System.out.println(Dog.MAX_LIVES);
        System.out.println(Dog.getDogCount());
        System.out.println(Dog.type);
        System.out.println(Dog.howmanyiown);
        System.out.println(myDog2.name);
        System.out.println(myDog.name);
        System.out.println(myDog2.age);
    }
}