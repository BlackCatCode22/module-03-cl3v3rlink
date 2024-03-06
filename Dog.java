public class Dog {

    public static final int MAX_LIVES = 1;
    private static int DogCount = 0;
    String name;
    static String type;
    int age;
    int livingsRemaining;
    static String howmanyiown;


    public void bark(){
        System.out.println("Bark");}
    public  Dog () {
        DogCount++;
        livingsRemaining = MAX_LIVES;
    }
    public static int getDogCount(){

        return DogCount;
    }
}
