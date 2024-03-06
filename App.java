
public class App {
    public static void main(String[] args) {
        // Creating  a student object
        Student mystudent = new Student();
        mystudent.firstName = "bo";
        mystudent.lastName = "jackson";
        mystudent.major = "music";
        mystudent.gpa = "3.0";
        mystudent.age = "25";
        mystudent.onprobation = "false";


        Student mystudent2 = new Student();
        mystudent2.firstName = "yao";
        mystudent2.lastName = "ming";
        mystudent2.major = "music";
        mystudent2.gpa = "2.0";
        mystudent2.age = "23";
        mystudent2.onprobation = "true";

       System.out.println(mystudent.gpa);
        System.out.println(mystudent.firstName);
        System.out.println(mystudent.lastName);
        System.out.println(mystudent2.lastName);
        System.out.println(mystudent2.firstName);
        System.out.println(mystudent2.gpa);
        System.out.println(mystudent2.onprobation);

    }
}