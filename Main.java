public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());
    Cat myCat = new Cat();
    myCat.meow();
    myCat.name = "yo";
    myCat.age = 7;

    System.out.println(Cat.MAX_LIVES);
    System.out.println(Cat.getCatCount());
    }
}