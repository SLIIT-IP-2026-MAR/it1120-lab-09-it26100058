import java.util.Scanner;

public class IT26100058Lab9Q4 {


    public static double calcFinalMark(double assignment, double exam) {

        double finalMark;

        finalMark = (assignment * 0.30) + (exam * 0.70);

        return finalMark;
    }


    public static String findGrades(double mark) {


        if(mark >= 75)
            return "A";

        else if(mark >= 65)
            return "B";

        else if(mark >= 55)
            return "C";

        else if(mark >= 45)
            return "D";

        else
            return "F";
    }


    public static void printDetails(String name, double mark, String grade) {

        System.out.println("Name : " + name);
        System.out.println("Final Mark : " + mark);
        System.out.println("Grade : " + grade);

        System.out.println("----------------");
    }



    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        for(int i=1; i<=5; i++) {


            System.out.print("Enter student name: ");
            String name = input.next();


            System.out.print("Enter assignment mark: ");
            double assignment = input.nextDouble();


            System.out.print("Enter exam mark: ");
            double exam = input.nextDouble();



            double finalMark = calcFinalMark(assignment, exam);


            String grade = findGrades(finalMark);



            printDetails(name, finalMark, grade);

        }


        input.close();

    }
}