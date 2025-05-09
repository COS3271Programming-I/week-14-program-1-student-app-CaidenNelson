import java.util.Scanner;

class student extends person{
    static Scanner userinput = new Scanner(System.in);
    String major;
    String classRank;
    String email;

    static String goToClass() {
        String classroom;
        System.out.println("What class would you like to go to?");
        classroom = userinput.nextLine();

        return ("Going to " + classroom + "Class");
    }

    @Override public String food(){
        System.out.println("What are you going to eat");
        String eating = userinput.nextLine();

        return ("Eating " + eating);
    }

}


public class StudentInfo {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
        student student = new student();
        int userdata;


        System.out.println("What is your student's first name?");
        student.firstName = userinput.nextLine();

        System.out.println("What is your student's last name?");
        student.lastName = userinput.nextLine();

        System.out.println("What is your student's gender?");
        student.gender = userinput.nextLine();

        System.out.println("What is your student's ethnicity?");
        student.ethnicity = userinput.nextLine();

        System.out.println("What is your student's religion?");
        student.religion = userinput.nextLine();

        System.out.println("What is your student's age?");
        student.age = userinput.nextInt();

        System.out.println("What is your student's weight?");
        student.weight = userinput.nextInt();

        System.out.println("What is your student's height?");
        student.height = userinput.nextInt();

        System.out.println("What is your student's major?");
        student.major = userinput.nextLine();
        student.major = userinput.nextLine();



        System.out.println("What is your student's class rank? Freshman, Sophomore etc");
        student.classRank = userinput.nextLine();

        System.out.println("What is your student's email?");
        student.email = userinput.nextLine();



        System.out.println("Type 1 to say a greeting. Type 2 to say a prayer. Type 3 to take a nap." +
                "Type 4 to eat food. Type 5 to see the name. Type 6 to change religion. Type 7 to see the major."+
                "Type 8 to see the class rank. Type 9 to see the student email");
        userdata = userinput.nextInt();

        if(userdata == 1 ){
            System.out.println(student.greeting());
        }
        if(userdata == 2 ){
            System.out.println(student.pray());
        }
        if(userdata == 3 ){
            System.out.println(student.nap());
        }
        if(userdata == 4 ){
            System.out.println(student.food());
        }
        if(userdata == 5 ){
            System.out.println( student.namePrint(student.firstName +" "+ student.lastName));
        }
        if(userdata == 6 ){
            System.out.println(student.religionChange());
        }
        if(userdata == 7 ){
            System.out.println(student.major);
        }
        if(userdata == 8 ){
            System.out.println(student.classRank);
        }
        if(userdata == 9 ){
            System.out.println(student.email);
        }

    }
}
