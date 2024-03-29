import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {
        //Ask how many new users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);

        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create n number of new Students
        for(int n = 0; n<numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n = 0; n<numOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
